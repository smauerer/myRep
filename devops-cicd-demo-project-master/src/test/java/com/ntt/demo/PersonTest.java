package com.ntt.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import org.junit.Test;

public class PersonTest {

    @Test
    public void shouldCalculateAgeCorrectly() {
        final Person person = new Person("John", "Doe", LocalDate.now().minusYears(20));
        assertThat(person.getAge(), equalTo(20));
    }
}
