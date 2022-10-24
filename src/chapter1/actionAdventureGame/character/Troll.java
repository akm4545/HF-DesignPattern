package chapter1.actionAdventureGame.character;

import chapter1.actionAdventureGame.weapon.AxeBehavior;

public class Troll extends Character{
	
	public Troll() {
		weaponBehavior = new AxeBehavior();
	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
