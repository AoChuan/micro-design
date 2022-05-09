package micro.design.cosumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"micro.design.cosumer1.feign"})
public class cosumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(cosumer1Application.class);
    }
}
