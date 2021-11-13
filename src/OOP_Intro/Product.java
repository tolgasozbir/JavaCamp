package OOP_Intro;

public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;

    public Product(){       //Constructors
        System.out.println("Bellekte yeni ürün oluşturuldu");
    }

    public Product(int id,String name,double unitPrice,String detail){
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    }
}
