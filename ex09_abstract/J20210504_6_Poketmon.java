package ex09_abstract;

//Pikachu(피카츄)
//Squirtle(꼬부기)
//attack(공격메서드)
//sound (소리 메서드)
abstract class Poketmon{
	//일반메소드
	void gameName() {
		System.out.println("포켓몬 게임");
	}
	abstract void attack();
	abstract void sound();;
}
//피카츄
class Pikachu extends Poketmon{
	
	@Override
	void attack() {
		System.out.println("전기공격");
	}
	@Override
	void sound() {
		System.out.println("피카피카");
	}
}
//꼬부기
class Squirtle extends Poketmon{
	@Override
	void attack() {
		System.out.println("물대포");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}
}

//게임플레이
class Gamplay{
	void attackPlay(Poketmon poketmon) {//poketmon 인터페이스
		poketmon.attack();
	}
	void AutoSound(Poketmon poketmon) {
		poketmon.sound();
	}
}



public class J20210504_6_Poketmon {

	public static void main(String[] args) {
		Poketmon pikachu = new Pikachu();
		Poketmon squirtle = new Squirtle();
		Gamplay gp = new Gamplay();
		
		pikachu.gameName();
		System.out.println("-------------");
		System.out.println("피카츄! " );
		gp.attackPlay(pikachu);
		System.out.print("피카츄: ");
		gp.AutoSound(pikachu);
		System.out.println("-------------");
		System.out.println("꼬부기! ");
		gp.attackPlay(squirtle);
		System.out.print("꼬부기: ");
		gp.AutoSound(squirtle);
		
	}

}
