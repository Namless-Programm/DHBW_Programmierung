package model;

import java.util.Comparator;

import lombok.Data;

@Data
public class MovieByRatingDecendingComporator implements Comparator<Movie> {@Override
	public int compare(Movie movie1, Movie movie2) {
	
	return Double.compare(movie2.getRating(), movie1.getRating());
			
//		Double rating1 = movie1.getRating();
//		Double rating2 = movie2.getRating();
//		return rating2.compareTo(rating1);
		
		//return Double.valueOf(movie2.getRating()).compareTo(movie1.getRating());
		
	}

}
