package qualifier_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("qualifier_DI")
public class Config_With_beans
{
    @Bean(name="email")
    public MessageService email()
    {
        return new Email();
    }

    @Bean(name="whatsapp")
    public MessageService whatsapp()
    {
        return new Whatsapp();
    }
    @Bean(name="twitter")
    public MessageService twitter()
    {
        return new Twitter();
    }
}
