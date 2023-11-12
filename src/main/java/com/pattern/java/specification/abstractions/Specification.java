package com.pattern.java.specification.abstractions;


public interface Specification<T> {

    boolean isSatisfied(T entity);

}
