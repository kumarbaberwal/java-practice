public class method_overloading{
    public int add(int a, int b){ 
        // In java Method Return type is required
        System.out.println("Sum is" + a+b);
        return a + b;
    }
    public void add(int a, int b, int c){
        System.out.println("Sum is" + a+b+c);
        // return a + b;
    }

    public static void main(String[] args) {
        method_overloading obj = new method_overloading();

        obj.add(2, 4);
        obj.add(4, 7, 9);
    }
}