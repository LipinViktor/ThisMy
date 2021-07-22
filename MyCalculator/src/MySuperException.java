public class MySuperException extends Exception  {
    @Override
    public String toString() {
         return  "Введи арабское или римское число от 1 до 10, используй знак +-*/, пример 2+2";
    }
}
