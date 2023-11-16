package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SubcribePage;
import utils.DataProviderTest;

public class SubcribeTests extends BaseTests{

    @Test(dataProvider = "test-data-with-addon", dataProviderClass = DataProviderTest.class)
    public void ICanSubcribeWithAddOnTest(String country, String plan, String email, String password, String planPrice, String totalPrice) {
        subcribePage.ClickChooseCountryLink()
                .selectCountry(country)
                .selectPlan(plan)
                .clickBtnChoosePaymentMethod()
                .addAddonFighting()
                .addAddonFightingSpirit()
                .clickBtnChooseAddonsLink()
                .enterEmail(email)
                .enterPassword(password);

        Assert.assertEquals(subcribePage.getPlanPrice(),planPrice);
        Assert.assertEquals(subcribePage.getTotalPrice(),totalPrice);
    }

    @Test(dataProvider = "test-data-without-addon", dataProviderClass = DataProviderTest.class)
    public void ICanSubcribeWithoutAddOnTest(String country, String plan, String email, String password, String planPrice, String totalPrice) {
        subcribePage.ClickChooseCountryLink()
                .selectCountry(country)
                .selectPlan(plan)
                .clickBtnChoosePaymentMethod()
                .clickBtnChooseAddonsLink()
                .enterEmail(email)
                .enterPassword(password);

        Assert.assertEquals(subcribePage.getPlanPrice(),planPrice);
        Assert.assertEquals(subcribePage.getTotalPrice(),totalPrice);
    }
}
