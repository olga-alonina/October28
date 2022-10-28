package com.dotdash.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)                                        // coming from jUnit, cucumber does not have this. This engine provided by jUnit. Cucumber will read Login.feature and will execute as a test.
@CucumberOptions(
        plugin = "html:target/html-reports",
        features = "src/test/resources/features",
        glue = "com/dotdash/step_definitions",
       tags = "",
        dryRun = false
       )
public class CukesRunner {

}

