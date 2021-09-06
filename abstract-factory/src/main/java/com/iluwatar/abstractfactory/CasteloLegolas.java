package com.iluwatar.abstractfactory;

public class CasteloLegolas implements Castle {

	  static final String DESCRIPTION = "Esse eh o castelo do legolas!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }
}