package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //where our feature files are located
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions/",
        dryRun = false,// to make the test cases work this needs to be turned into false or commneted out

           tags = "@navigation"
       // tags= "@store_manager and @login"  // this will only run if boith conditions arte true like if statements
       // tags={"@store_manager","@login" }       // this is the old syntax. Cucumber 3

        //tags="@store_manager or @test"
        // tags={"@store_manager","@login" }       // this is the old syntax. Cucumber 3
)
public class CukesRunner {







}
