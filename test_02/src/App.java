import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String input = "Green Tea 12000, Thai Tea 8000, Taro 14000, Red Velvet 18000";
        FindLowestPrice(input);
    }

    public static void FindLowestPrice(String str){
        String[] arr = str.split(", ");
        // ArrayList<Menu> myMenu;
        Pattern pNumber = Pattern.compile("[0-9]+$");
        Pattern pTitle = Pattern.compile("[0-9]+$");
        for (String el : arr) {

            String price = Regex(pNumber, el);
            
            System.out.print( el+ "\n"); 
            System.out.print( price+ "\n"); 
        }
    }


    public static String Regex(Pattern p, String str){
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

    public class Menu {
        String Title;
        int Price;

        public Menu(String Title, int Price) {
            this.Title = Title;
            this.Price = Price;

        }
    }
}
