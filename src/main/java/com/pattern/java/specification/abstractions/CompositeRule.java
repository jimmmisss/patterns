package com.pattern.java.specification.abstractions;

import com.pattern.java.specification.conditionals.AndConditionalRule;
import com.pattern.java.specification.conditionals.AndNotConditionalRule;
import com.pattern.java.specification.conditionals.NotConditionalRule;
import com.pattern.java.specification.conditionals.OrConditionalRule;

public abstract class CompositeRule<T> implements Specification<T> {

    public abstract boolean isSatisfied(T entity);

    public CompositeRule<T> and(Specification<T> andRule) {
        return new AndConditionalRule<T>(this, andRule);
    }

    public CompositeRule<T> andNot(Specification<T> andNotRule) {
        return new AndNotConditionalRule<T>(this, andNotRule);
    }

    public CompositeRule<T> or(Specification<T> orRule) {
        return new OrConditionalRule<T>(this, orRule);
    }

    public CompositeRule<T> not(Specification<T> notRule) {
        return new NotConditionalRule<T>(notRule);
    }
}
