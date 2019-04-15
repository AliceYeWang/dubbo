package cn.com.wangye.frame.dubbo_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.wangye.frame.dubbo_api.DubboUserService;



@RestController
public class DubboUserController {
    @Autowired
    private DubboUserService dubboUserService;

    @RequestMapping("/dubboHello")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = dubboUserService.sayHi(name);
        return welcome;
    }
}
