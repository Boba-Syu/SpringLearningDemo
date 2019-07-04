##### 该模块介绍了spring bean的自动装配
---
> 我们在配置bean时可以用autowire这个属性设置为byName, 这样spring容器就会在其中找到相对应的bean自动注入进去
>
>在autowire中,如果用byName, 则会根据name值来注入, 如果是byType, 则是根据变量类型来注入