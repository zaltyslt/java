package org.example;

@FunctionalInterface
public interface Condition {
    boolean test(Person person);
}
