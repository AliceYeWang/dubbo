package cn.com.wangye.frame.dubbo_provider;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class DubboStart {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( 
                "applicationContext.xml"); 
        System.out.println("start---wwwwyyyyy");
        System.in.read();
    }
}
