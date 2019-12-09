package hkr.com;

import client.RpcProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import user.User;
import user.UserAction;

@RestController
public class TestController {

    @RequestMapping(value = "/test/1", method = RequestMethod.GET)
    public String test(){
        RpcProxy rpcProxy = new RpcProxy();
        UserAction userAction = rpcProxy.create(UserAction.class);
        User user = new User();
        user.setUserName("hkr");
        user.setUserId(123456L);
        userAction.greet(user);
        String returnValue = userAction.greet2(user);
        User user1 = userAction.copy(user);
        System.out.println("exe");
        return "exe";
    }
}
