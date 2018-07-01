public class App {
    public static void main(String[] args) {
        TriangleExerciseClass task = new TriangleExerciseClass();

        task.printAsterisk();
        task.printHorizontalLineNTimes(8);
        task.printVerticalLineNTimes(3);
        task.printNSizeRightTriangle(3);

        DiamondExerciseClass task2 = new DiamondExerciseClass();

        task2.printNSizeCenteredTriangle(3);
        task2.printDiamondTriangle(3);
        task2.printDiamondWithName(3);

        FizzBuzzAndPrimeClass task3 = new FizzBuzzAndPrimeClass();

        task3.FizzBuzz();

        /*
        The assumption is that generate is supposed to produces a list of integers
        that are both factors of N and are prime numbers
        */
        System.out.println(task3.generate(30));

    }
}
