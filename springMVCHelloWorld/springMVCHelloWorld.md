#### 这是一个springMVC的demo
> springMVC容器是spring的子容器
>
> springMVC的重要组件
>
>> DispatcherServlet: 前置控制器, 接收所有请求
>>
>> HandlerMapping: 解析所有DispatcherServlet接收的请求, 判断具体要之心的方法
>>
>> HandlerAdapter: 负责对不同请求调用不同的方法
>>
>> ViewResolver: 视图解析器, 跳转到请求相对应的页面
>
> Spring MVC的请求流程：
>> 第一步：发起请求到前端控制器(DispatcherServlet)
>>
>> 第二步：前端控制器请求HandlerMapping查找Handler可以根据xml配置、注解进行查找
>>
>> 第三步：处理器映射器HandlerMapping向前端控制器返回Handler
>> 
>> 第四步：前端控制器调用处理器适配器去执行Handler
>>
>> 第五步：处理器适配器去执行Handler
>>
>> 第六步：Handler执行完成给适配器返回ModelAndView
>>
>> 第七步：处理器适配器向前端控制器返回ModelAndView。ModelAndView是springmvc框架的一个底层对象，包括 Model和view
>>
>> 第八步：前端控制器请求视图解析器去进行视图解析，根据逻辑视图名解析成真正的视图(jsp)
>>
>> 第九步：视图解析器向前端控制器返回View
>>
>> 第十步：前端控制器进行视图渲染。视图渲染将模型数据(在ModelAndView对象中)填充到request域
>>
>> 第十一步：前端控制器向用户响应结果