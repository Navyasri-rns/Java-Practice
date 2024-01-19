package oops;

class Animal{
	void eat() {
		System.out.println("Iam a omnivorous");
	}
}
class Mammal extends Animal{
	void nature(){
		System.out.println("Iam a Mammal");
	}
}
class Dog extends Mammal{
	void sound() {
		System.out.println("I bark");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.nature();
		d.sound();
	}

}
