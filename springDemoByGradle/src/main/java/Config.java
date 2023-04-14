import domain.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("helloworld")
    HelloWorld getHelloWorld() {
        return new HelloWorld("Hello world!");
    }
}
