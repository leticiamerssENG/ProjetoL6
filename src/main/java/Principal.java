import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal
{
    public static void main(String[] args) {
        try{
            CSVReader reader = new CSVReader(new FileReader("C:\\vendas-games.csv"));
            String[]nextline;

            nextline = reader.readNext();
            while((nextline = reader.readNext()) != null)
            {
                Jogos J = new Jogos();
                if(nextline != null)
                {
                    System.out.println(Arrays.toString(nextline));



                }
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Leitura completa!");

    }
}
