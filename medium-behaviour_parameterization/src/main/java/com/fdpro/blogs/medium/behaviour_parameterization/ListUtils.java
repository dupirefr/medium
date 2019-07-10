package com.fdpro.blogs.medium.behaviour_parameterization;

import java.util.List;
import java.util.function.Predicate;

public class ListUtils {

    public static <T> int indexOfMatch(List<T> elements, Behaviour<T> matcher) {
        for (int i = 0; i < elements.size(); i++) {
            if (matcher.matches(elements.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int indexOfMatchWithPredicate(List<T> elements, Predicate<T> matcher) {
        for (int i = 0; i < elements.size(); i++) {
            if (matcher.test(elements.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
