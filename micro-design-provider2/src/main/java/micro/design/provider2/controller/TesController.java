package micro.design.provider2.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesController {
    Logger logger = LoggerFactory.getLogger(TesController.class);
    @RequestMapping(value = "/tes/find/",method = RequestMethod.GET)
    public void find() throws InterruptedException {
//        Thread.sleep(3000);
        logger.info("findfrom:provider2");
    }
}
