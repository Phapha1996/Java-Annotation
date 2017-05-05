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
 * @date 2017年4月13日下午2:39:34
 * @version v.0.1
 * <p>Description: 注解学习01，小水果Annotation</p>
 * <a href="http://blog.csdn.net/oh_Maxy/article/details/18558471">注解学习1</a>
 * <a href="http://blog.csdn.net/Victor_Cindy1/article/details/46401671">注解学习2</a>
 */
@Target(ElementType.TYPE)//放在class头顶的注解
@Retention(RetentionPolicy.RUNTIME)//此注解在运行时可以通过反射机制获取
@Documented//生成文档
@Inherited//注解的继承性
public @interface Fruit {
	//水果名
	public String name() default "";
	//水果水分值
	public String value() default "";
	//水果价格
	public int price();
	//是不是瓜类
	public boolean isMelon() default false; 
	
	//水果所属的类型(测试Enum)
	public enum FruitType{WATERMELON,APPLE,ORANGE,OTHER};  
	public FruitType fruitType()default FruitType.OTHER;
}
