package field_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appliation3
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config_Without_bean.class);
        FieldBasedInjection fieldBasedInjection=context.getBean(FieldBasedInjection.class);
        fieldBasedInjection.processMsg("------------sent");
    }
}
