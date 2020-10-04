package com.sample.demo.app.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HealthCheck {
  @GetMapping("/health")
  public String health() {
    return "The app is up";
  }
}
