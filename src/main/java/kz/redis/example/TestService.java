package kz.redis.example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;


@Service
public class TestService {

    @Cacheable("testt")
    public List<Map<String, String>> test() {
        List<Map<String, String>> maps = List.of(Collections.singletonMap("value", "vasya"));
        System.out.println("test()");
        return maps;
    }
}
