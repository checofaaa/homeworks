import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class MTSOnlinePaymentTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(
                By.xpath("//h2[contains(text(),'Онлайн пополнение')]")
        );

        assertTrue(blockTitle.isDisplayed());
        assertEquals("Онлайн пополнение\n" +
                "без комиссии", blockTitle.getText());
    }


    @Test
    public void testPaymentLogos() {
        WebElement visa = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]//img[contains(@src,'visa')]"));
        WebElement verifiedByVisa = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]//img[contains(@src,'visa-verified')]"));
        WebElement mastercard = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]//img[contains(@src,'mastercard')]"));
        WebElement mastercardSC = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]//img[contains(@src,'mastercard-secure')]"));
        WebElement belkart = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]//img[contains(@src,'belkart')]"));

        assertTrue(visa.isDisplayed());
        assertTrue(verifiedByVisa.isDisplayed());
        assertTrue(mastercard.isDisplayed());
        assertTrue(mastercardSC.isDisplayed());
        assertTrue(belkart.isDisplayed());
    }


    @Test
    public void testMoreInfoLink() {
        driver.findElement(By.className("cookie__ok")).click();

        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));

        moreInfoLink.click();
        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
    }

    @Test
    public void testFormContinue() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(6));

        driver.findElement(By.className("cookie__ok")).click();

        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        WebElement amountField = driver.findElement(By.id("connection-sum"));
        WebElement nextButton = driver.findElement(By.xpath("//form[contains(@class, 'pay-form opened')]//button[contains(@class, 'button button__default')]"));

        phoneField.click();
        phoneField.sendKeys("297777777");

        amountField.click();
        amountField.sendKeys("15");

        nextButton.click();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        WebElement modalContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'payment-page__container')]")));

        assertTrue(modalContent.isDisplayed());
    }
}
