package model;
import java.util.*;
//Jhon Stiven Arboleda Gallego

	public class Kangaroo{
		
	public static final String MALE = "Masculino";
	public static final String FEMALE = "Femenino";
	public static final String AB = "AB";
	public static final String A = "A";
	public static final String B = "B";
	public static final String O = "O";


// Attributes

	private String name;
	private double weight;
	private double height;
	private String gender;
	private String bloodType;
	private double bmi;
	private double foodVariety;
	private String heartRisk; 

//relations

	private Date birthdate;

// builder method


	public Kangaroo (String theName, double theWeight, double theHeight, String theGender, String theBloodType, Date birthdate){
		
		name = theName;
		weight = theWeight;
		height = theHeight;
		gender = theGender;
		bloodType = theBloodType;
		bmi=calculateBmi();
		calculateFood();
		heartRisk = calculateHeartRisk();
		this.birthdate = birthdate;
	}

//Methods Setters and Getters

	public String getName (){
		return name;
	}
	public void setName (String theName){
		name = theName; 
	}
	public double getWeight (){
		return weight;
	}
	public void setWeight (double theWeight){
		weight = theWeight;
	}
	public double getHeight (){
		return height;
	}
	public void setHeight (double theHeight){
		height = theHeight;
	}
	public String getGender (){
		return gender;
	}
	public void setGender(String theGender){
		gender = theGender;
	}
	public String getBloodType (){
		return bloodType;
	}
	public void setBloodType (String theBloodType){
		bloodType = theBloodType;
	}
	public double getFoodVariety (){
		return foodVariety;
	}
	public void setFoodVariety (double theFoodVariety){
		foodVariety = theFoodVariety;
	}
	public double getBmi (){
		return bmi;
	}
	public void setBmi (double bmi){
		this.bmi = bmi;
	}
	public Date getBirthdate () {
		return birthdate;
	}
	public void setBirthdate (Date birthdate){
		this.birthdate = birthdate;
	}
	public String getHeartRisk (){
		return heartRisk;
	}
	public void setHeartRisk(String heartRisk){
		heartRisk = heartRisk;
	}

	//metthod meal
	
	
	public double calculateFood (){
		
		if (weight < 30){
			foodVariety += weight * 0.8;
		}
		else if (weight >= 30 && weight <= 48){
			foodVariety += weight * 0.1 + weight;
		}
		else {
			foodVariety += 40 +( 0.4 * (weight - 48));
		}
		return foodVariety;
	}
	//Calculate bmi
	
	public double calculateBmi(){
		bmi += weight/(height*height);
			return bmi;
	}
	
	//heart risk
	
	public String calculateHeartRisk()
	{
		String heartRisk="";
		
		if (bmi<18 && bloodType.equalsIgnoreCase(A) || bloodType.equalsIgnoreCase(AB)){
			heartRisk += "Riesgo bajo";
		}else if (bmi<18 && bloodType.equalsIgnoreCase(O) || bloodType.equalsIgnoreCase(B)){
			heartRisk += "Riesgo moderado";
		}else if (bmi >= 18 && bmi <= 25){
			heartRisk += "Riesgo bajo";
		}else if (bmi>25 && bloodType.equalsIgnoreCase(A) || bloodType.equalsIgnoreCase(B) || bloodType.equalsIgnoreCase(O)){
			heartRisk += "Riesgo alto";
		}else if (bmi>25 && bloodType.equalsIgnoreCase(AB)){
			heartRisk += "Riesgo moderado";
		}
		return heartRisk;
	}
	
	//info kangaroo
 	public String showKangaroo(){
		
		String message = "------------------------------------------------------" +"\n";  
		
		message += "El nombre del canguro es: "+ name+"\n";
		message += "El sexo del canguro es: "+ gender+"\n";
		message += "El peso del canguro es: "+weight+"\n";
		message += "La altura del canguro es: "+height+"\n";
		message += "El tipo de sangre del canguro es: "+bloodType+"\n";
		message += "La fecha del canguro es: "+birthdate.showDate()+"\n";
		message += "El IMC del canguro es: "+calculateBmi()+"\n";
		message += "El riesgo cardiaco del canguro es: "+calculateHeartRisk()+"\n";
		message += "La comida que necesita el canguro es: "+calculateFood()+"\n";
		return message;
	}
	//vowels of kangaroo 
	public boolean kangaVowels(){
		boolean vocal = false;
		
		if (name.charAt(0) == 'a' || name.charAt(0) == 'e' || name.charAt(0) == 'i' || name.charAt(0) == 'o' || name.charAt(0) == 'u' || name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0) == 'I' || name.charAt(0) == 'O' || name.charAt(0) == 'U'){
	
			if ((name.charAt(name.length()-1)) == 'a' || name.charAt(name.length()-1) == 'e' || name.charAt(name.length()-1) == 'i' || name.charAt(name.length()-1) == 'o' || name.charAt(name.length()-1) == 'u' || name.charAt(name.length()-1) == 'A' || name.charAt(name.length()-1) == 'E' || name.charAt(name.length()-1) == 'I' || name.charAt(name.length()-1) == 'O' || name.charAt(name.length()-1) == 'U'){
				vocal = true;
			}
		}
		return vocal;
	}
	//name of the kangaroo for the vowel
	public String nameKangaVocal(){
		String message = " ";
		if (kangaVowels()){
			message = name+"\n";
		}
		return message;
	}
	//Vaccine kangaroo
	public String vacuneKanga (int dayActual, int mesActual, int yearActual){
		String message = "";
		message += birthdate.vacuneKan(dayActual, mesActual, yearActual);
		return message;		
	}	
}
	
