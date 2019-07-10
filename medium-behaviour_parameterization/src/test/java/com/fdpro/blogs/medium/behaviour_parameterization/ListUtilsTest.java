package com.fdpro.blogs.medium.behaviour_parameterization;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListUtilsTest {

    private List<Person> people = Arrays.asList(
      new Person("Robert", 52),
      new Person("Anna", 43),
      new Person("Amelia", 35),
      new Person("Kevin", 16)
    );

    @Test
    void indexOfMatch_PersonNamed_Found() {
        int index = ListUtils.indexOfMatch(people, new Behaviour<Person>() {
            @Override
            public boolean matches(Person input) {
                return input.getName().equals("Anna");
            }
        });
        assertThat(index).isEqualTo(1);
    }

    @Test
    void indexOfMatch_PersonNamed_NotFound() {
        int index = ListUtils.indexOfMatch(people, new Behaviour<Person>() {
            @Override
            public boolean matches(Person input) {
                return input.getName().equals("Willy");
            }
        });
        assertThat(index).isEqualTo(-1);
    }

    @Test
    void indexOfMatch_PersonAged_Found() {
        int index = ListUtils.indexOfMatch(people, new Behaviour<Person>() {
            @Override
            public boolean matches(Person input) {
                return input.getAge() == 16;
            }
        });
        assertThat(index).isEqualTo(3);
    }

    @Test
    void indexOfMatch_PersonAged_NotFound() {
        int index = ListUtils.indexOfMatch(people, new Behaviour<Person>() {
            @Override
            public boolean matches(Person input) {
                return input.getAge() == 51;
            }
        });
        assertThat(index).isEqualTo(-1);
    }

    @Test
    void indexOfMatchWithPredicate_PersonNamed_Found() {
        int index = ListUtils.indexOfMatchWithPredicate(people, input -> input.getName().equals("Anna"));
        assertThat(index).isEqualTo(1);
    }

    @Test
    void indexOfMatchWithPredicate_PersonNamed_NotFound() {
        int index = ListUtils.indexOfMatchWithPredicate(people, input -> input.getName().equals("Willy"));
        assertThat(index).isEqualTo(-1);
    }

    @Test
    void indexOfMatchWithPredicate_PersonAged_Found() {
        int index = ListUtils.indexOfMatchWithPredicate(people, input -> input.getAge() == 16);
        assertThat(index).isEqualTo(3);
    }

    @Test
    void indexOfMatchWithPredicate_PersonAged_NotFound() {
        int index = ListUtils.indexOfMatchWithPredicate(people, input -> input.getAge() == 51);
        assertThat(index).isEqualTo(-1);
    }
}