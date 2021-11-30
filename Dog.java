package DefaltPackage;

import java.util.ArrayList;

public class Dog extends Pet{
	//variables
	public String DogName;
	public String OwnerLastName;
	private int DogSpaceNumber;//what kennel they are in
	private double DogWeight;//in pounds
	public boolean Grooming;//if they are getting groom
	private int DogAge;
	
	// default constructor
	
	public Dog() {
		
		String DogName = "woof";
		int DogSpaceNumber = 0;
		double DogWeight = 0.0;
		boolean Grooming = true;
			
		
	}
	//mutate constructor for the dog
	public Dog(String a, int b, double c, boolean d) {
		
		DogName = a;
		DogAge = b;
		DogWeight = c;
		Grooming = d;
		
	}
	
	public void kennelEmpty() {//method to empty a kennel
		DogName = "empty";
		DogSpaceNumber = 0; 
	}
	public boolean isKennelEmpty() { //method to check if kennel is empty
		return (DogName.equals("empty"));
	}
	public void printDogKennel() {
		System.out.println(DogName + " ");
		System.out.println("is in kennel number: " + DogSpaceNumber);
	}
	
	public String getName() {
		return DogName;
	}
	public void setDogName(String DogName) {
		this.DogName = DogName;
	}
	public int getAge() {
		return DogAge;
	}
	public void setDogAge(int DogAge) {
		this.DogAge = DogAge;
	}
	public int getDogSpaceNumber() {
		 return DogSpaceNumber;
	}
	public void setDogSpaceNumber(int DogSpaceNumber) {
		this.DogSpaceNumber = DogSpaceNumber;
	}
	public double getDogWeight() {
		return DogWeight;
	}
	public void setDogWeight(double DogWeight) {
		this.DogWeight = DogWeight;
	}
	public boolean getGrooming() {
		return true;
	}
	public void setGrooming(boolean setGroom) {
		this.Grooming = setGroom;
	}
	public String dogSummary() {
		return (getName() + getDogWeight() + getAge() + getGrooming());
	}
	 public static void addDog(ArrayList<DogKennel> DogName,
             ArrayList<DogKennel> DogAge, 
             ArrayList<DogKennel> DogWeight )
	 {
		 
	      System.out.println(DogName + "'s information has been added.");
	 }
}



