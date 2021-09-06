package com.iluwatar.abstractfactory;

public class ExercitoLegolas implements Army {

	  static final String DESCRIPTION = "Esse eh o exercito do Legolas!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }
}