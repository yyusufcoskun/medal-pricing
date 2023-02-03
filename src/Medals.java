//Feyza Öztürk & Yusuf Coskun
//Java medal calculating program - medals class.
//Last edited: 7.19 PM 08/04/2022
public class Medals {

	private double radius;
	private double thickness;
	private String type;
	
	public double goldPrice = 61.97;
	public double silverPrice = 24.42;
	public double bronzePrice = 7.89;

		 
	
	//densities are physical constants
	static final double densitygold=19.3;
	static final double densitysilver=10.49;
	static final double densitybronze=8.73;
	
	//get and set price methods
	public void setGoldPrice(double gp){
	 	this.goldPrice = gp;
	 }
	 	  
	 public double getGoldPrice(){
	 	return goldPrice;
	 }
	 	 
	 public void setSilverPrice(double sp){
	 	this.silverPrice = sp;
	 }
	  
	 public double getSilverPrice(){
	 	return silverPrice;
	 }

	public void setBronzePrice(double bp){
	 	this.bronzePrice = bp;
	 }
	  
	 public double getBronzePrice(){
	 	return bronzePrice;
	 }

	//get and set radius, thickness methods. get type method.
	public void setRadius(double r) {
	      if (r > 0.0) 
	         this.radius = r;
	      else
	         this.radius = 0.0;
	}
	public double getRadius() {
	      return this.radius;
	}
	
	public void setThickness(double t) {
	      if (t > 0.0) 
	         this.thickness = t;
	      else
	         this.thickness = 0.0;
	}
	public double getThickness() {
	      return this.thickness;
	}
	
	public String getType() {
	      return type;
	}

	
	//3 argument constructor: gets radius, thickness and type
	public Medals(double radius, double thickness, String type) {
		setRadius(radius);
		setThickness(thickness);
		if (type.equalsIgnoreCase("gold") || type.equalsIgnoreCase("silver") || type.equalsIgnoreCase("bronze") ) { 
	         this.type = type;
	         }
	      else
	         this.type = "bronze";
	}
	
	//one argument constructor: gets type
	public Medals(String type) {
		this(1,0.2,type);
	}
	//no argument constructor
	public Medals() {
		this(1,0.2,"Bronze");
	}
	//a copy constructor
	public Medals(Medals medals) {
		this(medals.getRadius(),medals.getThickness(),medals.getType());
		}
	
	//no parameter setMedal method
	public void setMedal() {
        this.setRadius(1.0);
        this.setThickness(0.2);
	}
   //two parameter setMedal method	
	public void setMedal(double radius, double thickness, String type) {
		this.setRadius(radius);
        this.setThickness(thickness);
	}
	
	
	//volume method
	public double volume(){
		double volume = Math.PI * (getRadius()*getRadius()) * getThickness();
		return volume;
	 }

	//mass method
	public double mass(){ 
		double mass = 0;
		if(type.equalsIgnoreCase("Gold")){
		mass= volume() * densitygold; 		
		}
		else if(type.equalsIgnoreCase("Silver")) {
			mass= volume() * densitysilver; 		
		}
		else if (type.equalsIgnoreCase("Bronze")) {
			mass= volume() * densitybronze;  
		}
		return mass;			
	}	
	
	//value method
	public double value(){
		double value = 0;
 		if(type.equalsIgnoreCase("Gold")) {
		 value= mass()*getGoldPrice();
 		
 		}else if(type.equalsIgnoreCase("Silver")) {
 		 value = mass()*getSilverPrice();
 		}else if(type.equalsIgnoreCase(("Bronze"))){
 			value = mass()*getBronzePrice();
 		}
 		return value;
	}
	
	
	//toString method to display the characteristics of a medal.
	public String toString(){  
		  return "You have calculated a medal of " + getType() +" type with a "+String.format("%.2f",getRadius())+" cm radius and  "+String.format("%.2f",getThickness())+ " cm thickness for: " + String.format("%.2f",value()) + " $";  
		 } 

}
