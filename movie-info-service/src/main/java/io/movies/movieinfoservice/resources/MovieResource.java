package io.movies.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.movies.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId)
	{
		return new Movie(movieId, "The Test", "This is a test movies");
	}

}
