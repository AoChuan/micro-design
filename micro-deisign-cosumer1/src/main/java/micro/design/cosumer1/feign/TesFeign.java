package micro.design.cosumer1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider",fallback = TesFeignImppl.class)
@Component
public interface TesFeign {
    @RequestMapping("/tes/find")
    public void find();
}
