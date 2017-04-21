package CoreJavaTraining;

/**
 * Created by yustsinchyk on 4/21/17.
 */
public class StringProblem {

    public static void main (String[] Args) {
        System.out.println(isLucky("12"));
        System.out.println(isLucky("124"));
        System.out.println(isLucky("12403"));
        System.out.println(isLucky("12aa"));

    }



    private static boolean isLucky(String str) {
        boolean result = false;

        try {

            char[] chars = str.toCharArray();

            int sumLeft = Integer.parseInt(String.valueOf(chars[0])) +
                    Integer.parseInt(String.valueOf(chars[1])) +
                    Integer.parseInt(String.valueOf(chars[2]));

            int sumRight = Integer.parseInt(String.valueOf(chars[chars.length - 1])) +
                    Integer.parseInt(String.valueOf(chars[chars.length - 2])) +
                    Integer.parseInt(String.valueOf(chars[chars.length - 3]));

            return (sumLeft == sumRight)?true:false;

        } catch (Exception e){
            System.out.println(e.getStackTrace());
            return result;
        }
    }
}
