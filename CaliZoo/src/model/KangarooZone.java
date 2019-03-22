package model;
//Jhon Stiven Arboleda Gallego

public class KangarooZone{

//Attributes

	private double humidity;
	private double temperature;
	private double filtration;
	private double waterLiters;

// Relations

	private KangarooEnvironment environment1;
	private KangarooEnvironment environment2;
	private KangarooEnvironment environment3;

//builder method

	public KangarooZone (double theHumidity, double theTemperature, double theFiltration, KangarooEnvironment environment1, KangarooEnvironment environment2, KangarooEnvironment environment3) {
	
		humidity = theHumidity;
		temperature = theTemperature;
		filtration = theFiltration;
		waterLiters = calculateWatersKangaroo();
		this.environment1 = environment1;
		this.environment2 = environment2;
		this.environment3 = environment3;
	}

// metodos getters y setters 

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
	public KangarooEnvironment getEnvironment1 (){
		return environment1;
	}
	public void setEnvironment1 (KangarooEnvironment environment1){
		this.environment1 = environment1;
	}
	public KangarooEnvironment getEnvironment2 (){
		return environment2;
	}
	public void setEnvironment2 (KangarooEnvironment environment2){
		this.environment2 = environment2;
	}
	public KangarooEnvironment getEnvironment3 (){
		return environment3;
	}
	public void setEnvironment3 (KangarooEnvironment environment3){
		this.environment3 = environment3;
	}
	
	//calculate liters dof waters, all zone
	public double calculateWatersKangaroo(){
		
		if(environment1 != null){
			waterLiters += environment1.waterLiters();//+environment2.waterLiters()+environment3.waterLiters();
		}
		if(environment2 != null){
			waterLiters += environment2.waterLiters();
		}
		if(environment3 != null){
			waterLiters += environment3.waterLiters();
		}
		return waterLiters;
	}
	// show kangaroo
	public String showKangaroo(){
		
		String message = " ";
		message += "Los canguros del ambiente 1 son:\n";
		message += environment1.showKangaroo()+"\n";
		message += "Los canguros del ambiente 2 son:\n";
		message += environment2.showKangaroo()+"\n";
		message += "Los canguros del ambiente 3 son:\n";
		message += environment3.showKangaroo()+"\n";
		
		return message;
	}	
	//add kangaroo 
	
	public String addKangaroo(Kangaroo agregar, int numero) {
		   
		   String message = "";
		   
		   if(numero==1) {
			   message += environment1.addKangaroo(agregar);
		   } else if(numero==2) {
			   message += environment2.addKangaroo(agregar);
		   }else if(numero==3) {
			   message += environment3.addKangaroo(agregar);
		   }else {
			   message = "Digite un ambiente valido";
		   }
		   return message;
	   }
	   //show environment date
	  public String showEnvironment(){
		  
		  String message = " ";
		  message += environment1.showEnvironment()+"\n";
		  message += environment2.showEnvironment()+"\n";
		  message += environment3.showEnvironment()+"\n";
		  
		  return message;
	  }
	  //show kangaroo zone
	  public String showZone(){
		  
		  String message = "";
		  message += "Esta zona contiene 3 ambientes, donde cada ambiente tiene los siguientes canguros: \n";
		  message += "";
		  message += "Ambiente 1: \n";
		  if (environment1.getKangaroo1() != null){
		  message += environment1.getKangaroo1().getName()+"\n";
		  }
		  if (environment1.getKangaroo2() != null){
		  message += environment1.getKangaroo2().getName()+"\n";
		  }
		  if (environment1.getKangaroo3() != null){
		  message += environment1.getKangaroo3().getName()+"\n";
		  }
		  message += "Ambiente 2: \n";
		  if (environment2.getKangaroo1() != null){
		  message += environment2.getKangaroo1().getName()+"\n";
		  }
		  if (environment2.getKangaroo2() != null){
		  message += environment2.getKangaroo2().getName()+"\n";
		  }
		  if (environment2.getKangaroo3() != null){
		  message += environment2.getKangaroo3().getName()+"\n";
		  }
		  message += "Ambiente 3: \n";
		  if (environment3.getKangaroo1() != null){
		  message += environment3.getKangaroo1().getName()+"\n";
		  }
		  if (environment3.getKangaroo2() != null){
		  message += environment3.getKangaroo2().getName()+"\n";
		  }
		  if (environment3.getKangaroo3() != null){
		  message += environment3.getKangaroo3().getName()+"\n";
		  }
		  message += "\n Ademas contiene las siguientes caracteristicas: \n";
		  message += "\n La temperature de la zona es: "+temperature+"\n";
		  message += "\n La humedad de la zona es de: "+humidity+"\n";
		  message += "\n La filtracion de la zona es de: "+filtration+"\n";
		  message += "\n La cantidad de agua que necesita toda la zona es de: "+calculateWatersKangaroo()+" litros \n";
		  
		  return message;
		}
		//delete kangaroo
		public String eliminateKanga(){
			String message = "";
			message += "En el ambiente 1 los canguros para eliminar son: \n"+environment1.eliminateKanga()+"\n";
			//message += ""
			message += "En el ambiente 2 los canguros para eliminar son: "+environment2.eliminateKanga();
			message += "En el ambiente 3 los canguros para eliminar son: "+environment3.eliminateKanga();
		return message;
		}
		//name kangaroo deleted
		public String showNameKanga (){
			String message = "";
			
			if (environment1.getKangaroo1() != null){
				message += "\n 1."+environment1.getKangaroo1().getName();
			}
			if (environment1.getKangaroo2() != null){
				message += "\n 2."+environment1.getKangaroo2().getName();
			}
			if (environment1.getKangaroo3() != null){
				message += "\n 3."+environment1.getKangaroo3().getName();
			}
			if (environment2.getKangaroo1() != null){
				message += "\n 4."+environment2.getKangaroo1().getName();
			}
			if (environment2.getKangaroo2() != null){
				message += "\n 5."+environment2.getKangaroo2().getName();
			}
			if (environment2.getKangaroo3() != null){
				message += "\n 6."+environment2.getKangaroo3().getName();
			}
			if (environment3.getKangaroo1() != null){
				message += "\n 7."+environment3.getKangaroo1().getName();
			}
			if (environment3.getKangaroo2() != null){
				message += "\n 8."+environment3.getKangaroo2().getName();
			}
			if (environment3.getKangaroo3() != null){
				message += "\n 9."+environment3.getKangaroo3().getName();
			}
			message += "\n 10. Volver a menu.";
			
			return message;
		}
		// name of kangaroo for change
		public String kangaName(){
			String message = "";
			
			if (environment1.getKangaroo1() != null){
				message += "\n 1."+environment1.getKangaroo1().getName();
			}
			if (environment1.getKangaroo2() != null){
				message += "\n 2."+environment1.getKangaroo2().getName();
			}
			if (environment1.getKangaroo3() != null){
				message += "\n 3."+environment1.getKangaroo3().getName();
			}
			if (environment2.getKangaroo1() != null){
				message += "\n 4."+environment2.getKangaroo1().getName();
			}
			if (environment2.getKangaroo2() != null){
				message += "\n 5."+environment2.getKangaroo2().getName();
			}
			if (environment2.getKangaroo3() != null){
				message += "\n 6."+environment2.getKangaroo3().getName();
			}
			if (environment3.getKangaroo1() != null){
				message += "\n 7."+environment3.getKangaroo1().getName();
			}
			if (environment3.getKangaroo2() != null){
				message += "\n 8."+environment3.getKangaroo2().getName();
			}
			if (environment3.getKangaroo3() != null){
				message += "\n 9."+environment3.getKangaroo3().getName();
			}
			return message;
		}
		//name of kangaroo for vowels
		public String nameKvocal(){
		String name = "";
			name += environment1.nameKvocal();
			name += environment2.nameKvocal();
			name += environment3.nameKvocal();
		return name;
		}
		//vaccinate for kangaroos
		public String vacuneKanga (int dayActual, int mesActual, int yearActual){
			String message = "";
			message += environment1.vacuneKanga (dayActual, mesActual, yearActual);
			message += environment2.vacuneKanga (dayActual, mesActual, yearActual);
			message += environment3.vacuneKanga (dayActual, mesActual, yearActual);
			return message;
		}
		//change environment
		//choose kangaroo to change
		public String selectKangaroo (int envi1, int kanga){
			String message = "";
			if (envi1 == 1){
				message += environment1.select(kanga);
			}
			if (envi1 == 2){
				message += environment2.select(kanga);
			}
			if (envi1 == 3){
				message += environment3.select(kanga);
			}
			else {
				message = "Solo numeros entre 1 y 3";
			}
			return message;
		}
		//seletion environment for change
		public KangarooEnvironment getEnvironment(int envi1){
		KangarooEnvironment x = null;
		if (envi1 == 1){
			x = environment1;
		}
		if (envi1 == 2){
			x = environment2;
		}
		if (envi1 == 3){
			x = environment3;
		}
		return x;
		}
		//change kangaroo
		public String kangachange(int kanga, int envi1, int envi2){
			String message = "";
			
			KangarooEnvironment environmentLast = getEnvironment(envi1);
			
			KangarooEnvironment environmentNew = getEnvironment(envi2);
			
			Kangaroo x = environmentLast.select(kanga);
			
			message += environmentNew.addKangaroo(x);
			
			
				message += environmentLast.removeKanga(kanga);
			
			return message;
		}
		//eliminate kangaroo
		
	}
