public class doWhileLoop {
    public static void main(String[] args){
        // The do-while loop is similar to the while loop, but it executes the block of code at least once before checking the condition.
        
        int number = 4;

        do{
            System.out.println("Number: " + number);
            number ++;
        } while (number<=2);
    }
}
