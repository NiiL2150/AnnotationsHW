package com.niil.annotationshw.models;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Mammals {
    Mammal[] value();
}
