package com.niil.annotationshw.models;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Mammals.class)
public @interface Mammal {
    String sound() default "";
    int color() default 0xffffff;
}
