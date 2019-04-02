package annotation.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

// 指定该Bean实例的作用域为prototype
@Scope("prototype")
// 指定该类作为Sprign Bean，Bean实例名为chinese
@Component("chinese")
public class Chinese {
    private Axe axe;

    @Resource(name="stoneAxe")
    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }
}
