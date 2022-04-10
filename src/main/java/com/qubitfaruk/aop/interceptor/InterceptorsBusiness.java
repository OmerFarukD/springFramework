package com.qubitfaruk.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@IntereptorYolKesici
public class InterceptorsBusiness {
    @AroundInvoke public  Object loglama(InvocationContext context){
        System.out.println("ilk hali: "+context.getMethod().getName());
        boolean isLogin=false;
        Object isContiniue=null;
        if (isLogin){
            System.out.println("sisteme giriş yapınız.");
            return null;
        }
        else{
            try{
                isContiniue=context.proceed();
                System.out.println("sonraki hali : "+isContiniue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContiniue;
        }
    }

}
