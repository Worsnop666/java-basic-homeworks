package ru.java.basic.homeworks.terekhov;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String surname, String patronymic, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        if (age > 0) {
            this.age = age;
        }
        this.email = email;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic );
        System.out.println("Год рождения: " + age);
        System.out.println("e-mail: " + email);
    }

    public void shortInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
