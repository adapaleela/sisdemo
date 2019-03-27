package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\leelajava\\sisdemo1\\src\\test\\resources\\features\\bddfeaturefile.feature"},
				plugin={"pretty","html:target\\results1"},
				monochrome=true
				)
public class Runner
{

}
