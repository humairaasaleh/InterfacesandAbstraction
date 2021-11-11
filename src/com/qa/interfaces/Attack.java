package com.qa.interfaces;

public class Attack implements Forwards, Midfielders{

	@Override
	public void rw() {
		System.out.println("Paul Pogba");
		
	}

	@Override
	public void lw() {
		System.out.println("Bruno Fernandes");
		
	}

	@Override
	public void st() {
		System.out.println("Ronaldo");
		
	}

}
