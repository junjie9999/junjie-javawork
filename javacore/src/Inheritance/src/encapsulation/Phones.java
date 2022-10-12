package encapsulation;

public class Phones {
	private String brand;
	private int ram;
	private String colour;
	
	
	public int getRam() {
		return ram;
	}
	public void setRam(int rAM) {
		if(rAM>12)
        {
            System.out.println("Invalid RAM size");
        }else {
            this.ram=rAM;
        }
		this.ram = rAM;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
		switch (brand) {
		case "samsung":
			this.brand= brand;
			break;
		default:
			System.out.println("good try");
		
		}
		
	}
	public String getbrand() {
	return brand;	
	}

}
