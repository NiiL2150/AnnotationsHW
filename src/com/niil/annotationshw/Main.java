package com.niil.annotationshw;

import com.niil.annotationshw.models.*;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args){
        Animal[] animals = {
                new Cat(),
                new Elephant(),
                new Giraffe(),
                new Hippopotamus(),
                new Rhinoceros()
        };

        for(Animal animal : animals) {
            Class<? extends Animal> animalClass = animal.getClass();
            System.out.println(animalClass.getSimpleName());
            Annotation[] annotations = animalClass.getAnnotations();
            for(Annotation annotation : annotations) {
                if(annotation instanceof Mammals) {
                    Mammals mammals = (Mammals)annotation;
                    for(Mammal mammal : mammals.value()) {
                        System.out.println("\t" + mammal.annotationType().getName());
                        System.out.println("\t\t" + mammal.color());
                        System.out.println("\t\t" + mammal.sound());
                    }
                } else if (annotation instanceof Mammal) {
                    Mammal mammal = (Mammal)annotation;
                    System.out.println("\t" + mammal.annotationType().getName());
                    System.out.println("\t\t" + mammal.color());
                    System.out.println("\t\t" + mammal.sound());
                }
            }
            System.out.println();
        }
    }
}
