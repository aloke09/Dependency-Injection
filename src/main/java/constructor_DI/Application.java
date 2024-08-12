package constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application//application context
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config_without_bean.class);
        ConstructorBasedINjection constructorBasedInjection = applicationContext.getBean(ConstructorBasedINjection.class);
        constructorBasedInjection.processMsg("Sending msg from TWITTER!!");

    }
}
