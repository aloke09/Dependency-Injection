package field_DI;

import org.springframework.stereotype.Service;
import field_DI.MessageService;

@Service("Whatsapp")
public class Whatsapp implements MessageService {
    @Override
    public void sendMSG(String msg) {
        System.out.println("message via Whatsapp!!"+msg);
    }
}