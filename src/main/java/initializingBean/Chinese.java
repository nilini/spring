package initializingBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Chinese implements InitializingBean, BeanNameAware, ApplicationContextAware {
    private String num;

    public void setNum(String num) {
        System.out.println("Spring调用setNum执行依赖注入...");
    }

    // 实现InitializingBean接口必须实现的方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行初始化方法afterPropertiesSet....");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("====设置beanName====");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("========设置applicationContext==========");
    }

    public Chinese() {
        System.out.println("Spring实例化主调bean: Chinese实例....");
    }
    //测试用的初始化方法
    public void init(){
        System.out.println("执行初始化方法init.......");
    }

}
