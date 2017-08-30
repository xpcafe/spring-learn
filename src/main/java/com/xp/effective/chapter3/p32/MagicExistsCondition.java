package com.xp.effective.chapter3.p32;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author xp
 */
public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();//返回当前程序正在运行的环境
        context.getRegistry();//返回BeanDefinitionRegistry检查bean定义
        context.getBeanFactory();//返回ConfigurableListableBeanFactory检查bean是否存在，甚至探查bean的属性
        context.getResourceLoader();//返回ResourceLoader所加载的资源
        context.getClassLoader();//返回ClassLoader加载并检查类是否存在

        System.out.println(env.containsProperty("magic"));
        return true;
    }
}
