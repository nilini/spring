package annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chinese {
    private Axe axe;

    // Spring会自动搜索容器中类型为Axe的实例，并将该Bean实例作为setAxe()方法的参数传入
    @Autowired
    public void setAxe(Axe axe){
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }
}
