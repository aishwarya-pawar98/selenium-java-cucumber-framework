package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ScreenshotUtil;


public class Hooks {


@Before
public void setUp() {
DriverFactory.initDriver();
String url = ConfigReader.getProperties().getProperty("url");
DriverFactory.getDriver().get(url);
}


@After
public void tearDown(io.cucumber.java.Scenario scenario) {
if (scenario.isFailed()) {
ScreenshotUtil.capture(DriverFactory.getDriver(), scenario.getName());
}
DriverFactory.quitDriver();
}
}