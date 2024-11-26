package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
//	public Media (String title, String category, float cost) {
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
