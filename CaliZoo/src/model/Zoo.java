package model;
//Jhon Stiven Arboleda Gallego

	public class Zoo{

//Attributes

	private String name;
	
//Relations

	private KangarooZone zone1;
	private DragonZone zone2;
	
//builder method

	public Zoo (String theName, KangarooZone kangaZone, DragonZone zoneDra){
		name = theName;
		zone1 = kangaZone;
		zone2 = zoneDra;
	}
	
//Methods Setters and Getters

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public KangarooZone getKangarooZone(){
		return zone1;
	}
	public void setKangarooZone(KangarooZone zone1){
		this.zone1 = zone1;
	}
	public void setDragonZone(DragonZone zone2){
		this.zone2 = zone2;
	}
	public DragonZone getDragonZone(){
		return zone2;
	}
	//mostrar canguro
	public String showKangaroo(){
		
		String message = "";
		
		message += zone1.showKangaroo() + "\n";
		
		return message;
	}
	//añadir canguros
	public String addKangaroo(Kangaroo agregar , int num) {
		
		String message = "";
		
		message += zone1.addKangaroo(agregar, num);
		
		return message;
	}
	//datos del ambiente
	public String showEnvironment(){
		
		String message = "";
		
		message += zone1.showEnvironment();
		
		return message;
	}
	//datos de la zona de canguros
	public String showZone(){
		
		String message = "";
	
		message += zone1.showZone();
	
		return message;
	}
	//eliminar canguros
	public String eliminateKanga(int number){
		String message = "";
		switch(number){
			case (1):
			zone1.getEnvironment1().setKangaroo1(null);
			message =("El canguro ha sido eliminado");
			break;
			case (2):
			zone1.getEnvironment1().setKangaroo2(null);
			message =("El canguro ha sido eliminado");
			break;
			case (3):
			zone1.getEnvironment1().setKangaroo3(null);
			message =("El canguro ha sido eliminado");
			break;
			case (4):
			zone1.getEnvironment2().setKangaroo1(null);
			message =("El canguro ha sido eliminado");
			break;
			case (5):
			zone1.getEnvironment2().setKangaroo2(null);
			message =("El canguro ha sido eliminado");
			break;
			case (6):
			zone1.getEnvironment2().setKangaroo3(null);
			message =("El canguro ha sido eliminado");
			break;
			case (7):
			zone1.getEnvironment3().setKangaroo1(null);
			message =("El canguro ha sido eliminado");
			break;
			case (8):
			zone1.getEnvironment3().setKangaroo2(null);
			message =("El canguro ha sido eliminado");
			break;
			case (9):
			zone1.getEnvironment3().setKangaroo3(null);
			message =("El canguro ha sido eliminado");
			break;
		}
		return message;
	}
	//nombre de los canguros para eliminar
	public String showNameKanga(){
		String message = "";
		
		message += zone1.showNameKanga();
			
		return message;
	}
	//Animal con vocal iniciada en vocal y terminada en vocal
	public String nameKvocal(){
		String message = "";
		
		message += zone1.nameKvocal();
		
		return message;
	}
	//name kangaroo change
	public String kangaName(){
		String message = "";
		
		message += zone1.kangaName();
		
		return message;
	}
	//mostrar canguros
	
	public String showDragon(){
		
		String message = "";
		
		message += zone2.showDragon();
		
		return message;
	}
	//mostrar zona de dragones
	
	public String showZoneDrago(){
		String message = "";
		
		message += zone2.showZoneDrago();
		
		return message;
	}
	//vaccine for kangaroos
	public String vacuneKanga (int dayActual, int mesActual, int yearActual){
		String message = "";
		message += zone1.vacuneKanga(dayActual, mesActual, yearActual);
		return message;
	}
	
	public String kangachange(int kanga, int envi1, int envi2)
	{
		String message = "";
		
		message += zone1.kangachange(kanga, envi1, envi2);
		
		return message;
	}
}

