package cn.lzm.beer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerApplication.class, args);
    }

}
