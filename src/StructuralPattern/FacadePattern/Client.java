package StructuralPattern.FacadePattern;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithStandardShipping("contact@minh.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("minhvn@gmail.com", "0988.686.868");
    }
}