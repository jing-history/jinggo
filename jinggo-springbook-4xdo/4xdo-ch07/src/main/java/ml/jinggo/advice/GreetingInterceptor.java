package ml.jinggo.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author wangyj
 * @description
 * @create 2018-06-07 10:55
 **/
public class GreetingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName = (String)args[0];
        System.out.println("How are you！Mr."+clientName+".");

        Object obj = invocation.proceed();

        System.out.println("Please enjoy yourself!");

        return obj;
    }
}
