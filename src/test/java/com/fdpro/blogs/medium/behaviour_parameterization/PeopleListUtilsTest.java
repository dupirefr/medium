package com.fdpro.blogs.medium.behaviour_parameterization;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PeopleListUtilsTest {

    private List<Person> people = Arrays.asList(
      new Person("Robert", 52),
      new Person("Anna", 43),
      new Person("Amelia", 35),
      new Person("Kevin", 16)
    );

    @Test
    void indexOfPersonNamed_Found() {
        int index = PeopleListUtils.indexOfPersonNamed(people, "Anna");
        assertThat(index).isEqualTo(1);
    }

    @Test
    void indexOfPersonNamed_NotFound() {
        int index = PeopleListUtils.indexOfPersonNamed(people, "Willy");
        assertThat(index).isEqualTo(-1);
    }

    @Test
    void indexOfPersonAged_Found() {
        int index = PeopleListUtils.indexOfPersonAged(people, 16);
        assertThat(index).isEqualTo(3);
    }

    @Test
    void indexOfPersonAged_NotFound() {
        int index = PeopleListUtils.indexOfPersonAged(people, 51);
        assertThat(index).isEqualTo(-1);
    }
}