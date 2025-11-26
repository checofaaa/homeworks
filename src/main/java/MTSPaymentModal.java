import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MTSPaymentModal {
    final WebDriver driver;
    final WebDriverWait wait;

    By paymentIframeLocator = By.className("bepaid-iframe");
    By modalContainerLocator = By.xpath("//div[contains(@class, 'payment-page__container')]");

    final By phoneTextLocator = By.xpath("//div[contains(@class,'pay-description__text')]//span");
    final By amountTextLocator = By.xpath("//div[contains(@class,'pay-description__cost')]//span");
    final By payButtonLocator = By.xpath("//button[contains(.,'Оплатить')]");

    final By cardNumberFieldLocator = By.xpath("//label[contains(text(),'Номер карты')]");
    final By expiryFieldLocator = By.xpath("//label[contains(text(),'Срок действия')]");
    final By cvcFieldLocator = By.xpath("//label[contains(text(),'CVC')]");
    final By holderNameFieldLocator = By.xpath("//label[contains(text(),'Имя и фамилия на карте')]");

    final By visaLogoLocator = By.xpath("//img[contains(@src,'visa-system')]");
    final By mcLogoLocator = By.xpath("//img[contains(@src,'mastercard-system') or contains(@src,'mc_')]");
    final By belkartLogoLocator = By.xpath("//img[contains(@src,'belkart-system')]");
    final By maestroLogoLocator = By.xpath("//img[contains(@src,'maestro-system')]");
    final By mirLogoLocator = By.xpath("//img[contains(@src,'mir-system')]");

    public MTSPaymentModal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToPaymentFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframeLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalContainerLocator));
    }

    public String getPhoneTextLocator() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneTextLocator)).getText();
    }

    public String getAmountTextLocator() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amountTextLocator)).getText();
    }

    public String getPayButtonText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(payButtonLocator)).getText();
    }

    public String getCardNumberPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberFieldLocator))
                .getText();
    }

    public String getExpiryPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(expiryFieldLocator))
                .getText();
    }

    public String getCvcPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cvcFieldLocator))
                .getText();
    }

    public String getHolderNamePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(holderNameFieldLocator))
                .getText();
    }

    public boolean arePaymentLogosVisible() {
        return driver.findElement(visaLogoLocator).isDisplayed()
                && driver.findElement(mcLogoLocator).isDisplayed()
                && driver.findElement(belkartLogoLocator).isDisplayed()
                && (driver.findElement(maestroLogoLocator).isDisplayed() || driver.findElement(mirLogoLocator).isDisplayed());
    }
}
