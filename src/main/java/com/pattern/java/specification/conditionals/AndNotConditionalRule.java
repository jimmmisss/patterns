package com.pattern.java.specification.conditionals;

import com.pattern.java.specification.abstractions.CompositeRule;
import com.pattern.java.specification.abstractions.Specification;

public class AndNotConditionalRule<T> extends CompositeRule<T> {

    private final Specification<T> left;
    private final Specification<T> right;

    public AndNotConditionalRule(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfied(T entity) {
        return left.isSatisfied(entity) && !right.isSatisfied(entity);
    }
}
