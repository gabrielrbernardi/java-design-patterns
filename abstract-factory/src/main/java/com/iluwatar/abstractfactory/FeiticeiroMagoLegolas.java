package com.iluwatar.abstractfactory;

public class FeiticeiroMagoLegolas implements Wizard {
	  static final String DESCRIPTION = "Esse eh o Feiticeiro Mago Legolas!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}