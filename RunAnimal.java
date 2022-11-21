import java.util.*;

public class RunAnimal{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
		System.out.print("Choose an animal. \nPress B for Bird, C for Cat, D for Dog: ");
		String user = sc.nextLine();
		
		if(user.equalsIgnoreCase("B")){
			b.eat();
			b.sleep();
			b.makeSound();
		}
		else if(user.equalsIgnoreCase("C")){
			c.eat();
			c.sleep();
			c.makeSound();
		}
		else if(user.equalsIgnoreCase("D")){
			d.eat();
			d.sleep();
			d.makeSound();
		}
		else{
			System.out.println("Invalid choice.");
		}
	}
}