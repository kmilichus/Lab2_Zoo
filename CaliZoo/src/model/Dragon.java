package model;
//Jhon Stiven Arboleda Gallego

public class Dragon {
	
//Attributes

	public String name;
	public double height;
	public double weight;
	public double foodVariety;
	public String bloodType;

//builder method

public Dragon (String theName, double theHeight, double theWeight, double theFoodVariety, String theBloodType){
	
	name = theName;
	height = theHeight;
	weight = theWeight;
	foodVariety = theFoodVariety;
	bloodType = theBloodType;
}
	
//methods getters and setters

	public String getName (){
		return name;
	}
	public void setName(String theName){
		name = theName;
	}
	public double getHeight (){
		return height;
	}
	public void setHeight (double theHeight){
		height = theHeight;
	}
	public double getWeight () {
		return weight;
	}
	public void setWeight (double theWeight) {
		weight = theWeight;
	}
	public double getFoodVariety (){
		return foodVariety;
	}
	public void setFoodVariety (double theFoodVariety){
		foodVariety = theFoodVariety;
	}
	public String getBloodType (){
		return bloodType;
	}
	public void setBloodType(String theBloodType){
		bloodType = theBloodType;
	}
	//Calculate bmi of dragon
	public double calculateBmiDragon(){
		return weight/(height*height);
	}
	//mostrar dragons
	public String showDragon (){
		
		String message = "------------------------------------------------------" +"\n";  
		
		message += "El nombre del dragon es: "+ name+"\n";
		message += "El peso del dragon es: "+weight+"\n";
		message += "La altura del dragon es: "+height+"\n";
		message += "El tipo de sangre del dragon es: "+bloodType+"\n";
		message += "El IMC del dragon es: "+calculateBmiDragon()+"\n";
		message += "La comida que tiene el dragon es: "+foodVariety+" kilos \n";
		return message;
	}
}