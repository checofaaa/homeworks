import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MTSOnlinePaymentSection {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String baseURL = "https://www.mts.by/";

    final By blockTitleLocator = By.xpath("//h2[contains(text(),'Онлайн пополнение')]");

    final By buttonPaymentTypes = By.xpath("//button[contains(@class,'select__header')]");

    final By tabServicesLocator = By.xpath("//p[@class='select__option' and text()='Услуги связи']");
    final By tabHomeInternetLocator = By.xpath("//p[@class='select__option' and text()='Домашний интернет']");
    final By tabInstallmentLocator = By.xpath("//p[@class='select__option' and text()='Рассрочка']");
    final By tabDebtLocator = By.xpath("//p[@class='select__option' and text()='Задолженность']");

    final By servicesPhoneFieldLocator = By.id("connection-phone");
    final By servicesAmountFieldLocator = By.id("connection-sum");
    final By servicesEmailFieldLocator = By.id("connection-email");

    final By internetPhoneFieldLocator = By.id("internet-phone");
    final By internetAmountFieldLocator = By.id("internet-sum");
    final By internetEmailFieldLocator = By.id("internet-email");

    final By installmentPhoneFieldLocator = By.id("score-instalment");
    final By installmentAmountFieldLocator = By.id("instalment-sum");
    final By installmentEmailFieldLocator = By.id("instalment-email");

    final By debtPhoneFieldLocator = By.id("score-arrears");
    final By debtAmountFieldLocator = By.id("arrears-sum");
    final By debtEmailFieldLocator = By.id("arrears-email");

    final By continueButtonLocator = By.xpath("//form[contains(@class, 'pay-form opened')]//button[contains(@class, 'button__default')]"
    );

    final By moreInfoLinkLocator = By.linkText("Подробнее о сервисе");

    public MTSOnlinePaymentSection(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }

    public void open() {
        driver.get(baseURL);
    }


    public String getBlockTitleText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(blockTitleLocator)).getText();
    }

    public boolean arePaymentLogosDisplayed() {
        WebElement visa = driver.findElement(By.xpath(".//img[contains(@src,'visa')]"));
        WebElement verifiedByVisa = driver.findElement(By.xpath(".//img[contains(@src,'visa-verified')]"));
        WebElement mastercard = driver.findElement(By.xpath(".//img[contains(@src,'mastercard')]"));
        WebElement mastercardSC = driver.findElement(By.xpath(".//img[contains(@src,'mastercard-secure')]"));
        WebElement belkart = driver.findElement(By.xpath(".//img[contains(@src,'belkart')]"));

        return visa.isDisplayed() &&
               verifiedByVisa.isDisplayed() &&
               mastercard.isDisplayed() &&
               mastercardSC.isDisplayed() &&
               belkart.isDisplayed();
    }

    public void clickMoreInfo() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(moreInfoLinkLocator));
        link.click();
    }


    private void selectPaymentType(By optionLocator) {
        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(buttonPaymentTypes));
        dropdownButton.click();

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionLocator));
        option.click();
    }

    public void openServicesTab() {
        selectPaymentType(tabServicesLocator);
    }

    public void openHomeInternetTab() {
        selectPaymentType(tabHomeInternetLocator);
    }

    public void openInstallmentTab() {
        selectPaymentType(tabInstallmentLocator);
    }

    public void openDebtTab() {
        selectPaymentType(tabDebtLocator);
    }

    public String getServicesPhonePlaceholder() {
        openServicesTab();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(servicesPhoneFieldLocator))
                .getAttribute("placeholder");
    }

    public String getServicesAmountPlaceholder() {
        return driver.findElement(servicesAmountFieldLocator).getAttribute("placeholder");
    }

    public String getServicesEmailPlaceholder() {
        return driver.findElement(servicesEmailFieldLocator).getAttribute("placeholder");
    }

    public String getInternetPhonePlaceholder() {
        openHomeInternetTab();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(internetPhoneFieldLocator))
                .getAttribute("placeholder");
    }

    public String getInternetAmountPlaceholder() {
        return driver.findElement(internetAmountFieldLocator).getAttribute("placeholder");
    }

    public String getInternetEmailPlaceholder() {
        return driver.findElement(internetEmailFieldLocator).getAttribute("placeholder");
    }

    public String getInstallmentPhonePlaceholder() {
        openInstallmentTab();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(installmentPhoneFieldLocator))
                .getAttribute("placeholder");
    }

    public String getInstallmentAmountPlaceholder() {
        return driver.findElement(installmentAmountFieldLocator).getAttribute("placeholder");
    }

    public String getInstallmentEmailPlaceholder() {
        return driver.findElement(installmentEmailFieldLocator).getAttribute("placeholder");
    }

    public String getDebtPhonePlaceholder() {
        openDebtTab();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(debtPhoneFieldLocator))
                .getAttribute("placeholder");
    }

    public String getDebtAmountPlaceholder() {
        return driver.findElement(debtAmountFieldLocator).getAttribute("placeholder");
    }

    public String getDebtEmailPlaceholder() {
        return driver.findElement(debtEmailFieldLocator).getAttribute("placeholder");
    }

    public void fillServicesForm(String phone, String amount, String email) {
        openServicesTab();

        WebElement phoneField = wait.until(ExpectedConditions.elementToBeClickable(servicesPhoneFieldLocator));
        phoneField.clear();
        phoneField.sendKeys(phone);

        WebElement amountFieldEl = driver.findElement(servicesAmountFieldLocator);
        amountFieldEl.clear();
        amountFieldEl.sendKeys(amount);

        if (email != null) {
            WebElement emailFieldEl = driver.findElement(servicesEmailFieldLocator);
            emailFieldEl.clear();
            emailFieldEl.sendKeys(email);
        }
    }

    public void clickContinue() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(continueButtonLocator));
        btn.click();
    }
}

