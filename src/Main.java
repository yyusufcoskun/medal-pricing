//Feyza Öztürk & Yusuf Coskun
//Java medal calculating program - main method class.
//Last edited 7.26 PM 08/04/2022
public class Main {
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to the Medal program. Please construct your medals in the array below.");

		//medals array
	Medals medals[] = {
			new Medals (2,1,"Gold"),
			new Medals (1,1,"gold"),
			new Medals (2,1,"bronze"),
			new Medals (3,3,"hamood"), //Inconsistent types are defaulted to bronze.
			new Medals (4,3, "SIlver"), //Case differences don't matter.
			new Medals (8,-1, "silver"), //Inconsistent values are reset to 0.
			new Medals (2,2, "Silver")
		 };

	
	//total volume, mass and value for loops
	double totalVolume=0.00;
		for(Medals z: medals) {
			if(z!=null){
				totalVolume+=z.volume();
		}
	}
		
	double totalMass=0.00;
		for(Medals k: medals){
			if(k!=null){
				totalMass+=k.mass();
			}
		}
		
	double totalValue=0.00;
		for(Medals i: medals){
			if(i!=null){
				totalValue+=i.value();
		}
	}
	 
		//total volume, mass and value printer
	 	System.out.printf("%nThe total volume of all your medals are " + String.format("%.2f",totalVolume) + " cm³ %n");
		System.out.printf("%nThe total mass of all your medals are " + String.format("%.2f",totalMass) + " g %n");
		System.out.printf("%nThe total value of all your medals are " + String.format("%.2f",totalValue) + " $%n");

	 //display loop of individual characteristics using the toString method.
	 for(int c = 0; c<medals.length; c++){
	 System.out.printf("%n" + medals[c]);
	 }
	}
}
