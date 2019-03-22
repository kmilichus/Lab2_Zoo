package model;
//Jhon Stiven Arboleda Gallego

	public class DragonZone {

//Attributes

	private double heatSource;
	private double humidity;
	private double temperature;
	private double filtration;
	private double waterLiters;

//relations

	private Dragon dragon1;
	private Dragon dragon2;

//builder method

	public DragonZone (double theHeatSource, double theHumidity, double theTemperature, double theFiltration, double theWaterLiters, Dragon dragoncito, Dragon dragoncita) {
	
		heatSource = theHeatSource;
		humidity = theHeatSource;
		temperature = theTemperature;
		filtration = theFiltration;
		waterLiters = theWaterLiters;
		dragon1 = dragoncito;
		dragon2 = dragoncita;
	}

// methods getters y setters

	public double getHeatsource (){
		return heatSource;
	}
	public void setHeatsource (double theHeatSource){
		heatSource = theHeatSource;
	}
	public double getHumidity (){
		return humidity;
	}
	public void setHumidity (double theHumidity){
		humidity = theHumidity;
	}
	public double getTemperature (){
		return temperature;
	}
	public void setTemperature (double theTemperature){
		temperature = theTemperature;
	}
	public double getFiltration (){
		return filtration;
	}
	public void setFiltration (double theFiltration){
		filtration = theFiltration;
	}
	public double getWaterLiters (){
		return waterLiters;
	}
	public void setWaterLiters (double theWaterLiters){
		waterLiters = theWaterLiters;
	}
	
	//liters of water
	public double calculateWaters (){
		double waterLiters = 0.0;
		if (dragon1 != null){
			waterLiters += dragon1.calculateBmiDragon();
		}
		if (dragon2 != null){
			waterLiters += dragon2.calculateBmiDragon();
			
		}
		waterLiters=((dragon1.calculateBmiDragon() * 0.75) + (dragon2.calculateBmiDragon() * 0.75));
		return waterLiters;
	}
	
	
	//show dragon
	
	public String showDragon(){
		String message = "";
		
		message += "Los dragones 1 son:\n";
		message += dragon1.showDragon()+"\n";
		message += dragon2.showDragon()+"\n";
		
		return message;
	}
	//show kangaroos zone
	public String showZoneDrago(){
		String message = "";
		message += "\n La temperature de la zona es: "+temperature+"\n";
		message += "\n La humedad de la zona es de: "+humidity+"\n";
		message += "\n La filtracion de la zona es de: "+filtration+"\n";
		message += "\n La cantidad de agua que necesita toda la zona es de: "+calculateWaters()+"\n";
		message += "\n La fuente de calor de la zona es: "+heatSource+"\n";
		message += "\n La comida de la zona es: "+foodAlert()+"\n";
		
		
		return message;
	}
	//food alert dragons
	
	public String foodAlert(){
		String alert = "";
		
		if (dragon1.getFoodVariety() < 5.0 && dragon2.getFoodVariety() < 5.0){
			alert = "LOS DRAGONES NECESITA COMIDA";
		}
		else
			alert = "No necesitan comida";
		return alert;
	}
}


