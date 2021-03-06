package com.googlecode.greysanatomy.console.command.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 精简指令命名参数
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RiscNamedArg {

    /**
     * 参数在命令中的位置
     *
     * @return
     */
    public String named();

    /**
     * 参数注释
     *
     * @return
     */
    public String description() default "";

    /**
<<<<<<< HEAD
=======
     * 参数注释2
     *
     * @return
     */
    public String description2() default "";

    /**
>>>>>>> pr/8
     * 是否有值
     *
     * @return
     */
    public boolean hasValue() default false;

    /**
     * 参数校验
     *
     * @return
     */
    public ArgVerifier[] verify() default {};

}
