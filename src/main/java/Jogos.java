import lombok.Data;

@Data
public class Jogos {

    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private float na_sales, eu_sales, jp_sales, other_sales, global_sales;

   /* public Jogos(int rank, String name, String platform, int year, String genre, String publisher, float na_sales, float eu_sales, float jp_sales, float other_sales, float global_sales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;
    }*/
}
