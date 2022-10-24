package chapter1.actionAdventureGame.character;

import chapter1.actionAdventureGame.weapon.KnifeBehavior;

public class King extends Character{
	
	public King() {
		weaponBehavior = new KnifeBehavior();
	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
