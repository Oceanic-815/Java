package test.pack.example1;

public class OOP1Cat {
    int age;
    String name;
    double weight;
    boolean isMale;
    Tail tail; // Композиция (не агрегация), т.к хвост без кошки не может существовать
    Talisman talisman; // Агрегация

    void voice() {
        System.out.println("mew");
    }
    void sleep() {
        System.out.println("hrrr");
    }

    void about() {
        String s = ("Name = "+ name + " Weight = "+ weight + " Gender = "+ isMale + " Age = " + age);
        System.out.println(s);
    }

    // Конструкторы. Пустой конструктор создается вседа автоматически.


    public OOP1Cat() {  // Этот пустой конструктор нужен, если нужно создавать пустые объекты (без ввода параметров)
    }

    public OOP1Cat(int age, String name, boolean isMale) {  // this -
        this.age = age;  // Если бы не было this, мы не отличили бы параметр age  в этом конструкторе от характеристики класса age
        this.name = name;
        this.isMale = isMale;
    }

}
