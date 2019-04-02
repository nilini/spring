package annotation.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

// 指定该Bean实例的作用域为prototype
@Scope("singleton")
// 指定该类作为Sprign Bean，Bean实例名为chinese
@Component("chinese")
public class Chinese {
    @Resource(name = "steelAxe")
    private Axe axe;

//    @Resource(name="stoneAxe")
//    public void setAxe(Axe axe) {
//        this.axe = axe;
//    }

    public Axe getAxe() {
        return axe;
    }

    @PostConstruct
    public void init(){
        System.out.println("执行初始化方法init...");
    }

    // 只有在bean的作用域为signleton时才生效
    @PreDestroy
    public void close(){
        System.out.println("正在执行销毁之前的close方法...");
    }
}
