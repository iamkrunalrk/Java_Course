public class main {
    public static void main (String[] args) {
        calculator calculator = new calculator();

        // Calling the method with no parameters and no return value
        calculator.sayHello();

        // Calling the method with parameters and a return value
        int result = calculator.add(5, 3);
        System.out.println("Sum: " + result);
    }
}
