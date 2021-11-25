package com.test.gcp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gcp/test")
public class GcpControllerTest {

    @GetMapping
    public ResponseEntity<?> testGcpController(){

        return ResponseEntity.status(HttpStatus.OK).body("GCP controller is running");
    }

    @GetMapping("/new")
    public ResponseEntity<?> testGcpNewController(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller 2 is running");
    }

}
