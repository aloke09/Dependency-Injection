package setter_DI;

import org.springframework.stereotype.Service;

@Service("Whatsapp")
public class Whatsapp implements MessageService {
    @Override
    public void sendMSG(String msg) {
        System.out.println("message via Whatsapp!!"+msg);
    }
}
