import java.sql.SQLOutput;

public class Shop {
    public static void main(String[] args) {


        Product p1 = new Product("LCD", 50000, 2,new Date(3,12,2023));
        Product p2 = new Product("Keboard", 700, 10,new Date(15,5,2022));
        Product p3 = new Product("Keboard wireless", 700, 10,new Date(18,9,2020));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("latest :"+ p1.isLatest(p1,p2));


    }
}
