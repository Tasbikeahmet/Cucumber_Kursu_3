package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.When;

public class HumanAttestationsSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @When("Admin User should be able to Add Attestations")
    public void adminUserShouldBeAbleToAddAttestations() {

        ln.findAndClick("HumanResources");
        ln.findAndClick("HumanResources_Setup");
        ln.findAndClick("HumanResources_Setup_Attestations");

        dc.findAndClick("addButton");



    }
}
