package lookUpMethod;

public abstract class FruitPlate {
    public abstract Fruit getFruit();
    public void talkAboutFruit(){
        System.out.println("你看我的水果：" + getFruit());
    }
}
