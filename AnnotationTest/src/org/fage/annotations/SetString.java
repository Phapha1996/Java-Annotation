package org.fage.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author Fapha
 * @date 2017年4月13日下午3:27:42
 * @version v.0.1
 * <p>Description: 测试属性设置Annotation</p>
 *
 */
@Documented
//可以注解在方法、属性上
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SetString {
	String value() default"";
}
