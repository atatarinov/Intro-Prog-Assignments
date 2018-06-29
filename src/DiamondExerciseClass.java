import java.util.Arrays;

public class DiamondExerciseClass {

    public void addToTriangle(String[] triangle, int mid, int distance) {
        triangle[mid - distance] = "*";
        triangle[mid + distance] = "*";
    }

    public void printTriangle(String[] triangle) {
        System.out.println(String.join("", triangle));
    }

    public void printNSizeCenteredTriangle(int n) {
        if (n == 0) {
            System.out.println("");
        } else {

            int triangleSize = ((n - 1) * 2) + 1;
            String[] triangle = new String[triangleSize];
            Arrays.fill(triangle, " " );

            int mid = triangle.length / 2;
            triangle[mid] = "*";

            int count = 1;

            printTriangle(triangle);

            while (count < n) {
                addToTriangle(triangle, mid, count);
                printTriangle(triangle);
                count += 1;
            }
        }
    }

}
