package CoreJavaTraining;

import net.sf.testng.databinding.DataBinding;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by yustsinchyk on 4/11/17.
 */

@DataBinding()
public class Conversions {

    private static final Logger LOGGER = Logger.getLogger(Conversions.class);


    static int returnInt(String str) {
        int digit = 0;

        try{

            digit = Integer.parseInt(str);

            String digit2 = String.valueOf(2);
            System.out.println(digit2);
            return digit;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return digit;

        }
    }

    static String returnString(int number) {
        String returnStr = "";

        try{
            returnStr = Integer.toString(number);
            return returnStr;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            String err = "Unable to parse";
            return err;

        }
    }

    @BeforeClass
    public void beforeClass(){
        LOGGER.info("Here is my BeforeClass method");
        System.out.println("Here is my BeforeClass method");
    }

    @Test
    public static void firstTest(){

        int result = returnInt("22");

        LOGGER.info(result);

        Assert.assertEquals(22, result, "Assert that String 22 parsed as integer 22");
    }


    @Test
    public static void secondTest(){
        LOGGER.info(returnString(22));
        Assert.assertEquals("22", returnString(22), "Assert that integer 22 parsed as String 22");
    }





//    public static void main(String[] Args){
//
//        System.out.println(returnInt("22"));
//        System.out.println(returnInt("aa"));
//        System.out.println(returnInt("0 0"));
//
//    }


}
