package com.iluwatar.abstractfactory;

public class ElfoFeiticeiro implements Wizard {
	  static final String DESCRIPTION = "este eh o elfo feiticeiro!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}