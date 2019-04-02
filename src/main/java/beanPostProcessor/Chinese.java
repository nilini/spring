package beanPostProcessor;

import org.springframework.beans.factory.InitializingBean;

public class Chinese implements InitializingBean {
    private String name;

    public Chinese() {
        System.out.println("实例化Chinese.Chinese");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("执行初始化方法Chinese.init");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行初始化方法Chinese.afterPropertiesSet");
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                '}';
    }
}
