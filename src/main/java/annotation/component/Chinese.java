package annotation.component;

import org.springframework.stereotype.Component;

@Component
public class Chinese {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
}
