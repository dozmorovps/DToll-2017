package jdev.trackercore;

import jdev.dto.PointDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String...args)throws Exception{
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InjectionContext.class);
    }
}
