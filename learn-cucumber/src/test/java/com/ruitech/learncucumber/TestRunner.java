package com.ruitech.learncucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:LoginTest.feature", glue="com.ruitech.learncucumber")
public class TestRunner {


}
