package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.List;


@DefaultUrl("http://the-internet.herokuapp.com/checkboxes")

public class CheckPageObjects extends PageObject {
    @FindBy(id="checkboxes")
    // @FindBy(xpath = "//form[@id='checkboxes']")

    public WebElement formulario;
    public void check( String opcion) {
    List<WebElement> lchecks = formulario.findElements(By.tagName("input"));

            for (int i=0; i<lchecks.size(); i++) {
                if (lchecks.get(i).getAttribute("outerHTML").contains("checked")) {
                    System.out.println(lchecks.get(i).getText()+"Esta seleccionado");
                }
                else {
                    lchecks.get(i).click();
                    System.out.println(lchecks.get(i).getAttribute("outerHTML")+"Toco seleccionar");
                }
            }
        }
    }

