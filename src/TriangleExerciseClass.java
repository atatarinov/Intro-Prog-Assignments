public class TriangleExerciseClass {

    public void printAsterisk() {
        System.out.println("*" );
    }

    public void printHorizontalLineNTimes(int n) {
        StringBuilder line = new StringBuilder();

        int count = 0;
        while (count < n) {
            line.append("*");
            count += 1;
        }
        System.out.println(line);
    }

    public void printVerticalLineNTimes(int n) {
        int count = 0;
        while (count < n) {
            System.out.println("*");
            count += 1;
        }
    }

    public void printNSizeRightTriangle(int n) {
        int count = 1;
        while (count <= n) {
            printHorizontalLineNTimes(count);
            count += 1;
        }
    }


}
