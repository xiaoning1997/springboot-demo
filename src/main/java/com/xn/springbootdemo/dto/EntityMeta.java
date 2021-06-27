package com.xn.springbootdemo.dto;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 功能描述:
 * 实体/字段的元数据信息，用来生成管理后台的页面展示的对Entity/字段的描述文本(for django) <br>
 *
 * 在java中集中管理数据的定义，以减少重复；可以用来生成管理后台，生成数据字典 <br>
 *
 * @author davideuler
 * @version 1.0 10/20/16.
 */
@Target({TYPE, FIELD})
@Retention(RUNTIME)
public @interface EntityMeta {

    /**
     * (Optional) entity或者字段的中文title，默认为entity name或者字段名
     */
    String title() default "";

    /**
     * (Optional) 字段中文描述，用作输入框的help_text/placeholder，默认为字段名或title <br>
     *     有title则默认为title，没有title则默认为entity name或者field name
     */
    String description() default "";

    /**
     *
     * (Optional) 字段英文title，默认为字段名
     */
    String titleEn() default "";

    /**
     * (Optional) 字段英文描述，用作输入框的help_text/placeholder，默认为字段名或title <br>
     *     有title则默认为title，没有title则默认为entity name或者field name
     */
    String descriptionEn() default "";


}