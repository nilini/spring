package beanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强处理...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之后对" + beanName + "进行增强处理...");
        if(bean instanceof Chinese){
            // 修改其name成员变量
            Chinese c = (Chinese) bean;
            c.setName("ios 讲义");
        }
        return bean;
    }
}
