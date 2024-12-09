public class onetohundred {
    public static void main(String[] args) {
        System.out.println("isprime");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; 
            }
        }
        return true; 
    }
}