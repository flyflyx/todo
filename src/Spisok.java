import sun.security.provider.ConfigFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 14.04.2017.
 */
public class Spisok {

    ArrayList<Stroka> Spisok = new ArrayList<>();
    int size=0;

    public void Add(String message)
    {
        size++;
        Spisok.add(new Stroka(size,message));
    }

    public void Delete(int id)
    {
        for(Stroka stroka: Spisok)
        {
            if ( stroka.getId()==id){
                Spisok.remove(stroka);
            }
        }

    }

    public List<Stroka> View()
    {
        return Spisok;
    }

}