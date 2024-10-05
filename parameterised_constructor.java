public class parameterised_constructor {
    String name;
    int age;
    public parameterised_constructor(String nameString, int age){
        name = nameString;
        this.age = age;
    }

    public static void main(String[] args) {
        parameterised_constructor pc = new parameterised_constructor("Nitesh Kumar", 21);

        System.out.println(pc.name);
        System.out.println(pc.age);
    }
}
