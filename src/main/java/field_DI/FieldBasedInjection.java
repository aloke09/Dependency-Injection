package field_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldBasedInjection
{
    @Autowired
    @Qualifier("Email")
    private MessageService messageService;

    public void processMsg(String message) {
        messageService.sendMSG(message);
    }
}
