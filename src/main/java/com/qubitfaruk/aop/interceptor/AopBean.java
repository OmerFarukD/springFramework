package com.qubitfaruk.aop.interceptor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "aopInterceptor")
@ApplicationScoped

public class AopBean {
private static final Long serialVersionUID=1L;
@Inject
private Login login;

public String getAopBean(){
    return login.isLoginMethod("evet");
}
}
