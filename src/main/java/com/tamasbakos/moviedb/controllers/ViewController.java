package com.tamasbakos.moviedb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

  public ViewController() {
  }

  @GetMapping()
  public String homepage() {
    return "homepage";
  }
}
