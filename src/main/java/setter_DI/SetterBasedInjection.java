package setter_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedInjection
{
    private MessageService messageService;

    @Autowired
    public void SetMessageService(@Qualifier("Whatsapp") MessageService messageService)
    {
        this.messageService=messageService;
    }
    public void processMsg_setter(String message) {
        messageService.sendMSG(message);
    }
}
