package org.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org/steps"},
//        strict=true,
        dryRun = false,
       tags="@regression or ~@smoketest"

)

public class TestRunner {

}
