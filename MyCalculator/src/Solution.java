public class Solution {
   private int one;
   private int two;
   private int res;

    int mySolArab(String a, String b){
        one = Integer.parseInt(a);
        two = Integer.parseInt(b);

        switch (MyCalculator.mathSimbol) {
            case "-":
                res = one - two;
                break;
            case "+":
                res = one + two;
                break;
            case "*":
                res = one * two;
                break;
            case "/":
                res = one / two;
                break;
        }
        return res;
    }

    int mySolRome(String a, String b){
        for(int i = 0; i<10; i++) {
            if (RomeOreArab.rome[i].equals(a)) {
                one = i + 1;
            }
        }
        for(int i = 0; i<10; i++){
            if(RomeOreArab.rome[i].equals(b)){
                two = i+1;
            }
        }

        switch (MyCalculator.mathSimbol) {
            case "-":
                res = one - two;
                break;
            case "+":
                res = one + two;
                break;
            case "*":
                res = one * two;
                break;
            case "/":
                res = one / two;
                break;
        }
        return res;
    }
}
