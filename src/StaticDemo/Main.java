package StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id=1;
        product.name="Mouse";
        product.price=15;

        productManager.add(product);

        //inner class
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.update();

    }
}
