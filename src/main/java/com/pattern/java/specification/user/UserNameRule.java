package com.pattern.java.specification.user;

import com.pattern.java.model.User;
import com.pattern.java.specification.abstractions.CompositeRule;

public class UserNameRule extends CompositeRule<User> {
    @Override
    public boolean isSatisfied(User entity) {
        return entity.getName().length() > 2 && !entity.getName().isBlank();
    }
}
