package org.dep.example;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}