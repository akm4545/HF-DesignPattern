package chapter1.actionAdventureGame.character;

import chapter1.actionAdventureGame.weapon.WeaponBehavior;

//어드벤처 게임에 사용할 각 캐릭터는 한 가지 무기만 사용할 수 있지만
//게임 도중에 무기를 바꿀 수 있다

//캐릭터에는 무기가 있다 -> 캐릭터 = 추상클래스, 무기 = 인터페이스
//A 에는 B가 있다 -> A는 사람 B는 도구라고 생각하면 사람은 도구를 가지고 있고 도구들을 바꿔서 가질 수 있다.
//B는 변화할 확률이 높으므로 인터페이스로 만들어서 구현하여 사용 A는 공통 틀을 상속받아 사용
public abstract class Character {
	WeaponBehavior weaponBehavior;
	
	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public abstract void fight();
}
