import domain.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by MI on 2019/7/5.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
    }
}
