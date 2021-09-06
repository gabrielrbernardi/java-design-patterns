package com.iluwatar.abstractfactory;

public class ReiLegolasFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new CasteloLegolas();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new ReiLegolas();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ExercitoLegolas();
	}

	@Override
	public Wizard CreateWizard() {
		// TODO Auto-generated method stub
		return new FeiticeiroMagoLegolas();
	}

}