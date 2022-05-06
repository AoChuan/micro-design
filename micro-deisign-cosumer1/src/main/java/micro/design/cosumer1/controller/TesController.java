package micro.design.cosumer1.controller;

import micro.design.cosumer1.feign.TesFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("tes/")
public class TesController {

    @Autowired
    TesFeign tesFeign;
    @RequestMapping("find/")
    public void find(){
        tesFeign.find();
    }
}
