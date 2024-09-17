package tests;

import org.testng.annotations.Test;
import pages.CalculatorPage;

public class RetirementCalculatorTests {

    @Test
    public void testCalculateRetirement() {
        CalculatorPage calculatorPage = new CalculatorPage();
        calculatorPage.fillFirstForm("30", "50", "100000", "80000", "10000", "5000","2000");
        calculatorPage.clickSubmit();

    }
}
