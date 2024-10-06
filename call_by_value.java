public class call_by_value{
    public static void main(String[] args) {
        int num = 10;
        test(num);
        System.out.println("Number: " + num);

    }

    public static void test(int num) {
        num = 20;
    }
}