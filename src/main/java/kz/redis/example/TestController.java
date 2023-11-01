package kz.redis.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public ResponseEntity<List<Map<String, String>>> test() {
        return ResponseEntity.ok(testService.test());
    }
}
