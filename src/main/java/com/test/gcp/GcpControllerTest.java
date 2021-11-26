package com.test.gcp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GcpControllerTest {

    @GetMapping("")
    public ResponseEntity<?> testGcpController(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller is up");
    }

    @GetMapping("/gcp/test")
    public ResponseEntity<?> testGcpController3(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller is running");
    }

    @GetMapping("/CiCd")
    public ResponseEntity<?> testGcpNewController(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller 2 is running");
    }

    @GetMapping("/devTest")
    public ResponseEntity<?> testGcpNewController4(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller is running after dev");
    }

    @GetMapping("/devTestDemo")
    public ResponseEntity<?> testGcpNewController6(){
        return ResponseEntity.status(HttpStatus.OK).body("GCP controller is dev demo");
    }

}
