package setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config_Without_bean.class);
        SetterBasedInjection setterBasedInjection = context.getBean(SetterBasedInjection.class);
        setterBasedInjection.processMsg_setter("SSs");
    }
}
