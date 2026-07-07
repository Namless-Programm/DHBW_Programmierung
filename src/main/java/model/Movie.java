package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie implements Comparable<Movie>{
	private final String title;
	private final String publishingYear;
	private double rating;
	
	@Override
	public int compareTo(Movie otherMovie) {			
	return title.compareTo(otherMovie.getTitle());
	}
}
