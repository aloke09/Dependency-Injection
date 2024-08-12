package constructor_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedINjection
{
    private MessageService messageService;

    @Autowired
    public ConstructorBasedINjection(@Qualifier("Twitter") MessageService messageService)
    {
//        super();
        this.messageService=messageService;

    }
    public void processMsg(String message) {
        messageService.sendMSG(message);
    }
}
