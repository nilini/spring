package annotation.component;

import org.springframework.stereotype.Component;

@Component
public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "钢斧子真快";
    }
}
