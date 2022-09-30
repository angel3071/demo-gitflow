package com.example.demogitflow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingController {

  @GetMapping("/ping")
  public String ping() {
    log.info("Entering method ping");
    log.info("Done with method ping");
    return "pong";
  }
}
