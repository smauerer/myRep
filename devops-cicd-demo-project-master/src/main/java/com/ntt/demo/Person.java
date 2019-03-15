package com.ntt.demo;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;

    int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public Person(final String firstName, final String lastName, final LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
