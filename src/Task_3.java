import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке всех тегов абзацев

public class Task_3 {

    public static void main(String args[]) {

        Pattern p = Pattern.compile("[Ph]+?");
        Matcher m = p.matcher("P<html> <head> <title>Пример 3</title> </head> <body> <H1>Стих</H1> <H2>Автор неизвестен</H2> " +
                "<P>Однажды в студеную зимнюю пору<BR> Сижу за решеткой в темнице сырой.<BR> Гляжу - поднимается медленно в гору<BR> Вскормленный " +
                "в неволе орел молодой.</P=l> <P>И шествуя важно, в спокойствии чинном,<BR> Мой грустный товарищ, махая крылом,<BR> В больших сапогах, в " +
                "полушубке овчинном,<BR> Кровавую пищу клюет под окном.</P id=> </body> </html> ");
        System.out.println(m.replaceAll("<p>" ));
    }
}
