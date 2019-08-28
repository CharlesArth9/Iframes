# language: en
@Regresion
Feature: Formulario con Checkboxes
  El usuario debe poder seleccionar en el formulario las opciones:
  sólo el check1 ó sólo el check2 ó el check1 y check2



  @CheckBox
  Scenario:  Chequear todas las opciones disponibles
      Given Ingreso a la pagina de la prueba
       When clickeo todos los check

