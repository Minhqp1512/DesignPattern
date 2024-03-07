package CreationalPattern.BuilderPattern.director;

import CreationalPattern.BuilderPattern.concretebuilder.FastFoodOrderBuilder;
import CreationalPattern.BuilderPattern.product.order.Order;
import CreationalPattern.BuilderPattern.product.type.BreadType;
import CreationalPattern.BuilderPattern.product.type.OrderType;
import CreationalPattern.BuilderPattern.product.type.SauceType;

public class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE)
                .orderBread(BreadType.PORK).orderSauce(SauceType.KETCHUP).build();
        System.out.println(order);
    }
}
