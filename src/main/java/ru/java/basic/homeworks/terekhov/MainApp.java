package ru.java.basic.homeworks.terekhov;


public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Дымок", 25),
                new User("Сергей", 41),
                new User("Алексей", 20),
                new User("Александр", 54),
                new User("Николай", 61),
                new User("Борис", 32),
                new User("Роман", 31),
                new User("Виктория", 40),
                new User("Рамиль", 28),
                new User("Константин", 15)
        };
        for (User user : users) {
            if (user.getAge() >= 40) {
                user.shortInfo();
            }
        }

        Box box = new Box ("Красный",5,5 ,5 );
        box.setColor("Черный");
        box.boxInfo();
        box.outItem();
        box.boxInfo();
    }
}
