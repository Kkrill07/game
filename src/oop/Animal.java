package oop;

public class Animal {

    private String name;
    private Double weight;
    private String color;
    private String view;
    private Animal family;

    public Animal(String name, Double weight, String color, String view) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.view = view;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "name='" + name + '\'' +
               ", weight=" + weight +
               ", color='" + color + '\'' +
               ", view='" + view + '\'' +
               ", family=" + family +
               '}';
    }

    /***
     ИМЯ
     */
    String getName() {
        return "His name is " + name;
    }

    void setName(String name) {
        if (name == null || name.length() < 3) {
            return;
        }
        this.name = name;
    }


    /***
     ВЕС
     */
    Double getWeight() {
        return Double.valueOf("видите " + weight);
    }

    void setWeight(Double weight) {

        if (weight == null) {
            return;
        }
        this.weight = weight;
    }


    /***
     ЦВЕТ
     */


    String getColor() {
        return "видите цвет " + color;
    }

    void setColor(String color) {
        if (color == null || color.length() < 10) {
            return;
        }
        this.color = color;
    }


    /***
     * ВИД
     */


    String getView() {
        return "видите вид " + view;
    }

    void setView(String view) {
        if (view == null) {
            return;
        }
        this.view = view;
    }


    /***
     * семейство
     */


    String getFamily() {
        return "видите семейство " + family;
    }

    void setFamily(Animal family) {
        if (family == null) {
            return;
        }
        this.family = family;
    }

}


