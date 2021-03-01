import java.util.Scanner;

public class recursionIteration{

    /**
     *  Fibonacci program - Both iterative and recursive versions
     * Fibonacci series - 1,1,2,3,5,8,13....
     * @param args
     */

    public static void main(String[] args) {
        
        // Scanner taking in the user input
        Scanner sc = new Scanner(System.in);

        //nth element input
        System.out.print("Enter the last element of Fibonacci sequence: ");
        int userInput = sc.nextInt();

        //Print out iteration method
        System.out.println("Fibonacci iteration:");
        long start = System.nanoTime();
        
        // long start = System.currentTimeMillis();
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", userInput, fibIteration(userInput));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);

        //Print out recursive method
        System.out.println("Fibonacci recursion:");
        start = System.currentTimeMillis();
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", userInput, fibRecursion(userInput));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
    }

    //Iteration method
    static int fibIteration(int userInput) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < userInput; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive method
    static int fibRecursion(int  userInput) {
        //
        if ((userInput == 1) || (userInput == 0)) {
            return userInput;
        }
        return fibRecursion(userInput - 1) + fibRecursion(userInput - 2);
    }
}