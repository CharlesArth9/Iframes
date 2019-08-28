package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CheckPageObjects;
import net.thucydides.core.annotations.Step;

public class CheckSteps {

    CheckPageObjects CheckPageObjects;

    @Step
    public void AbrirPaginaCheck() {
        CheckPageObjects.open();

    }

    public void HacerCheck() {

        String opcion = " checkbox 2";
        CheckPageObjects.check(opcion);
    }
}
