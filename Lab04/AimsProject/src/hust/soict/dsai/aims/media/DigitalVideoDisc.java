package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
//	private String director;
//	private int length;
	static int nbDigitalVideoDiscs = 0;
	private int id;
	public DigitalVideoDisc() {
		super();
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs++;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
//	public DigitalVideoDisc(String title, String category, float cost) {
//		super(title, category, cost);
//		nbDigitalVideoDiscs++;
//		this.id = nbDigitalVideoDiscs;
//	}
//	public String getDirector() {
//		return director;
//	}
//	public int getLength() {
//		return length;
//	}
	public int getnb() {
		return nbDigitalVideoDiscs;
	}
	public String toString() {
		String str = this.id + ". " + "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost();
		return str;
	}

	public boolean isMatch(String title) {
		return this.getTitle() == title;
	}
	public boolean isMatch(int Id) {
		return this.id == Id;
	}
}