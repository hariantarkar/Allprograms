public class PrimeFact {
    public static void main(String[] args) {
        int n = 12; // You can change this value or take user input

        System.out.print("Prime factors: ");
        
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still greater than 2, then n is a prime number
        if (n > 2) {
            System.out.print(n);
        }
    }
}
