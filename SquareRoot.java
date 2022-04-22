import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("number=");
        float root = new Scanner(System.in).nextFloat();
        System.out.printf("root:" + squareRoot(root));
    }

    public static float squareRoot(float root) {
        float p0 = 0f;
        float p1 = root;
        while (!(Math.abs(p1 - p0) <= 0.001f)) {
            p0 = p1;
            p1 = g(p0, root);
            System.out.println(p0 + " " + p1);
            System.out.println((p1 - p0));
        }
        return p1;
    }

    public static float g(float x, float root) {
        return (x * x + root) / (2 * x);
    }
}
	