package com.fdpro.blogs.medium.behaviour_parameterization;

import java.util.List;

public class PeopleListUtils {

    public static int indexOfPersonNamed(List<Person> people, String name) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfPersonAged(List<Person> people, int age) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getAge() == age) {
                return i;
            }
        }
        return -1;
    }
}
