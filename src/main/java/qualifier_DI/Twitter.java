package qualifier_DI;

import org.springframework.stereotype.Service;

@Service("Twitter")
public class Twitter implements MessageService {
    @Override
    public void sendMSG(String msg) {
        System.out.println("message via twitter!!");
    }
}
