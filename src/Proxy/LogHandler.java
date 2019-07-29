package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {

    private Object targetObject;

    public Object newInstance(Object targetObject){
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("申请人==>");
        for(int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
        Object ret = null;
        try{
            System.out.print("start==>");
            ret = method.invoke(targetObject,args);
            System.out.println("success==>OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error==>请重试");
        }
        return ret;
    }
}
