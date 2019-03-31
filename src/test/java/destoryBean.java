import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class destoryBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("destoryBean.xml");
        //Java Runtime注册的ShutdownHook在JVM进程正常关闭（操作系统正常关闭，用户调用System.exit(0), kill, Ctrl+C等）执行，
        // Spring注册这个旨在正常关闭的时候关闭（代码中的doClose()）容器。
        // 关闭容器的时候，会释放所有容器管理Bean，同时如果容器管理Bean声明了销毁回调方法也会执行（典型的就是数据库连接池的关闭，执行线程池的关闭等）以释放资源。
        //不过kill -9，拔电等不在此讨论范围
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
