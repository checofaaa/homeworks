package org.example.students;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    // Конструктор
    public Student(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // Метод для подсчета среднего балла
    public double calculateAverageGrade() {
        int sumGrades = 0;
        for (int grade : grades) {
            sumGrades += grade;
        }

        return (double) sumGrades / grades.size();
    }

    // Для вывода на печать
    @Override
    public String toString() {
        return "Имя: " + name + ", группа: " + group + ", курс: " + course + ", средний балл: " + calculateAverageGrade();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
