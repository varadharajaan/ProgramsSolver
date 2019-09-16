package AddFractions;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class AddFraction {

    public static void main(String[] args) {
        int[] result = addFractions(new int[]{2, 3}, new int[]{1, 2});

        if (result[0] == 7 && result[1] == 6) {
            System.out.println("Test passed.");

        } else {
            System.out.println("Test failed.");

        }
    }

    public static int[] addFractions(int[] fraction1, int[] fraction2) {

        int a, b, c, d, x, y, i, gcd = 0;

        a = fraction1[0];
        b = fraction1[1];
        c = fraction2[0];
        d = fraction2[1];

        x = (a * d) + (b * c); //numerator
        y = b * d; //denominator

        for (i = 1; i <= x && i <= y; ++i) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        System.out.println(x / gcd + "/" + y / gcd);
        System.out.println();

        return (new int[]{x / gcd, y / gcd});

    }
}
