package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubcribePage {

    protected final WebDriver driver;

    @FindBy(className = "country-current")
    WebElement chooseCountryLink;

    By orderTierPrice = By.xpath("//span[@id='order-tier-price']/b");

    By orderTotalPrice = By.xpath("//span[@id='order-total-price']/b");
    public SubcribePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SubcribePage selectCountry(String country){
        WebElement countryLink = driver.findElement(By.id(country));
        countryLink.click();
        return this;
    }

    public SubcribePage selectPlan(String plan){
        WebElement planLink = driver.findElement(By.id(plan + "-selection"));
        planLink.click();
        return this;
    }


    public SubcribePage clickBtnChoosePaymentMethod(){
        WebElement btnChoosePaymentMethodLink = driver.findElement(By.id("btnChoosePaymentMethod"));
        btnChoosePaymentMethodLink.click();
        return this;
    }

    public SubcribePage clickBtnChooseAddonsLink(){
        WebElement btnChooseAddonsLink = driver.findElement(By.id("btnChooseAddons"));
        btnChooseAddonsLink.click();
        return this;
    }

    public SubcribePage addAddonFightingSpirit(){
        WebElement fightingCheckbox = driver.findElement(By.xpath("//input[@name='FIGHTING_SPIRIT_SUBSCRIPTION']/parent::label"));
        fightingCheckbox.click();
        return this;
    }

    public SubcribePage addAddonFighting(){
        WebElement fightingCheckbox = driver.findElement(By.xpath("//input[@name='FIGHT_SUBSCRIPTION']/parent::label"));
        fightingCheckbox.click();
        return this;
    }

    public SubcribePage clickBtnFinalStepSubscribe(){
        WebElement fightingCheckbox = driver.findElement(By.id("btnFinalStepSubscribe"));
        fightingCheckbox.click();
        return this;
    }

    public SubcribePage ClickChooseCountryLink(){
        chooseCountryLink.click();
        return this;
    }

    public SubcribePage enterEmail(String email){
        WebElement emailField = driver.findElement(By.id("readonlyEmail"));
        emailField.sendKeys(email);
        return this;
    }

    public SubcribePage enterPassword(String password){
        WebElement emailField = driver.findElement(By.id("readonlyPassword"));
        emailField.sendKeys(password);
        return this;
    }

    public String getPlanPrice(){
        String price = driver.findElement(orderTierPrice).getText();
        return price;
    }

    public String getTotalPrice(){
        String price = driver.findElement(orderTotalPrice).getText();
        return price;
    }

}
