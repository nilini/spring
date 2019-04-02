package annotation.component;

import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "石斧子真慢";
    }
}
