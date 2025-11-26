import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class MTSOnlinePaymentTest {
    private WebDriver driver;
    private MTSOnlinePaymentSection paymentSection;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        paymentSection = new MTSOnlinePaymentSection(driver);
        paymentSection.open();

        driver.findElement(By.className("cookie__ok")).click();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    void testBlockTitle() {
        assertEquals("Онлайн пополнение\nбез комиссии", paymentSection.getBlockTitleText());
    }

    @Test
    void testPaymentLogos() {
        assertTrue(paymentSection.arePaymentLogosDisplayed());
    }

    @Test
    void testMoreInfoLink() {
        paymentSection.clickMoreInfo();

        assertNotNull(driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
    }



    @Test
    void testPlaceholdersForAllPaymentTypes() {
        assertEquals("Номер телефона", paymentSection.getServicesPhonePlaceholder());
        assertEquals("Сумма", paymentSection.getServicesAmountPlaceholder());
        assertEquals("E-mail для отправки чека", paymentSection.getServicesEmailPlaceholder());

        assertEquals("Номер абонента", paymentSection.getInternetPhonePlaceholder());
        assertEquals("Сумма", paymentSection.getInternetAmountPlaceholder());
        assertEquals("E-mail для отправки чека", paymentSection.getInternetEmailPlaceholder());

        assertEquals("Номер счета на 44", paymentSection.getInstallmentPhonePlaceholder());
        assertEquals("Сумма", paymentSection.getInstallmentAmountPlaceholder());
        assertEquals("E-mail для отправки чека", paymentSection.getInstallmentEmailPlaceholder());

        assertEquals("Номер счета на 2073", paymentSection.getDebtPhonePlaceholder());
        assertEquals("Сумма", paymentSection.getDebtAmountPlaceholder());
        assertEquals("E-mail для отправки чека", paymentSection.getDebtEmailPlaceholder());
    }

    @Test
    void testServicesPaymentModal() {
        String phone = "297777777";
        String amount = "15";
        String email = "test@test.com";

        paymentSection.fillServicesForm(phone, amount, email);
        paymentSection.clickContinue();

        MTSPaymentModal modalPage = new MTSPaymentModal(driver);
        modalPage.switchToPaymentFrame();

        String phoneText = modalPage.getPhoneTextLocator();
        assertTrue(phoneText.contains("297777777"));

        String amountText = modalPage.getAmountTextLocator();
        assertTrue(amountText.contains("15"));

        String payButtonText = modalPage.getPayButtonText();
        assertTrue(payButtonText.contains("15"));

        assertTrue(modalPage.getCardNumberPlaceholder().toLowerCase().contains("номер карты"));
        assertTrue(modalPage.getExpiryPlaceholder().toLowerCase().contains("срок действия"));
        assertTrue(modalPage.getCvcPlaceholder().toLowerCase().contains("cvc"));
        assertTrue(modalPage.getHolderNamePlaceholder().toLowerCase().contains("имя и фамилия на карте"));

        assertTrue(modalPage.arePaymentLogosVisible());
    }
}
