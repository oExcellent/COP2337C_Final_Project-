
public class Volvo {
	// Private variables
	
	private String make = "Volvo";
	private String model;
	private double s40 = 27700,s60 = 32500,s70 = 36000,s80  = 44000 ,pA = 2200,pB = 3250,paint = 650;
	 

	// Accessors (Getters)
	public double getS40(){
		return this.s40;
	}
	public double getS60(){
		return this.s60;
	}	 	 
	public double getS70(){
		return this.s70;
	}	 
	public double getS80(){
		return this.s80;
	}	 
	public double getPA(){
		return this.pA;
	}
	public double getPB(){
		return this.pB;
	}
	public double getPaint(){
		return this.paint;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
