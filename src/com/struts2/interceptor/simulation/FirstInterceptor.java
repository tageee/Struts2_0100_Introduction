package com.struts2.interceptor.simulation;

/**
 * Created by tage on 3/15/16.
 */
public class FirstInterceptor implements Interceptor {

    @Override
    public void intercept(ActionInvocation invocation) {
        System.out.println(1);
        invocation.invoke();
        System.out.println(-1);
    }
}
