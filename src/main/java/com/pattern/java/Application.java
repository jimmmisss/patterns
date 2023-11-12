package com.pattern.java;

import com.pattern.java.model.User;
import com.pattern.java.specification.user.UserArchivedRule;
import com.pattern.java.specification.user.UserEmailRule;
import com.pattern.java.specification.user.UserNameRule;
import com.pattern.java.specification.user.UserPasswordRule;

public class Application {

    public static void main(String[] args) {

        var wesley = new User("Wesley", "jimmmisss@gmail.com", "12345678", false);

        var rules = new UserNameRule()
                .and(new UserPasswordRule())
                .and(new UserEmailRule())
                .andNot(new UserArchivedRule());

        System.out.println(rules.isSatisfied(wesley));

    }

}