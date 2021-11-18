package Overriding;

public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){
        System.out.println("Öğrenci Kredisi");
        return tutar * 1.10;
    }
}
