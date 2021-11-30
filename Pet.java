package DefaltPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import DefaltPackage.Dog;
import DefaltPackage.Cat;

// Matthew Krebs 
// IT-145 JAVA
// 

public class Pet {
	
	
	String petType;
	String petName;
	int petAge;
	double petWeight;
	int DogSpaceNumber;
	int CatSpaceNumber;
	int daysStay;
	double ammountDue;
	
	ArrayList<Dog> list;
	
	public void setDogSpaceNumber(int space){

		DogSpaceNumber = space;

		}

		public int getDogSpaceNumber() {

		if((DogSpaceNumber <= 0 || (DogSpaceNumber <= 30))) {

		DogSpaceNumber = DogSpaceNumber - 1;

		System.out.println("\nYou have available space.\n");
		System.out.println("You have " + DogSpaceNumber + " Spaces left over.");
		}
		else {
		System.out.println("\nYou have no spaces available! ");
		java.lang.System.exit(0);

		}
		return DogSpaceNumber;

		}
	public void setCatSpaceNumber(int space){

			CatSpaceNumber = space;

			}

			public void getCatSpaceNumber() {

			if((CatSpaceNumber <= 0 || (CatSpaceNumber <= 30))) {

				CatSpaceNumber = CatSpaceNumber - 1;

			System.out.println("\nYou have available space.\n");
			System.out.println("You have " + CatSpaceNumber + " Spaces left over.");
			}
			else {
			System.out.println("\nYou have no spaces available! ");
			java.lang.System.exit(0);

			}

			}
	

	public static  void main(String[] args) {


		while(true) {
	    Scanner welcome = new Scanner(System.in);  // Create a Scanner object
	    
	    System.out.println("Are you Checking In or Out? Please Type in or out");
	    
	    String CheckInOut = welcome.nextLine();  // Read user input
	    
		
	    if (CheckInOut.equals("in")) {
	    	System.out.println("Great! let's get some information.");// Output user input
	    	Scanner petInfo = new Scanner(System.in);
	    	System.out.println("Is you pet a cat or dog?");
	    	String petType = petInfo.nextLine();
	    	
	    	System.out.println("How many days will your " + petType + " be staying with us?");
	    	int daysStay = petInfo.nextInt();
	    	
	 		

	    
	    	
	    	if(petType.equals("dog")){
	    		
	    		
	    				
	    		
	    		Dog newDog = new Dog();
	    		Scanner input = new Scanner(System.in);

//	    		System.out.println("Please Enter 30 spaces to start. ");
//	    		int setSpace = input.nextInt();
//	    		newDog.setDogSpaceNumber(setSpace);

//	    		newDog.getDogSpaceNumber();

	    		System.out.println("\nEnter name of dog: ");
	    		String name = input.next();
	    		newDog.setDogName(name);
	    		

	    		System.out.println("\nEnter age of " + name + ".");
	    		int age = input.nextInt();
	    		newDog.setDogAge(age);

	    		System.out.println("\nWhat is the weight of " + name + "?");
	    		double Weight = input.nextDouble();
	    		newDog.setDogWeight(Weight);
	    		
	    		
	    		if(daysStay > 2) {
		 			boolean Grooming = true;
		 			
		 		}	
		 		else {
		 			boolean Grooming = false;
		 			
		 		}
	    		
	    	
	    			
	    			
	    	    	
	    		

	    		System.out.println("Here's what we have so far...");
	    		


	    		System.out.println("The name of the dog is: " + newDog.getName());

	    		System.out.println("The age of " + name + " is " + newDog.getAge() + " years old. ");

	    		System.out.println("The weight of " + name + " " + newDog.getDogWeight() + " pounds. ");

	    		System.out.println("Grooming "+ name + "? " + newDog.getGrooming());
	    		
	    		ArrayList<DogKennel> kennel = new ArrayList<DogKennel>();
	    		DogKennel newDog1 = new DogKennel();
	    		
	    		DogKennel.addDog(null, null, null, null );
	    		
	    		System.out.println(newDog1);
	    		}	    
	    	if(petType.equals("cat")) {
	    		Cat defaultCat = new Cat();
	    		Cat newCat = new Cat();
	    		Scanner input = new Scanner(System.in);

	    		System.out.println("How many kennels will you need?. ");
	    		int setSpace = input.nextInt();
	    		newCat.setCatSpaceNumber(setSpace);

	    		newCat.getCatSpaceNumber();

	    		System.out.println("\nEnter name of Cat: ");
	    		String name = input.next();
	    		newCat.setCatName(name);

	    		System.out.println("\nEnter age of " + name + ".");
	    		int age = input.nextInt();
	    		newCat.setCatAge(age);

	    		System.out.println("\nWhat is the weight of " + name + "?");
	    		double setWeight = input.nextDouble();
	    		newCat.setCatWeight(setWeight);

	    		

	    		System.out.println("Here's what we have so far...");
	    	


	    		System.out.println("The name of the dog is: " + newCat.getCatName());

	    		System.out.println("The age of " + name + " is " + newCat.getAge() + " years old. ");

	    		System.out.println("The weight of " + name + " " + newCat.getCatweight() + " pounds. ");

	    		
	    	}

	    		
	    }
	    		


		
	    
	    
		if (CheckInOut.equals("out"))  {
	    	System.out.println("checking out");
	
		
	    	System.out.println("I'm sure your pet has been very happy here! What is your pet name?");  // Output user input
	    	
	    }
//	    else {  //FIXME! it keeps printing out this no matter what. if i had more time and education i could figure this out
//	    	System.out.println("why is it printing else statement");  // Unknown Input
//	    }
	    
	    }
	}
}




