package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},//buraya future files in path i verilecek
        glue = {"StepDefinitions"}//StepDefinitions in klosoru yaziliyor
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
