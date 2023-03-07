package mOOP;

public class StudentStorage implements IStudentStorage {
    private static final int DEFAULT_CAPACITY = 10;
    private final Student[] students;
    private int size = 0;

    public StudentStorage(int size) {
        if (size < 1 || size > Integer.MAX_VALUE - Byte.MAX_VALUE) {
            throw new RuntimeException("Invalid storage size");
        }
        this.students = new Student[DEFAULT_CAPACITY];
    }

    @Override
    public void put(Student student) {
        if (size >= students.length)
            throw new RuntimeException("Хранилище студентов переполненно");
        students[size] = student;
        size++;

    }

    @Override
    public Student[] getFirst(String name) {
        for (int i = 0; size > i; i++) {
            if (students[Integer.parseInt(name)].equals(students)) {
                students[Integer.parseInt(name)] = null;
            }
        }
        return students;
    }

    @Override
    public Student getLast(String name) {
        return null;
    }

    @Override
    public Student[] findByName(String name) {
        for (int i = 0; size > i; i++) {
            if (students[Integer.parseInt(name)].equals(students)) {
                students[Integer.parseInt(name)] = null;
            }
        }
        return students;
    }

    @Override
    public Student[] getAll() {
        return new Student[0];
    }

    @Override
    public Student remove(Student student) {
        for (int i = 0; size > i; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
            }
        }
        return student;
    }

    @Override
    public void size() {
        System.out.println(size);
    }

    @Override
    public Student[] allstudents() {
        Student[] studentsNotNull = new Student[size];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                studentsNotNull[i] = students[i];
            }
        }
        return studentsNotNull;
    }
}

