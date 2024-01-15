package EEXX1.EEXX1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String order_number(int order_num) {
    	if((1 <= order_num) && (order_num <= 11))
    		return "Accepted";
    	else if((11 < order_num) && (order_num <= 99))
    		return "Not accepted";
    	else
    		return "Error";
    }
}
