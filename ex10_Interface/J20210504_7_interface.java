package ex10_Interface;

import java.util.ArrayList;
import java.util.List;

//클래스는 다중 상속이 불가
//인터페이스 : 구현부가 없다. 다중상속이 가능, 객체생성불가
interface Attack{
	 String name = "포켓몬 공격";//public static final 생략 가능 //누우면 static
	 void attack(); //public abstract 생략가능
	 //default: 일반메소드
	 default void gameTime(){
		 System.out.println("24시간 공격가능");
	 }
}
interface Sound{
	String name = "포켓몬 소리"; 
	void sound();
}

class Pikachu implements Attack{
	
	String name = "피카츄";
	@Override
	public void attack() { //
		System.out.println(name +"! 전기공격");
		
	}
}

class Squirtle implements Attack,Sound{
	String name = "꼬부기";
	@Override
	public void sound() {
		System.out.println(name + ": 꼬북꼬북");
	}

	@Override
	public void attack() {
		System.out.println(name + "! 물대포");
		
	}
	
}

class Gameplay{
	void attack(Attack a) {
		a.attack();
	}
	void sound(Sound s) {
		s.sound();
	}
}

public class J20210504_7_interface {
	public static void main(String[] args) {
		System.out.println(Attack.name);
		Gameplay gp = new Gameplay();
		Pikachu p1 = new Pikachu();
		Squirtle s1 = new Squirtle();
		Attack p2 = new Pikachu();
		Attack s2 = new Squirtle();
		Sound s3 = new Squirtle();

		p1.attack();
		s1.attack();
		s1.sound();
		
		gp.attack(p1);
		gp.attack(s1);
		System.out.println(Sound.name);
		gp.sound(s1);
		
		p1.gameTime();
		
		//유연한 대처 가능
		List<String> list = new ArrayList<>();
		

	}
}
