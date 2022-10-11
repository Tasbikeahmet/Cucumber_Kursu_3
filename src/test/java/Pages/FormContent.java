package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    @FindBy (xpath = "//ms-text-field[@id='ms-text-field-3']/input")
    private WebElement emp_F_Name;
    @FindBy (xpath = "//ms-text-field[@id='ms-text-field-4']/input")
    private WebElement emp_L_Name;
    @FindBy (xpath = "//mat-select[@formcontrolname='gender']/div/div/div")
    private WebElement gender;
    @FindBy (xpath = "//span[contains(text(),'Male')]")
    private WebElement genderMale;
    @FindBy (xpath = "//span[contains(text(),'Female')]")
    private WebElement genderFemale;
    @FindBy (xpath = "(//span[contains(text(),'Employee Type')])[1]")
    private WebElement EmployeeType;
    @FindBy (xpath = "(//span[contains(text(),'Teacher')])[3]")
    private WebElement Teacher;
    @FindBy (xpath = "//span[contains(text(),'Supervisor')]")
    private WebElement Supervisor;
    @FindBy (xpath = "//span[contains(text(),'Other')]")
    private WebElement Other;
    @FindBy (id = "mat-input-5")
    private WebElement EmpId;
    @FindBy (id = "mat-select-value-21")
    private WebElement qualification;
    @FindBy (id = "mat-select-22")
    private WebElement dokumentType;
    @FindBy (xpath = "//span[contains(text(),'Passport')]")
    private WebElement Passport;
    @FindBy (id = "mat-input-6")
    private WebElement dokumentNumber;
    @FindBy (xpath = "//span[contains(text(),'Master')]")
    private WebElement Master;
    @FindBy (id = "mat-input-19")
    private WebElement Country;
    @FindBy (xpath = "//div [contains(text(),'Contact & Address')]")
    private WebElement address;


    WebElement myElement;

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "academicPeriod" : myElement =academicPeriod; break;
            case "academicPeriod1" : myElement =academicPeriod1; break;
            case "gradeLevel" : myElement =gradeLevel; break;
            case "gradeLevel2" : myElement =gradeLevel2; break;
            case "gender" : myElement =gender; break;
            case "genderMale" : myElement =genderMale; break;
            case "genderFemale" : myElement =genderFemale; break;
            case "EmployeeType" : myElement =EmployeeType; break;
            case "Teacher" : myElement =Teacher; break;
            case "Supervisor" : myElement =Supervisor; break;
            case "Other" : myElement =Other; break;
            case "qualification" : myElement =qualification; break;
            case "dokumentType" : myElement =dokumentType; break;
            case "Passport" : myElement =Passport; break;
            case "Master" : myElement =Master; break;
            case "address" : myElement =address; break;
            case "Country" : myElement =Country; break;



        }

        clickFunction(myElement);

    }
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "emp_F_Name" : myElement =emp_F_Name; break;
            case "emp_L_Name" : myElement =emp_L_Name; break;
            case "EmpId" : myElement =EmpId; break;
            case "dokumentNumber" : myElement =dokumentNumber; break;
            case "Country" : myElement =Country; break;

        }

        sendKeysFunction(myElement, value);
    }




}

