public class App {
    public static void main(String[] args) {
        TriangleExerciseClass task = new TriangleExerciseClass();

        task.printAsterisk();
        System.out.println(); // break line between exercises
        task.printHorizontalLineNTimes(8);
        System.out.println(); // break line between exercises
        task.printVerticalLineNTimes(3);
        System.out.println(); // break line between exercises
        task.printNSizeRightTriangle(3);
        System.out.println(); // break line between exercises

        DiamondExerciseClass task2 = new DiamondExerciseClass();

        task2.printNSizeCenteredTriangle(3);
        System.out.println(); // break line between exercises
        task2.printNSizeDiamondTriangle(3);
        System.out.println(); // break line between exercises
        task2.printNSizeDiamondTriangleWithName(3);
        System.out.println(); // break line between exercises

        FizzBuzzAndPrimeClass task3 = new FizzBuzzAndPrimeClass();
        System.out.println(); // break line between exercises

        task3.FizzBuzz();
        System.out.println(); // break line between exercises

        /*
        The assumption is that generate is supposed to produces a list of integers
        that are both factors of N and are prime numbers
        */
        System.out.println(task3.generate(30));

    }
}
