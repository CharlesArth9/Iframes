package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CheckSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckDefinitions {

    @Steps
    CheckSteps CheckSteps;

    @Given("^Ingreso a la pagina de la prueba$")
    public void Ingreso_a_la_pagina_de_la_prueba() {
        CheckSteps.AbrirPaginaCheck();
    }

    @When("^clickeo todos los check$")
    public void clickeo_todos_los_check() {
        CheckSteps.HacerCheck();

    }

}
