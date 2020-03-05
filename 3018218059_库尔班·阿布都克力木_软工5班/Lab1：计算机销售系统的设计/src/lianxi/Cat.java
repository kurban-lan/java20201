package lianxi;

public class Cat extends Animol {
	
	public Cat(String name, int eage) {
		super(name,eage);
	}


	public static void main(String[] args) {
		Animol animal = new Cat("maomao",15);
		System.out.println(animal.name+animal.eage);
	}
}
