package BuilderPattern.director;

import BuilderPattern.concretebuilder.FastFoodOrderBuilder;
import BuilderPattern.product.order.Order;
import BuilderPattern.product.type.BreadType;
import BuilderPattern.product.type.OrderType;
import BuilderPattern.product.type.SauceType;

public class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE)
                .orderBread(BreadType.PORK).orderSauce(SauceType.KETCHUP).build();
        System.out.println(order);
    }
}
