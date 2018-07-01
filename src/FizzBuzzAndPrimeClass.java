import java.util.ArrayList;

public class FizzBuzzAndPrimeClass {

    private boolean isFactor(int num, int i) {
        return num % i == 0;
    }

    private boolean isPrime(int num) {
        // cannot be a prime number if below 2
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void FizzBuzz() {
        int count = 1;

        while (count <= 100) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz" );
                count += 1;
            } else if (count % 3 == 0) {
                System.out.println("Fizz" );
                count += 1;
            } else if (count % 5 == 0) {
                System.out.println("Buzz" );
                count += 1;
            } else {
                System.out.println(count);
                count += 1;
            }
        }
    }

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (isFactor(n, i) && isPrime(i)) {
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }

}
