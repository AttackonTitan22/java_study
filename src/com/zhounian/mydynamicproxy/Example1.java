package com.zhounian.mydynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//这段代码定义了一个接口Hello，其中包含一个sayHello方法。
interface Hello {
    void sayHello();
}

//这段代码实现了Hello接口，并定义了sayHello方法的具体实现，即输出"Hello, World!"。
class HelloImpl implements Hello {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

/*
这段代码定义了一个代理类HelloProxy，它实现了InvocationHandler接口。
在invoke方法中，我们可以在目标方法执行前后添加额外的逻辑。
在这个例子中，我们在目标方法执行前输出"Before method invocation"，
在目标方法执行后输出"After method invocation"。
 */
class HelloProxy implements InvocationHandler {
    private Object target;

    public HelloProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method invocation");
        Object result = method.invoke(target, args);
        System.out.println("After method invocation");
        return result;
    }
}
/*
这段代码是主程序入口。在这里，我们创建了一个HelloImpl对象作为目标对象，
然后创建了一个HelloProxy对象作为代理对象的处理器。
接下来，我们使用Proxy.newProxyInstance方法创建了一个代理对象helloProxy，并将其转型为Hello类型。
最后，我们通过代理对象调用了sayHello方法。运行这段代码，
你会看到在目标方法执行前后分别输出了
"Before method invocation"和"After method invocation"，同时也会输出"Hello, World!"。
 */
public class Example1 {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        //handler中已经重写了接口InvocationHandler中的 invoke方法
        InvocationHandler handler = new HelloProxy(hello);
        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                handler);

        helloProxy.sayHello();
    }
}

