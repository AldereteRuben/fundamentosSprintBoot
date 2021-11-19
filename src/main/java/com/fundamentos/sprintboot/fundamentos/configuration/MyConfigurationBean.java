package com.fundamentos.sprintboot.fundamentos.configuration;

import com.fundamentos.sprintboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
    @Bean
    public MyOperation beanOperationOper(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOpera(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
