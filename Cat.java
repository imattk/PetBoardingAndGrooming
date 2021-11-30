package DefaltPackage;

public class Cat {
	public String CatName;
	private int CatSpaceNumber;//what kennel they are in
	private double CatWeight;//in pounds
	private int CatAge;

	
	//default constructor for Cat
public Cat() {
	
	String CatName = "meow";
	int CatSpaceNumber = 0;
	double Catweight = 0.0;
	int CatAge = 0;

}
public Cat(String a, double b, int c, int d) {
	
	CatName = a;
	CatWeight = b;
	CatAge = c;
	CatSpaceNumber = d;
	
}
public String getCatName() {
	return CatName;
}
public void setCatName(String CatName) {
	this.CatName = CatName;
}
public int getAge() {
	return CatAge;
}
public void setCatAge(int CatAge) {
	this.CatAge = CatAge;
}
public int getCatSpaceNumber() {
	return CatSpaceNumber;
}
public void setCatSpaceNumber(int CatSpaceNumber) {
	this.CatSpaceNumber = CatSpaceNumber;
}
public double getCatweight() {
	return CatWeight;
}
public void setCatWeight(double CatWeight) {
	this.CatWeight = CatWeight;
}

public String CatSummary() {
	return (getCatName() + getCatweight() + getAge() + getCatSpaceNumber());
}
}
