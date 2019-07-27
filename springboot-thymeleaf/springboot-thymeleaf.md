#### 这是一个springboot中thymeleaf的使用样例
> thymeleaf用于HTML的渲染, 将信息在HTML中正确的现实出来
>
> Thymeleaf标准方言:
>> ${...} :  变量表达式, spring的模型属性的信息
>>
>> *{...} : 选择表达式, 获取object的值, 从之前选择了的对象中获取而不是像${...}一样全局获取
>>
>> \#{...} : 消息 (i18n) 表达式, 从.properties等文件中读取的信息, 默认在messages.properties中读取
>>
>> @{...} : 链接 (URL) 表达式, 链接URL表达式
>>
>> ~{...} : 片段表达式
>
>> th:text 用于输出文本值
>>
>> th:value 将值放在input标签中 
>>
>> th:if 判断
>> th:switch 选择
>> th:case 和th:switch联合使用
>>
>> th:each 迭代遍历  