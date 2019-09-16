package FindMaximumDifferenceBetweenNumbersInArray;

/**
 * @author Varadharajan on 2019-09-16
 * @project name: GoldmansachsCoderPadQuestions
 */
public class FindMaximumDifference {

    public static void main(String[] args) {

        String str = "1,0,6,4";

        int solution = Solution(str);

        System.out.println(solution);

    }

    private static int Solution(String str) {
        String[] arr = str.split(",");
        int[] intArr = new int[arr.length];
        int max = 0;
        int temp = 0;
        int i = 0;
        int index = 0;
        for (String temp1 : arr) {
            intArr[i] = Integer.parseInt(temp1);
            i++;
        }
        i = 0;

        for (int j = intArr.length - 1; j >= 0; j--) {

            for (int k = j - 1; k >= 0; k--) {
                if (intArr[j] - intArr[k] > 0) {
                    temp = intArr[j] - intArr[k];
                    if (temp > max) {
                        max = temp;
                        index = k;
                    }
                }
            }

        }

        return max;
    }
}
