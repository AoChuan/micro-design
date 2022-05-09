package micro.design.cosumer2.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TesFeignImppl implements TesFeign{
    Logger logger = LoggerFactory.getLogger(TesFeignImppl.class);
    @Override
    public void find() {
        logger.error("cosumer2:findError");
    }
}
