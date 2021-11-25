package com.test.gcp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gcp/test")
public class GcpControllerTest {

    @GetMapping
    public ResponseEntity<?> testGcpController(){
        return ResponseEntity.accepted().body("GCP controller is running");
    }
}
