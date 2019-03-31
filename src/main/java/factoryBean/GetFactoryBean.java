package factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Field;

public class GetFactoryBean implements FactoryBean {

    private String targetClass;
    private String targetField;

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

    // 返回工厂Bean所生产的产品
    @Override
    public Object getObject() throws Exception {
        Class<?> aClass = Class.forName(targetClass);
        Field field = aClass.getField(targetField);
        return field.get(null);
    }

    // 获取工厂Bean所生产的产品的类型
    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }

    // 返回该工厂Bean所生产的产品是否为单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
