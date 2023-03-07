package mOOP;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {

    private final static int DEFAULT_AGE = 15;

    private final String name;
    private int age;
    private double ratingSum;
    private int ratingCount;


    public Student(int name) {
        this(String.valueOf(name), DEFAULT_AGE);
    }

    public Student(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15)
            throw new RuntimeException("Нельзя задавать возраст студента меньше 15");

        if (age > 55)
            throw new RuntimeException("Пенсионеров не обучаем!");

        this.age = age;
    }

    public int getBirthdayYear() {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime birthdayDate = currentDate.minusYears(this.age);
        return birthdayDate.getYear();
    }

    public double getAverageRating() {
        return ratingSum / ratingCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.ratingSum, ratingSum) == 0 && ratingCount == student.ratingCount && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ratingSum, ratingCount);
    }

    public void putRating(int rating) {
        if (!(rating >= 0 && rating <= 5)) {
            throw new RuntimeException("Оценку можно ставить между 0 и 5");
        }
        this.ratingCount++;
        this.ratingSum += rating;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", ratingSum=" + ratingSum +
               ", ratingCount=" + ratingCount +
               '}';
    }
}
