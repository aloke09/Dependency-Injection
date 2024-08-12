package qualifier_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application4
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config_With_beans.class);
        MessageProcessor pro = (MessageProcessor)context.getBean(MessageProcessor.class);
        pro.processMsg("aasdf");
    }

}
