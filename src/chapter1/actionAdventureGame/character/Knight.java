package chapter1.actionAdventureGame.character;

import chapter1.actionAdventureGame.weapon.SwordBehavior;

public class Knight extends Character{
	
	public Knight() {
		weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
