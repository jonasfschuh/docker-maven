package io.github.jonasfschuh.dockermaven.docker_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Maven Docker Plugin!";
    }
}
