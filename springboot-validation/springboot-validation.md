#### 这是一个springboot中数据校验的例子
> @Null 必须为空
>   
>  @NOtNUll 不能为空
>
> @AssertTrue 布尔值必须为 true
>   
> @AssertFalse 布尔值必须为 false
>   
> @Past 时间是过去的时间（比如现在是2018-08-12 15:43:23，如果传过来的值在此时间之后就报错）
>   
> @Feauture 时间是未来时间
>   
> @NotBlank 字符串不能是 null，且长度大于 0
>
> @Email 字符串必须是邮箱
>   
> @NotEmpty 字符串必须非空
>   
> @Min(10) 数字必须大于等于10
>   
> @Max(20) 数字必须小于等于20
>   
> @Size(min=1, max=10) 元素范围是 1-10（可以是字符串，数组，集合，Map 等）
>   
> @Length(min=1, max=10) 字符串长度范围在 1-10 之间
>   
> @Pattern(regexp = "0[0123]") 只能是 00或01或02或03
>
> @Valid 级联注解（如果当前属性是一个 JavaBean ，这个 bean 里面的字段也要验证）