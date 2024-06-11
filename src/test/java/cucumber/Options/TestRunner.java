package cucumber.Options;

/*
 * Author: Durga Rao
 * Initial Date: 06/10/2023
 * Description: The Test runner class is used to configure and run cucumber tests.
 * It uses Junit as a test runner and specifies options for cucumber.
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = {"stepDefinitions"})
public class TestRunner {
}
