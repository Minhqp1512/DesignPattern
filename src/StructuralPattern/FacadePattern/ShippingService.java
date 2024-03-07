package StructuralPattern.FacadePattern;

public class ShippingService {
    //mien phi van chuyen
    public void freeShipping() {
        System.out.println("Free Shipping");
    }
    //van chuyen tieu chuan
    public void standardShipping() {
        System.out.println("Standard Shipping");
    }
    //van chuyen nhanh
    public void expressShipping() {
        System.out.println("Express Shipping");
    }
}
