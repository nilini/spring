package beanNameAware;

import org.springframework.beans.factory.BeanNameAware;

// Spring容器会检测容器中的所有Bean，如果发现某个Bean实现了BeanNameAware接口，Spring容器
// 就会在创建该Bean之后，自动调用该Bean的setBeanName()方法，调用该方法，会将该Bean的id作为
// 参数传给该方法
public class Chinese implements BeanNameAware {
    // 保存部署该Bean时指定的id属性
    private String beanName;
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
    public void info(){
        System.out.println("Chinese实现类" + ", 部署该Bean时指定的id为" + beanName);
    }
}
