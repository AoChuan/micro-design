import micro.design.gateway.gatewayApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootTest(classes ={gatewayApplication.class} )
public class Test {

    @org.junit.jupiter.api.Test
    public void remove(){
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(integers);
    }
}
