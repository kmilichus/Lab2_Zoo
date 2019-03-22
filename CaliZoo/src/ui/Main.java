package ui;
import model.*;
import java.util.Scanner;

//Jhon Stiven Arboleda Gallego

	public class Main{
		
	//relations
		private Zoo zooCali;
		private Scanner reader;
	
	//1
	
	public Main (){
		init ();
		reader = new Scanner (System.in);
	}
	//Method main
	public static void main(String[] args){
		
		Main m = new Main();
		m.showMenu();
	}
	//menu
	public void showMenu(){
	
		int option=0;
		while(option!=11){
			message();
		option=reader.nextInt();	
		reader.nextLine();
		
	switch (option) {
			case 1:
				
				//Crear un canguro
				boolean ok = true;
				
				System.out.println("Por favor digite el nombre del canguro:");
				String name = reader.nextLine();
				
				System.out.println("Por favor digite la altura:");
				double height = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Por favor digite el peso:");
				double weight = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Por favor digite el genero \n 1.Masculino \n 2.Femenino");
				int seleccion = reader.nextInt();
				reader.nextLine();
				String gender="";
				if (seleccion==1){
					gender=Kangaroo.MALE;
				}
				else if (seleccion==2){
					gender=Kangaroo.FEMALE;
				}
				
				System.out.println("Por favor digite el tipo de sangre:");
				String bloodType = reader.nextLine();
				
				System.out.println("Por favor digite el dia de nacimiento:");
				int day = reader.nextInt();
				reader.nextLine();
				if(day < 1 || day > 30){
					System.out.println("Recuerde que los dias validos estan entre 1 y 30");
				}else {
					System.out.println ("Hay error un error en el dia. ");
					ok = false;
				}
				System.out.println("Por favor digite el mes de nacimiento:");
				int month = reader.nextInt();
				reader.nextLine();
				if(month < 1 || month > 12){
					System.out.println("Por favor digite un mes entre 1 y 12");
				}else {
					System.out.println ("Hay error un error en el mes. ");
					ok = false;
				}
				System.out.println("Por favor digite el anio de nacimiento en 4 digitos:");
				int year = reader.nextInt();
				reader.nextLine();
				
				Kangaroo agregar = new Kangaroo(name, weight, height, gender, bloodType, new Date(day, month, year));
				System.out.println("En que ambiente quiere agregar al canguro?");			
				
				System.out.println("1. Para el ambiente 1");
				System.out.println("2. Para el ambiente 2");
				System.out.println("3. Para el ambiente 3");
				
				int enviNum = reader.nextInt();
				reader.nextLine();
				
				if (ok){
				System.out.println(zooCali.addKangaroo(agregar, enviNum));
				}else{
					System.out.println("No se pudo crear el canguro porque digito un dato malo");
				}
				
				break;
			case 2:
			System.out.println("Digite el numero del canguro que desea eliminar");
			System.out.println(""+zooCali.showNameKanga());
			int number= reader.nextInt();
			System.out.println(""+zooCali.eliminateKanga(number));
				break;
			case 3:
				System.out.println(""+zooCali.showKangaroo());
				break;
			case 4:
				System.out.println(""+zooCali.showZone());
				break;
			case 5:
				System.out.println("Los canguros cuyo nombre empieza en vocal son: \n");
				System.out.println(zooCali.nameKvocal()+"\n");
				break;
			case 6:
				System.out.println(""+zooCali.showEnvironment());
				break;
			case 7:
				System.out.println(""+zooCali.showDragon());
				break;
			case 8:
				System.out.println(""+zooCali.showZoneDrago());
				break;
			case 9:
				System.out.println("Por favor digite de que ambiente es el canguro a cambiar");
				System.out.println("1. Para el ambiente 1");
				System.out.println("2. Para el ambiente 2");
				System.out.println("3. Para el ambiente 3");
				int envi1 = reader.nextInt();
				reader.nextLine();
				System.out.println("Por favor digite a que ambiente quiere cambiar: ");
				System.out.println("1. Para el ambiente 1");
				System.out.println("2. Para el ambiente 2");
				System.out.println("3. Para el ambiente 3");
				int envi2 = reader.nextInt();
				reader.nextLine();
				System.out.println("Por favor digite a que canguro quiere cambiar: ");
				System.out.println("1. Primer canguro");
				System.out.println("2. Segundo canguro");
				System.out.println("3. Tercer canguro");
				int kanga = reader.nextInt();
				reader.nextLine();
				System.out.println(""+zooCali.kangachange(kanga, envi1, envi2));
				break;
			case 10:
				System.out.println("Acontinuacion debe digitar la fecha actual ");
				System.out.println ("\n");
				System.out.println ("Por favor digite el dia actual");
				int dayActual = reader.nextInt();
				System.out.println ("Por favor digite el mes actual");
				int mesActual = reader.nextInt();
				System.out.println ("Por favor digite el dia actual");
				int yearActual = reader.nextInt();
				System.out.println(""+zooCali.vacuneKanga(dayActual, mesActual, yearActual));
				break;
			case 11:
				System.out.println ("Salir.");
			}
		}
	}
		
	
		//mostrar menu
		public void message(){
			
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("  ||                        BIENVENIDOS AL ZOOLOGICO DE CALI                          || ");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("1. Crear un canguros.");
			System.out.println("2. Eliminar un canguro.");
			System.out.println("3. Datos de los canguros.");
			System.out.println("4. Datos de la zona de los canguros.");
			System.out.println("5. Ver los canguros que su nombre inicia y termina en vocal.");
			System.out.println("6. Datos de los ambientes de los canguros.");
			System.out.println("7. Datos de los dragones barbados.");
			System.out.println("8. Datos de la zona de dragones barbados.");
			System.out.println("9. Cambiar un canguro de ambiente ");
			System.out.println("10. Vacunas.");
			System.out.println("11. Salir.");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------");
			
		}
	
	public void init (){
		Date date1 = new Date (05, 10, 2010);
		Date date2 = new Date (04, 11, 2003);
		Date date3 = new Date (12, 12, 2004);
		Date date4 = new Date (05, 2, 2013);
		Date date5 = new Date (04, 7, 2006);
		Date date6 = new Date (12, 10, 2018);
		Kangaroo kanga1 = new Kangaroo("Camila", 191.6, 1.53, "Femenino", "AB", date1 );
		Kangaroo kanga2 = new Kangaroo("Fredd", 210.6, 1.63, "Masculino", "O", date2);
		Kangaroo kanga3 = new Kangaroo("Aleja", 171.6, 1.46, "Feminino", "A", date3);
		Kangaroo kanga4 = new Kangaroo("Lent", 191.6, 1.53, "Masculino", "AB", date4);
		Kangaroo kanga5 = new Kangaroo("Fenix", 210.6, 1.84, "Femenino", "B", date5);
		Kangaroo kanga6 = new Kangaroo("Max", 171.6, 1.46, "Masculino", "A", date6);
		KangarooEnvironment EnviKanga1 = new KangarooEnvironment (kanga1, kanga4, null);
		KangarooEnvironment EnviKanga2 = new KangarooEnvironment (kanga2, kanga5, null);
		KangarooEnvironment EnviKanga3 = new KangarooEnvironment (kanga3, kanga6, null);
		KangarooZone zoneKanga = new KangarooZone (21.5 , 42.3, 23.2, EnviKanga1, EnviKanga2, EnviKanga3);
		Dragon dragoncito = new Dragon ("Steff", 30.6, 1.16, 4.3, "o+");
		Dragon dragoncita = new Dragon ("Tiffa", 26.6, 1.21, 3.2, "o-");
		DragonZone zoneDragon = new DragonZone (41.2, 3.1, 31.2, 41.2, 6, dragoncito, dragoncita);
		zooCali = new Zoo ("Zoologico de Cali", zoneKanga, zoneDragon);
	}
}