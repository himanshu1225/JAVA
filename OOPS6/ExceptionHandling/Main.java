public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;
        try {
            // c = divide(a, b);

            // mimicing the Exception
            // throw new Exception("Throwinng the Exception");

            // Custom Exception: You want to throw when something specific to u
            String name = "himanshu";
            if (name.equals("himanshu")) {
                throw new CustomException("User already exists.");
            }
        }
        // You can have multiple catch block to catch the exception
        // Heirarcy / order should be maintain.
        // Ex: Exception should not be before arithmatic bcz then arithmatic exception
        // will never be catched.
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        } finally {
            System.out.println("This will always run");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please dont pass zero");
        }
        // If i want dont want to evaluate only below expression.
        return a / b;
    }

}