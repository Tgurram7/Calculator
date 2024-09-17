package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage {
    WebDriver driver;

    public CalculatorPage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//input[@id='current-age']")
    WebElement currentAge;
    @FindBy(xpath = "//input[@id='retirement-age']")
    WebElement retirementAge;
    @FindBy(xpath = "//input[@id='current-income']")
    WebElement currentIncome;
    @FindBy(xpath = "//input[@id='spouse-income']")
    WebElement spouseIncome;
    @FindBy(xpath = "//input[@id='current-total-savings']")
    WebElement currentSavings;
    @FindBy(xpath = "//input[@id='current-total-savings']")
    WebElement retirementContribution;
    @FindBy(xpath = "//input[@id='savings-increase-rate']")
    WebElement annualIncrease;
   @FindBy(xpath = "//label[@for='yes-social-benefits']")
      WebElement socialSecurityToggleYES;
//    @FindBy(id = "relationship-status") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement relationshipStatus;
//    @FindBy(id = "social-security-override") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement socialSecurityOverride;
//    @FindBy(id = "additional-income") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement additionalIncome;
//    @FindBy(id = "retirement-years") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement retirementYears;
//    @FindBy(id = "income-inflation-toggle") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement inflationToggle;
//    @FindBy(id = "final-income-percent") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement finalIncomePercent;
//    @FindBy(id = "pre-retirement-return") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement preRetirementReturn;
//    @FindBy(id = "post-retirement-return") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement postRetirementReturn;
    @FindBy(xpath = "//button[normalize-space()='Calculate']")
    WebElement submitButton;
    @FindBy(xpath = "//button[normalize-space()='Clear form']")
    WebElement clearButton;

//    @FindBy(id = "update-values") @FindBy(xpath = "//input[@id='retirement-age']")
//    WebElement updateValuesButton;

    // Actions
    public void fillForm(String age, String retireAge, String income, String spouseIncome,
                         String savings, String contribution, String increase) {
        currentAge.sendKeys(age);
        retirementAge.sendKeys(retireAge);
        currentIncome.sendKeys(income);
        this.spouseIncome.sendKeys(spouseIncome);
        currentSavings.sendKeys(savings);
        retirementContribution.sendKeys(contribution);
        annualIncrease.sendKeys(increase);
//        toggleSocialSecurity(ssIncome);
//        selectRelationshipStatus(relationship);
//        socialSecurityOverride.sendKeys(override);
//        additionalIncome.sendKeys(addIncome);
//        retirementYears.sendKeys(retireYears);
//        toggleInflation(inflation);
//        finalIncomePercent.sendKeys(finalIncome);
//        preRetirementReturn.sendKeys(preReturn);
//        postRetirementReturn.sendKeys(postReturn);
    }

    public void fillFirstForm(String age, String retireAge, String income, String spouseIncome,
                         String savings, String contribution, String increase) {
        currentAge.sendKeys(age);
        retirementAge.sendKeys(retireAge);
        currentIncome.sendKeys(income);
        this.spouseIncome.sendKeys(spouseIncome);
        currentSavings.sendKeys(savings);
        retirementContribution.sendKeys(contribution);
        annualIncrease.sendKeys(increase);
    }

//    public void toggleSocialSecurity(String ssIncome) {
//        if(ssIncome.equalsIgnoreCase("Yes") && !socialSecurityToggle.isSelected()) {
//            socialSecurityToggle.click();
//        } else if(ssIncome.equalsIgnoreCase("No") && socialSecurityToggle.isSelected()) {
//            socialSecurityToggle.click();
//        }
//    }
//
//    public void toggleInflation(String inflation) {
//        if(inflation.equalsIgnoreCase("Yes") && !inflationToggle.isSelected()) {
//            inflationToggle.click();
//        } else if(inflation.equalsIgnoreCase("No") && inflationToggle.isSelected()) {
//            inflationToggle.click();
//        }
//    }
//
//    public void selectRelationshipStatus(String status) {
//        Select relationshipDropdown = new Select(relationshipStatus);
//        relationshipDropdown.selectByVisibleText(status);
//    }
//
    public void clickSubmit() {
        submitButton.click();
    }
//
//    public void clickUpdateValues() {
//        updateValuesButton.click();
    }

