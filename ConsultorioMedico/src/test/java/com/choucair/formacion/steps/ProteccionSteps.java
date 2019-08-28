package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ProteccionPageObjects;
import net.thucydides.core.annotations.Step;

public class ProteccionSteps {

    ProteccionPageObjects ProteccionPageObjects;

    @Step
    public  void abrirPaginaPaciente(){

        ProteccionPageObjects.open();
    }

    public  void PrimerIngresoDatos(){

        ProteccionPageObjects.PrimerIngresoDatos();
    }

    public  void ValidaMasVentaja(){

        ProteccionPageObjects.ValidaMasVentaja();
    }


    public  void SegundoIngresoDatos(){

        ProteccionPageObjects.SegundoIngresoDatos();
    }

    public  void IgnorarFecha(){

        ProteccionPageObjects.IgnorarFecha();
    }


    public void ValidarMensajes()
    {

        ProteccionPageObjects.ValidarMensajes();
    }
}
