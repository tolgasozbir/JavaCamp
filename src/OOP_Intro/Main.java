package OOP_Intro;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();   //intance,reference
        product1.id=1;
        product1.name="Lenovo v14";
        product1.unitPrice=9.999;
        product1.detail="8 Gb Ram";

        Product product2 = new Product(2,"Lenovo v15",14.999,"16 Gb Ram");


        Product[] products={product1,product2};

        for (Product product : products) {
            System.out.println(product.name);
        }
        
        System.out.println(products.length);

        ////////////

        Category category1 = new Category();
        category1.id=1;
        category1.name="Pc";

        Category category2 = new Category();
        category2.id=2;
        category2.name="Phone";

        ///////////
        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);

    }
}
