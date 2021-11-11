package com.qa.interfaces;

public class Runner {
	public static void main(String[] args) {

		Attack attack = new Attack();
		attack.rw();
		attack.lw();
		attack.st();

		Defence defence = new Defence();
		defence.cdm();
		defence.gk();
		defence.rb();
		
		Team team = new Team();
		team.city();
		team.ground();
		team.manager();
		team.league();

	}

}
