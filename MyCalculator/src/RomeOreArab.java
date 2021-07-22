public class RomeOreArab  {

    private final String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private int a = 0;



    int romeArab(String s) throws MySuperException {
     for(int i=0; i<10; i++){
         if(s.equals(arab[i])){ a = 1; }
         else if(s.equals(rome[i])){ a = 2;}
     }

     if( a == 0){throw new MySuperException();}
     else {
         return a;
     }
    }
}

