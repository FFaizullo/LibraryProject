package ru.project.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person {
    private int person_id;
    @Size(min=2, message = "Имя должно содержать 2 или более символов")
    private String name;

    @Min(value = 1900, message = "минимальное значение равно 1900")
    private int yearOfBirth;

    public Person(){}

    public Person(int person_id, String name, int yearOfBirth) {
        this.person_id = person_id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getPerson_id() {
        return person_id;
    }

    public String getName() {
        return name;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
