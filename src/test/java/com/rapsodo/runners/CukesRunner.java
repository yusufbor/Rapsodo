package com.rapsodo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/rapsodo/stepDefinitions",
        dryRun = false,
        tags = ""
)
public class CukesRunner {
}
