package com.pattern.java.specification.conditionals;

import com.pattern.java.specification.abstractions.CompositeRule;
import com.pattern.java.specification.abstractions.Specification;

public class NotConditionalRule<T> extends CompositeRule<T> {

    private final Specification<T> specification;

    public NotConditionalRule(Specification<T> specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfied(T entity) {
        return !specification.isSatisfied(entity);
    }
}
