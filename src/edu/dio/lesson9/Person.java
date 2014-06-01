package edu.dio.lesson9;

import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 01.06.2014.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> mails;
    private Car car;

    public Person(String firstName, String lastName, int age, List<String> mails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mails = mails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMails() {
        return mails;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", mails=").append(mails);
        sb.append(", car=").append(car);
        sb.append('}');
        return sb.toString();
    }
}
