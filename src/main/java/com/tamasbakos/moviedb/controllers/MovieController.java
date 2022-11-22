package com.tamasbakos.moviedb.controllers;

import com.tamasbakos.moviedb.models.Movie;
import com.tamasbakos.moviedb.services.MovieService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/movies")
public class MovieController {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("endpoints")
  public String endpointsList() {
    return "index";
  }

  @GetMapping
  public List<Movie> listMovies() {
    return movieService.getMovies();
  }

  @GetMapping("{id}")
  public Movie getMovieId(@PathVariable("id") Integer id) {
    return movieService.getMovie(id);
  }

  @PostMapping
  public void addMovie(@RequestBody Movie movie) {
    movieService.addNewMovie(movie);
  }

  @DeleteMapping("{id}")
  public void deleteMovie(@PathVariable("id") Integer id) {
    movieService.deleteMovie(id);
  }
}
