package test.pack.example3;


public class Horse {
    String name;
    String color;
    int speed;
    int age;
    boolean isMale;


    void eat(){
        System.out.println("Eating... ");
    }
    void about(){
        String gender = (isMale) ? "Male" : "Female"; // Тернарный оператор: Если isMale = true, то Male, иначе Female
        System.out.printf("name is %s age is %d gender is %s\t", name, age, gender);
    }
    void ride(){
        about();
        System.out.println("Riding at speed " + speed);
    }
}
