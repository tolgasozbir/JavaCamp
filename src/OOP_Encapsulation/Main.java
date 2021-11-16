package OOP_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product(1,"Laptop1",10000,10);

        Product product2=new Product();
        product2.setId(1);
        product2.setName("Laptop2");
        product2.setUnitPrice(5000);
        product2.setDiscount(15);

        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1=new Category();
        category1.setId(1);
        category1.setName("Food");

        Category category2=new Category();
        category2.setId(2);
        category2.setName("Water");

        System.out.println(category1.getName());
        System.out.println(category2.getName());


    }
}
