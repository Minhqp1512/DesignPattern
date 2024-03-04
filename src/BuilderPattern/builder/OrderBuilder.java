package BuilderPattern.builder;

import BuilderPattern.product.order.*;
import BuilderPattern.product.type.BreadType;
import BuilderPattern.product.type.OrderType;
import BuilderPattern.product.type.SauceType;
import BuilderPattern.product.type.VegetableType;


public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderBread(BreadType breadType);


    OrderBuilder orderVegetable(VegetableType vegetableType);


    Order build();
}

