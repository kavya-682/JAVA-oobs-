package in.java;


//define a class OS that has a name and size property
class OS{
	private String name;
	private int size;
	
	//Constructor for os and size
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
}

//define class Charger that has a brand and voltage
class Charger{
	private String brand;
	private float voltage;
	
	//Constructor
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
     
	//getters
	public String getBrand() {
		return brand;
	}

	public float getVoltage() {
		return voltage;
	}
	
}

//define a class Mobile that has an OS and a methods takes charger object 
class Mobile{
	 OS os = new OS("Android", 512);
	 
	 void hasA(Charger c)
	 {
		 System.out.println(c.getBrand());
		 System.out.println(c.getVoltage());
	 }
	
}

//main class
public class AggregationAndCompositionUingMobileInformation {

	public static void main(String[] args) {
		//create charger object
		Charger c = new Charger("Aamsung",24.5f);
		
		//create mobile object 
		Mobile m = new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		//call the hasA mehod of all Mobile object
		m.hasA(c);
        
		//set the Mobile object to null(deallocate memory)
		m = null;
		System.out.println(c.getBrand());
		 System.out.println(c.getVoltage());
		 
		
	}

}
