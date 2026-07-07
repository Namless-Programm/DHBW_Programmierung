package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.MovieByRatingDecendingComporator;

public class D35_Comporators {

	public void main(String[] args) {
		List<Movie> movies = new ArrayList<>();

		movies.add(new Movie("John Wickn 4", "2024", 7.6));
		movies.add(new Movie("Der Pate", "1990", 9.2));
		
		System.out.println(movies);
		Collections.sort(movies);
		System.out.println(movies);
		Collections.sort(movies, new MovieByRatingDecendingComporator());
		System.out.println();

	}

}
