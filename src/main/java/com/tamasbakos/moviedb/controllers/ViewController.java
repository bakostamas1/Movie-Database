package com.tamasbakos.moviedb.controllers;

import com.tamasbakos.moviedb.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

  private final MovieService movieService;

  public ViewController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping()
  public String homepage(Model model) {
    return "homepage";
  }

  @GetMapping("movies")
  public String allMovies(Model model) {
    model.addAttribute("allMovies", movieService.getAllMovies());
    return "currentMovieList";
  }
}
