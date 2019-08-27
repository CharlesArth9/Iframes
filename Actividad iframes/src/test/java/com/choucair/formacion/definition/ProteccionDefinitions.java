package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ProteccionSteps;
import cucumber.api.java.en.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ProteccionDefinitions {
    @Steps
    ProteccionSteps ProteccionSteps;

    @Given("^el usuario entra a la pagina de  solicitud de informacion para su clave$")
    public void el_usuario_entra_a_la_pagina_de_solicitud_de_informacion_para_su_clave() throws Throwable {
        ProteccionSteps.abrirPaginaPaciente();

    }

    @When("^ingresa parte de la informacion requerida para solicitar clave$")
    public void ingresa_parte_de_la_informacion_requerida_para_solicitar_clave() throws Throwable {
        ProteccionSteps.PrimerIngresoDatos();

    }

    @And("^se valida la seccion mas ventajas$")
    public void se_valida_la_seccion_mas_ventajas() throws Throwable {

        ProteccionSteps.ValidaMasVentaja();
    }
    @And("^continua ingresando su informacion$")
    public void continua_ingresando_su_informacion() throws Throwable {

        ProteccionSteps.SegundoIngresoDatos();

    }

    @But("^se omite ingresar la fecha$")
    public void se_omite_ingresar_la_fecha() throws Throwable {

        ProteccionSteps.IgnorarFecha();

    }

    @Then("^se verifican mensajes y la falta que datos para finalizar$")
    public void se_verifican_mensajes_y_la_falta_que_datos_para_finalizar() throws Throwable {
        //ProteccionSteps.ValidarMensajes();
    }

}
