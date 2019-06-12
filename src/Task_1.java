import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
//В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
//Возможные домены верхнего уровня: .org .com

public class Task_1 {

    public static void main(String[] args) {



        String email = "pristijpribor@gmail.com";
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);

        if(mat.matches()){

            System.out.println("Valid email address");
        }else{

            System.out.println("Not a valid email address");
        }
    }
    }

