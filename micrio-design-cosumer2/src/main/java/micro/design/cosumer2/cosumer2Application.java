package micro.design.cosumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"micro.design.cosumer2.feign"})
public class cosumer2Application {
    public static void main(String[] args) {
        SpringApplication.run(cosumer2Application.class);
    }
}
