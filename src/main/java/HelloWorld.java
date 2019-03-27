public class HelloWorld {
    private String hello;
    private String hello2;
    private ChineseSay chineseSay;

    public void setHello(String hello){
        this.hello = hello;
    }

    public void setHello2(String hello2){
        this.hello2 = hello2;
    }

    public void setChineseSay(ChineseSay chineseSay){
        this.chineseSay = chineseSay;
    }

    public void helloWorld(){
        System.out.println("Spring say: " + hello);
    }

    public void helloWorld2(){
        System.out.println("Spring say2: " + hello2);
    }

    public void helloWorldByChinese(){
        this.chineseSay.say();
    }
}
