import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MyCalculator {
    static String[] myRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    static String mathSimbol;

    public static void main(String[] args) throws Exception {
        int romeNum;
        int resultInt;
        String resultStr;

        Symbol symbol = new Symbol();
        RomeOreArab roa = new RomeOreArab();
        Solution sol = new Solution();

        System.out.println("Введи арабское или римское число от 1 до 10, используй знак +-*/, пример 2+2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();

        mathSimbol = symbol.mathematicalSymbol(str);
        String[] numbers= str.split("[-+*/]");


        int romeOreArab1 = roa.romeArab(numbers[0]);
        int romeOreArab2 = roa.romeArab(numbers[1]);


        if(romeOreArab1==1 && romeOreArab2==1){
            resultInt = sol.mySolArab(numbers[0], numbers[1]);
            System.out.println(resultInt);
        }
        else if(romeOreArab1==2 && romeOreArab2==2){
            romeNum = sol.mySolRome(numbers[0], numbers[1]);
            if(romeNum>=0){
                resultStr =myRome[romeNum-1];
                System.out.println(resultStr);
            }
            else{
                romeNum = - romeNum;
                resultStr = myRome[romeNum-1];
                System.out.println("-"+resultStr);
            }
        }
        else {
            System.out.println("Введи арабское или римское число от 1 до 10, используй знак +-*/, пример 2+2");
        }
    }
}
