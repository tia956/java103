public class PrimeNumbers {
    public static void main(String[] args) {
        int low = 20, high = 60;
        System.out.println("Prime numbers between " + low + " and " + high + " are:");
        for (int num = low; num <= high; num++) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(num);
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            }
        }
    }
}
