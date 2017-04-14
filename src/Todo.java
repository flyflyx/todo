import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by admin on 14.04.2017.
 */
public class Todo {
    public static void main(String[] args) {
        Spisok list= new Spisok();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("..");
            String cmd=s.nextLine();

            switch (cmd) {
                case "1":
                    String add=s.nextLine();
                    list.Add(add);
                break;
                case "2":
                    int remove=Integer.parseInt(s.nextLine());
                    list.Delete(remove);
                    break;
                case "3":
                    List<Stroka> Spisok = list.View();
                    for(Stroka stroka : Spisok)
                    {
                        System.out.println(stroka.getId()+"."+stroka.getMessage());
                    }
                    break;}

            }
        }

    }

