package Autos;

public class BMW extends Auto {
	
	private boolean xDrive;

	public BMW(int ps, String farbe, String type, int kilometer, boolean xDrive) {
		super("BMW", ps, farbe, type, kilometer);
		this.xDrive = xDrive;
	}
	

}
