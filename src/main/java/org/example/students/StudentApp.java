package org.example.students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<Integer> grades1 = new ArrayList<>(List.of(3, 5, 4, 3, 4, 4));
        ArrayList<Integer> grades2 = new ArrayList<>(List.of(5, 5, 4, 4, 4, 4));
        ArrayList<Integer> grades3 = new ArrayList<>(List.of(3, 2, 2, 3, 3, 2));

        Student student1 = new Student("Николай", "3130802/30010", 5, grades1);
        Student student2 = new Student("Варвара", "3130802/00010", 6, grades2);
        Student student3 = new Student("Аркадий", "3130802/60010", 1, grades3);

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        printStudents(students, 6);

        removeLowGradeStudent(students);
        upgradeStudents(students);
        printStudents(students, 6);
    }

    // Метод, который удаляет студента со средним баллом <3
    public static void removeLowGradeStudent(Set<Student> students) {
        System.out.println("Студенты у которых средний балл меньше 3-х:");
        ArrayList<Student> toRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.calculateAverageGrade() < 3) {
                toRemove.add(student);
                System.out.println("Студент " + student.getName() + " удален.");

            }
        }

        students.removeAll(toRemove);
        System.out.println("-----------------");
    }

    // Метод, который переводит студента на следующий курс, если средний балл >=3
    public static void upgradeStudents(Set<Student> students) {
        System.out.println("Студенты, которых перевели на следующий курс:");

        for (Student student : students) {
            double averageGrade = student.calculateAverageGrade();

            if (averageGrade >= 3 && student.getCourse() < 6) {
                int oldCourse = student.getCourse();
                student.setCourse(oldCourse + 1);

                System.out.println(student.getName() + " переведен(а) c " + oldCourse + "-го на " + student.getCourse() + "-й курс.");
            }
        }

        System.out.println("-----------------");
    }

    // Метод, который печатает всех учащихся студентов с определенного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + "-м курсе:");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }

        System.out.println("-----------------");
    }
}