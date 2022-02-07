package Fuhrpark.Fuhrpark;

public abstract class Auto {
	
	private String marke;
	private int ps;
	private String farbe;
	private String type;
	private int kilometer;
	
	public Auto(String marke, int ps, String farbe, String type) {
		super();
		this.marke = marke;
		this.ps = ps;
		this.farbe = farbe;
		this.type = type;
	}
	
	public void addKilometer() {
		
	}
	

}
