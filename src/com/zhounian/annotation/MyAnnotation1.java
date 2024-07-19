package com.zhounian.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//定义一个 Annotation，它的名字是 MyAnnotation1。
// 定义了 MyAnnotation1 之后，我们可以在代码中通过 "@MyAnnotation1" 来使用它。
public @interface MyAnnotation1 {//通过 @interface 定义注解后，该注解不能继承其他的注解或接口。
    //使用 @interface 定义注解时，意味着它实现了 java.lang.annotation.Annotation 接口，即该注解就是一个Annotation。
    //
    //定义 Annotation 时，@interface 是必须的。
}

@MyAnnotation1
class A{


}
