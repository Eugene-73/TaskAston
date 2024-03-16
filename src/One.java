public class One {
    public One() {
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        if (a > b) {
            System.out.println("а больше b");
        } else if (a < b) {
            System.out.println("а меньше b");
        } else {
            System.out.println("а равно b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
        System.out.println("Напоминаю, что на ноль делить нельзя!!");
    }
}
