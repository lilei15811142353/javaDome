package newCom.testDome.Dome16_异常处理;

//自定义异常，通常通过继承一个异常类来实现
//1.Throwable
//2.Exception
//3.RuntimeException
//4.自定义异常实现是，提供构造方法
//5.异常对象本身是没有实际功能，只是一个有意思的标识
public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
