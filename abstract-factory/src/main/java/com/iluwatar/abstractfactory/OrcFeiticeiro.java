package com.iluwatar.abstractfactory;

public class OrcFeiticeiro implements Wizard {
	  static final String DESCRIPTION = "Esse eh o Orc Feiticeiro!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}