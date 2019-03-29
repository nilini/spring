import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener {
    // 该方法会在容器发生时自动触发
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 只处理EmailEvent，模拟发送email通知
        if(event instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent) event;
            System.out.println("需要发送的邮件接受地址 " + emailEvent.getAddress());
            System.out.println("需要发送的邮件的正文 " + emailEvent.getText());
        }else{
            // 其他事件不做任何处理
            System.out.println("其他事件 " + event);
        }
    }
}
