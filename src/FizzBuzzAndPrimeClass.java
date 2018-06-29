public class FizzBuzzAndPrimeClass {

    public void FizzBuzz() {
        int count = 1;

        while (count <= 100) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
                count += 1;
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
                count += 1;
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
                count += 1;
            } else {
                System.out.println(count);
                count += 1;
            }
        }
    }
}
