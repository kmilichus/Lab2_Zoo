package model;
//Jhon Stiven Arboleda Gallego

	public class Date{

//attributes

	private int day;
	private int month;
	private int year;

// builder method

	public Date (int theDay, int theMonth, int theYear){
		day = theDay;
		month = theMonth;
		year = theYear;
	}
 
//getters y setters 

	public int getDay () {
		return day;
	}
	public void setDay (int theDay){
		day = theDay;
	}
	public int getMonth () {
		return month;
	}
	public void setMonth (int theMonth){
		month = theMonth;
	}
	public int getYear () {
		return year;
	}
	public void setYear (int theYear){
		year = theYear;
	}
	//show date
	public String showDate (){
		
		return ""+day+"/"+month+"/"+year;
	}
	public String vacuneKan(int dayActual, int mesActual, int yearActual){
			String message = "";
			int dayFecha = 0;
			int dayBorn = 0;
			int semanaQueFalta = 0;
			int diasRestantes = 0;
			int dayEdad = 0;
			
			dayBorn = (month - 1)*(30+day);
			dayActual = (mesActual - 1)*(30+dayActual);
			dayEdad = (360-(dayBorn+dayActual));
			diasRestantes = (360-dayEdad)/7;
			
			if (dayEdad >= 360){
				message = " El canguro necesita vacunas. URGENTE. \n";
			}else {
				message = " Las semanas que faltan son : "+(diasRestantes+semanaQueFalta);
			}
			return message;
	}
}
