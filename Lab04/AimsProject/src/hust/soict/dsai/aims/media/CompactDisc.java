package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	private String artist;
	private List<Track> tracks = new ArrayList<Track> ();
	
	public CompactDisc(String title, String artist, List<Track> tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost, String director, String artist, List<Track> tracks) {
		super(title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost, String director, int length, String artist,
			List<Track> tracks) {
		super(title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost, String director) {
		super(title, category, cost, director);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track new_track) {
		boolean isValid = true;
		for (Track track : tracks) {
			if (track.equals(new_track)) {
				isValid = false;
				break;
			}
		}
		if (isValid == false) {
			System.out.println("The track is already on the CompactDisc");
		} else {
			tracks.add(new_track);
		}
	}
	
	
	public void removeTrack(Track removed_track) {
		boolean isValid = false;
		int index = -1;
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).equals(removed_track)) {
				isValid = true;
				index = i;
				break;
			}
		}
		if (isValid == false) {
			System.out.println("The track is already on the CompactDisc");
		} else {
			tracks.remove(index);
		}
	}
	
	public int getLength() {
		int leng = 0;
		for (Track track : tracks) {
			leng += track.getLength();
		}
		return leng;
	}

}
