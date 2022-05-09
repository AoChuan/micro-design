package micro.design.cosumer2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider",fallback = TesFeignImppl.class)
@Component
public interface TesFeign {
    @RequestMapping(value = "/tes/find/",method = RequestMethod.GET)
    public void find();
}
