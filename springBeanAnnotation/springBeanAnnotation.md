#### 这个模块是利用注解来配置spring
> 在这里, 我们可以用java的注解来达到书写applicationContext.xml同样的配置效果, 这样可以减少书写xml带来的麻烦
>
> 可以发现很多注解的名称和xml中相对应的配置的名称是一样的, 我们只要加在对应的类, 方法或者变量上就可以进行配置
>
> 但是我们需要多写一个配置类, 加上@Configuration注解来表明这是一个spring的配置类, @ComponentScan("com.boba.entity") 表明注解配置的包目录, 它会把带有注解的加入到容器中
>
> 在这时, 我们用的剧不是ApplicationContext类来生成容器了, 而是用AnnotationConfigApplicationContext, 之后的操作就没有太多的变化了