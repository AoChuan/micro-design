package micro.design.cosumer1.controller;

import micro.design.cosumer1.feign.TesFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesController {

    @Autowired
    TesFeign tesFeign;

    Logger logger = LoggerFactory.getLogger(TesController.class);
    @RequestMapping(value = "/tes/find/",method = RequestMethod.GET)
    public void find(){

        logger.info("gatewayto:cosumer1");
        tesFeign.find();
    }
}
