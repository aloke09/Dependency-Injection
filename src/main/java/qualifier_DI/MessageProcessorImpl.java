package qualifier_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor
{
    private MessageService messageService;

    // setter based DI
    @Autowired
    @Qualifier("twitter")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    // constructor based DI
//    @Autowired
//    public MessageProcessorImpl(@Qualifier("Twitter") MessageService messageService) {
//        this.messageService = messageService;
//    }

    @Override
    public void processMsg(String message) {
        messageService.sendMSG(message);

    }
}
