package AutoTest;

public abstract class Auto {
	
	private String marke;
	private int ps;
	private String farbe;
	private String type;
	private int kilometer;
	
	public Auto(String marke, int ps, String farbe, String type, int kilometer) {
		super();
		this.marke = marke;
		this.ps = ps;
		this.farbe = farbe;
		this.type = type;
		this.kilometer = kilometer;
	}
	
	public void addKilometer(int newKilometer) {
		this.kilometer += newKilometer;
	}
	
}
