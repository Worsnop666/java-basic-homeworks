package ru.java.basic.homeworks.terekhov;

import java.util.Objects;

public class Box {
    private int height;
    private int width;
    private int depth;
    private String color;
    private boolean open = true;
    private String item = null;

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена.");
        System.out.println("Новый цвет коробки: " + color);
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
        if (!open) {
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка открыта");
        }
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public Box(String color, int height, int width, int depth) {
        if (height > 0 && width > 0 && depth > 0) {
            this.width = width;
            this.depth = depth;
            this.height = height;
            System.out.println("Высота коробки: " + height);
            System.out.println("Ширина коробки: " + width);
            System.out.println("Глубина коробки: " + depth);
        } else {
            System.out.println("Введите корректные размеры коробки");
        }
        this.color = color;
        System.out.println("Цвет коробки: " + color);
        System.out.println("Коробка открыта ");
    }

    public void boxInfo() {
        System.out.println("Высота коробки: " + height);
        System.out.println("Ширина коробки: " + width);
        System.out.println("Глубина коробки: " + depth);
        System.out.println("Цвет коробки: " + color);
    }

    public void putItem(String item) {
        if (open) {
            if (this.item  == null) {
                this.item = item;
                System.out.println("Предмет \"" + item + "\" помещен в коробку");
            } else {
                System.out.println("В коробке уже есть предмет");
            }
        } else {
            System.out.println("Откройте коробку, чтоб положить предмет");
        }
    }

    public void outItem() {
        if (open) {
            if (item != null) {
                item = null;
                System.out.println("Предмет выкинут из коробки");
            } else {
                System.out.println("В коробке нет предмета");
            }
        } else {
            System.out.println("Невозможно выкинуть предмет из закрытой коробки");
        }
    }
}

