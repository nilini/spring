import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class factoryBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBeans.xml");
        // 获取FactoryBean的产品
        System.out.println(context.getBean("north"));
        System.out.println(context.getBean("theValue"));

        // 获取FactoryBean本身
        System.out.println(context.getBean("&theValue"));
    }
}
