import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
//с помощью регулярных выражений и выводящую их на страницу

public class Task_2 {

    public static void main(String[] args) {


        String str="0x7FFF <p id=p1> 0x7AAF <p id=p1> kkkk  khg gkhjg";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
        Pattern p= Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.start()+" "+m.end());

        }
    }
}
