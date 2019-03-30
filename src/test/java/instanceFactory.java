import intstanceFactory.American;
import intstanceFactory.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class instanceFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("instanceFactoryBeans.xml");
        Chinese chinese = context.getBean("chinese", Chinese.class);
        System.out.println(chinese.sayHello("ss"));
        System.out.println(chinese.sayGoodBye("ss"));

        American american = context.getBean("american", American.class);
        System.out.println(american.sayHello("jj"));
        System.out.println(american.sayGoodBye("jj"));
    }
}
