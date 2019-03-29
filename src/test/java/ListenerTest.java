import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 创建一个ApplicationEvent对象
        EmailEvent ele = new EmailEvent("test","ss@qq.com","this is test");
        // 发布容器
        applicationContext.publishEvent(ele);
    }
}
