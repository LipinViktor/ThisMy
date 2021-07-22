public class Symbol {
    private String result ;

    public String mathematicalSymbol(String it) throws MySuperException{
        char[] ch = it.toCharArray();

        for(char c : ch) {
            if(c== '+'){
                result = "+";
            }
            else if(c == '-'){
                result = "-";
            }
            else if(c == '*'){
                result = "*";
            }
            else if(c == '/') {
                result = "/";
            }
        }
        if(!result.contains("[+-*/]")) {
            return result;
        }
        else { throw new MySuperException(); }
    }
}
