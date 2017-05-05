package org.fage.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author Fapha
 * @date 2017年4月13日下午4:29:08
 * @version v.0.1
 * <p>Description: 声明这是一个bean</p>
 *
 */
@Inherited//注解可以被继承
@Documented//文档化
@Retention(RetentionPolicy.RUNTIME)//可以被反射获取
@Target(ElementType.TYPE)//注解在类头顶的类型
public @interface Bean {
	String value() default"This is a JavaBean";
}
