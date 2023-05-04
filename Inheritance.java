// Single Inheritance

package jawad;

class Animal {
	  void eat() {
	    System.out.println("Animal is eating");
	  }
	}


class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking");
  }
}


public class Main{
	public static void main(String[] args) {
		Dog obj = new Dog();
		
		obj.bark();
		obj.eat();
	}
}










// Multiple Inheritance

package jawad;

//First interface
interface Animal {
void eat();
}

//Second interface
interface Mammal {
void run();
}

//Class implementing both interfaces
class Dog implements Animal, Mammal {
void bark() {
 System.out.println("Dog is barking");
}

public void eat() {
 System.out.println("Dog is eating");
}

public void run() {
 System.out.println("Dog is running");
}
}

//Main method
public class Main {
public static void main(String[] args) {
 Dog myDog = new Dog();
 myDog.eat();  // inherited from Animal interface
 myDog.run();  // inherited from Mammal interface
 myDog.bark();
}
}






// Multilevel Inheritance

package jawad;

//superclass
class Animal {
void eat() {
 System.out.println("Animal is eating");
}
}

//subclass of Animal
class Dog extends Animal {
void bark() {
 System.out.println("Dog is barking");
}
}

//subclass of Dog
class Poodle extends Dog {
void play() {
 System.out.println("Poodle is playing");
}
}

//main method
public class Main {
public static void main(String[] args) {
 Poodle myPoodle = new Poodle();
 myPoodle.eat();   // inherited from Animal class
 myPoodle.bark();  // inherited from Dog class
 myPoodle.play();
}
}









// Hierarchical Inheritance

package jawad;

//superclass
class Animal {
void eat() {
 System.out.println("Animal is eating");
}
}

//subclass of Animal
class Dog extends Animal {
void bark() {
 System.out.println("Dog is barking");
}
}

//subclass of Animal
class Cat extends Animal {
void meow() {
 System.out.println("Cat is meowing");
}
}

//main method
public class Main {
public static void main(String[] args) {
 Dog myDog = new Dog();
 myDog.eat();   // inherited from Animal class
 myDog.bark();
 
 Cat myCat = new Cat();
 myCat.eat();   // inherited from Animal class
 myCat.meow();
}
}




