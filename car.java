public class car{
    String color;
    String model;
    int year;

    public void displayinfo(){
        System.out.println("color: " + color);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }

    public static void main(String [] args){
        car myCar = new car();
        myCar.color = "Yellow";
        myCar.model = "HP";
        myCar.year = 2024;

        myCar.displayinfo();
    }
}