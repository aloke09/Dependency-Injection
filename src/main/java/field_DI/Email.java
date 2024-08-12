package field_DI;

import org.springframework.stereotype.Service;
import field_DI.MessageService;

@Service("Email")
public class Email implements MessageService {
    @Override
    public void sendMSG(String msg) {
        System.out.println("message via email!!"+msg);
    }
}
