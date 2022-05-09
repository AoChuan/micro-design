package micro.design.provider2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("tes/")
public class TesController {
    Logger logger = LoggerFactory.getLogger(TesController.class);
    @RequestMapping("find/")
    public void find(){
        logger.info("findfrom:provider2");
    }
}
