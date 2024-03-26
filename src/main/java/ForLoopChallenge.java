public class ForLoopChallenge {
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 1; i <= 1000; i++){
            if (isPrime(i)){
                cont++;
            }
            System.out.println((isPrime(i) ? i + " is Prime" : i + " is not Prime"));
        }
        System.out.println("Number of primes from 1 to 1000 are: " + cont + " numbers.");
    }
    private static boolean isPrime(int number) {
        if(number<=1) {
            return false;
        }
        else if(number==2) {
            return true;
        }
        else if(number%2==0) {
            return false;
        }
        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
