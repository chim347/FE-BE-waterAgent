package kh.com.wa.rest.controller;

import kh.com.wa.rest.dto.TestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/double/word")

    public ResponseEntity<String> returnDoubleWord(@RequestParam String word) {
        String returnWord = word + " " + word;
        return ResponseEntity.ok(returnWord);
    }
}
