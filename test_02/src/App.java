import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String input = "Green Tea 12000, Thai Tea 8000, Taro 14000, Red Velvet 18000";
        String output = FindLowestPrice(input);
        System.out.print("Lowest price: " + output + "\n"); 
    }

    public static String FindLowestPrice(String str){
        String[] arr = str.split(", "); // split string to array of string
        int minVal = Integer.MAX_VALUE; 
        String result = "";
        Pattern pNumber = Pattern.compile("[0-9]+$"); // using regex to find extract price subtring
        for (String el : arr) {

            String sPrice = Regex(pNumber, el);
            int iPrice = Integer.parseInt(sPrice);
            if (iPrice < minVal) {
                // update temp variable if price lower than temp price
                minVal = iPrice;
                result = el.replace(sPrice, "");
            }
        }

        return result;
    }


    public static String Regex(Pattern p, String str){
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }
}
