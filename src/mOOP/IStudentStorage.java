package mOOP;

public interface IStudentStorage {
    /**
     * хранилище студентов
     *
     * @param student массив студентов
     */
    void put(Student student);

    /**
     * Возвращает первое вхождение студента по имени в хранилище студентов.
     *
     * @param name - имя студента. По данному параметру осуществляется поиск студента в хранилище.
     * @return возвращает экземпляр класса Student найденный в данном хранилище по имени.
     */
    Student[] getFirst(String name);


    /**
     * Получение последнего студента
     *
     * @param name
     * @return возвращает имя студента
     */
    Student getLast(String name);

    /**
     * поиск студента по имени
     *
     * @param name найти студента по имени
     * @return вазвращает  имя студента
     */
    Student[] findByName(String name);

    Student[] getAll();

    Student remove(Student student);


    /**
     * хранилище
     *
     * @return вазвращает  все имена студентов
     */

    void size();


    /**
     * вывод всех студентов
     *
     * @return
     */
    Student[] allstudents();
}
