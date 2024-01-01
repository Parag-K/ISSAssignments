package coreJava;

import java.io.IOException;

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling{
    // Method with throws clause
    public static void methodWithThrows() throws IOException {
        // Simulate IOException
        throw new IOException("IOException in methodWithThrows");
    }

    // Method that throws a custom exception
    public static void methodWithThrow() throws CustomException {
        // Simulate throwing a custom exception
        throw new CustomException("CustomException in methodWithThrow");
    }

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            methodWithThrows();
            methodWithThrow();
        } catch (IOException e) {
            // Catching IOException
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (CustomException e) {
            // Catching CustomException
            System.err.println("Caught CustomException: " + e.getMessage());
        } finally {
            // Code in the finally block always executes, regardless of exceptions
            System.out.println("Finally block executed");
        }

        try {
            // Using throw to explicitly throw an exception
            throw new RuntimeException("Explicitly thrown RuntimeException");
        } catch (RuntimeException e) {
            System.err.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
