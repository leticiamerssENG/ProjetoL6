import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal
{
    public static void main(String[] args) {
        try{
            CSVReader reader = new CSVReader(new FileReader("C:\\vendas-games.csv"));

            // Lista Original
            List<List<String>> linhas = new ArrayList<List<String>>();

            // Listas Filtradas
            List<List<String>> plataformas = new ArrayList<List<String>>();
            List<List<String>> publisher = new ArrayList<List<String>>();

            String[] colunas = null;

            // Leitura lista geral
            reader.readNext(); // Comando para "ignorar" a linha de título das colunas
            while((colunas = reader.readNext()) != null)
            {
                linhas.add(Arrays.asList(colunas));
            }

            // Filtro lista plataforma
            linhas.forEach(cols -> {
                if(cols.get(2).equals("PS4"))
                {
                    plataformas.add(cols);
                }
            });

            // Filtro lista publisher
            linhas.forEach(cols -> {
                if(cols.get(5).equals("Activision"))
                {
                    publisher.add(cols);
                }
            });

            // Impressão das listas filtradas

            System.out.println("============================= Plataformas = PS4 ===================================  ");
            plataformas.forEach(cols -> {
                System.out.println(cols);
            });

            System.out.println(" ");
            System.out.println("==================================================================================================== ");
            System.out.println(" ");
            System.out.println("============================= Publisher = Activision =============================================== ");

            publisher.forEach(cols -> {
                System.out.println(cols);
            });
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
