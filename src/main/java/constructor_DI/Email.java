package constructor_DI;

import org.springframework.stereotype.Service;

@Service("Email")
public class Email implements MessageService{
    @Override
    public void sendMSG(String msg) {
        System.out.println("message via email!!");
    }
}
