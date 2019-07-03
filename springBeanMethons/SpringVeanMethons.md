##### 该模块介绍了spring bean的作用域, 生命周期, 后置处理器和定义继承
---
> spring bean作用域
>
> singleton: 在spring IoC容器仅存在一个Bean实例，Bean以单例方式存在，默认值
>
>  prototype: 每次从容器中调用Bean时，都返回一个新的实例，即每次调用getBean()时，相当于执行newXxxBean() 
>
>  request: 每次HTTP请求都会创建一个新的Bean，该作用域仅适用于WebApplicationContext环境
>
>  session: 同一个HTTP Session共享一个Bean，不同Session使用不同的Bean，仅适用于WebApplicationContext环境
>
>  global-session: 一般用于Portlet应用环境，该运用域仅适用于WebApplicationContext环境

> spring bean生命周期
>
> 初始化方法: init-method 初始化时调用
>
> 销毁方法: destroy-method 被销毁时调用

> spring bean后置处理器
>
> BeanPostProcessor 接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。你也可以在 Spring 容器通过插入一个或多个 BeanPostProcessor 的实现来完成实例化，配置和初始化一个bean之后实现一些自定义逻辑回调方法。

> spring bean定义继承
> 
> Spring Bean 定义的继承与 Java 类的继承无关，但是继承的概念是一样的。你可以定义一个父 bean 的定义作为模板和其他子 bean 就可以从父 bean 中继承所需的配置。
>
>子 bean 的定义继承父定义的配置数据。子定义可以根据需要重写一些值，或者添加其他值。