package cn.com.wangye.frame.dubbo_provider;


import cn.com.wangye.frame.dubbo_api.DubboUserService;

public class DubboUserServiceImpl implements DubboUserService{
    public String sayHi(String s) {
        return "hello " + s + "!";
    }
}