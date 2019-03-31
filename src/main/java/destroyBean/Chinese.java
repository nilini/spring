package destroyBean;

import org.springframework.beans.factory.DisposableBean;

public class Chinese implements DisposableBean {
    private String name;
    public void setName() {
        System.out.println("Spring执行依赖关系注入.....");
    }

    public Chinese(String name) {
        System.out.println("Spring实例化主调bean：Chinese实例...");
    }

    public void close(){
        System.out.println("正在执行销毁之前的方法close...");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行销毁之前的方法destory...");
    }
}
