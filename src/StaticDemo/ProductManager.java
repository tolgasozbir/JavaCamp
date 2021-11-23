package StaticDemo;

public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Product Added");
        }else{
            System.out.println("There are incorrectly entered values");
        }

    }
}
