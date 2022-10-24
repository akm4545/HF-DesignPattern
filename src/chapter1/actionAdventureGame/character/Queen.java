package chapter1.actionAdventureGame.character;

import chapter1.actionAdventureGame.weapon.BowAndArrowBehavior;

public class Queen extends Character{

	public Queen() {
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
