package testRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "D:\\project-workspace\\Vaayu\\src\\test\\resources\\features",
		glue = "stepDefinitions",
		tags = {"~@Ignore"}
		)

public class runner extends AbstractTestNGCucumberTests{

}
