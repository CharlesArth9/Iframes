package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
//@CucumberOptions(features ="src/test/resources/features/Demo.Feature")
@CucumberOptions(features ="src/test/resources/features/CheckBox.feature")
public class RunnerFeatures {

}