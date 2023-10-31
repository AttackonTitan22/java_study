package com.zhounian.exceptest;

public class ExcepTest8 {
    public static void main(String[] args)
    {
        Demo d = new Demo();
        try
        {
            int x = d.div(4,-9);
            System.out.println("x="+x);
        }
        catch (FuShuException e)
        {
            System.out.println(e.toString());
            //System.out.println("除数出现负数了");
            System.out.println("错误的负数是："+e.getValue());
        }
        catch (Exception e)
        {//大的异常放在下方,小的异常放在上方
            System.out.println(e.getMessage());
        }
        System.out.println("over");
    }

}
//负数检查异常
class FuShuException extends Exception //getMessage();
{
    private int value;
    FuShuException()
    {
        super();
    }
    FuShuException(String msg,int value)
    {
        super(msg);
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }
}

class Demo
{
    int div(int a,int b)throws FuShuException
    {
        if(b<0) {
            // 手动通过throw关键字抛出一个自定义异常对象。
            throw new FuShuException("出现了除数是负数的情况------ / by fushu",b);
        }
        return a/b;
    }
}


