package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(//or oldugunda taglardan her hangi bir tanesi varsa senaryoyu caistirir
        //and oldugunda her iki taginda oldugu senaryolari calistirir
        tags = "@Regression and @SmokeTest",//hangi senaryoda bu etiket varsa onlar calisacak
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
