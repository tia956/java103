public class DivisibleBySeven {

    public static void main(String[] args) {
        // Loop from 200 to 800
        for (int i = 200; i <= 800; i++) {
            // Check if the current number is divisible by 7
            if (i % 7 == 0) {
                // If divisible, print the number
                System.out.println(i);
            }
        }
    }
}
