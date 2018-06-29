import java.util.Arrays;

public class DiamondExerciseClass {

    private void addToTriangle(String[] triangle, int mid, int distance) {
        triangle[mid - distance] = "*";
        triangle[mid + distance] = "*";
    }

    private void printTriangle(String[] triangle) {
        System.out.println(String.join("", triangle));
    }

    private void removeFromTriangle(String[] triangle, int mid, int distance) {
        triangle[(distance - mid) - 1] = " ";
        triangle[triangle.length - (distance - mid)] = " ";
    }

    public void printNSizeCenteredTriangle(int n) {
        if (n == 0) {
            System.out.println();
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

    public void printDiamondTriangle(int n) {
        if (n == 0) {
            System.out.println();
        } else {

            int triangleSize = ((n - 1) * 2) + 1;

            String[] triangle = new String[triangleSize];
            Arrays.fill(triangle, " " );

            int mid = triangle.length / 2;
            triangle[mid] = "*";

            int count = 1;

            printTriangle(triangle);

            while (count < triangleSize) {

                if (count <= mid) {
                    addToTriangle(triangle, mid, count);
                    printTriangle(triangle);
                    count += 1;
                } else {
                    removeFromTriangle(triangle, mid, count);
                    printTriangle(triangle);
                    count += 1;
                }
            }
        }
    }


}
