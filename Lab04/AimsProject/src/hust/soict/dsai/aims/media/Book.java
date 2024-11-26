package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
	private List<String> authors = new ArrayList<String> ();
	
	public Book() {
		// TODO Auto-generated constructor stub
		
	}
	public Book(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;

	}
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String author) {
		boolean isValid = true;
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(author)) {
				isValid = false;
			}
		}
		if (isValid == true) {
			authors.add(author);
			System.out.println("Adding author successfully");
		} else {
			System.out.println("The author is already in the list");
		}
			
	}
	
	public void removeAuthor(String author) {
		boolean isValid = false;
		int index = -1;
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(author)) {
				isValid = true;
				index = i;
				break;
			}
		}
		if (isValid == false) {
			System.out.println("The author is not valid");
		} else {
			authors.remove(index);
			System.out.println("The author has been removed from the list");
		}
	}

}
