package CreationalPattern.BuilderPattern.builder;

import CreationalPattern.BuilderPattern.product.order.*;
import CreationalPattern.BuilderPattern.product.type.BreadType;
import CreationalPattern.BuilderPattern.product.type.OrderType;
import CreationalPattern.BuilderPattern.product.type.SauceType;
import CreationalPattern.BuilderPattern.product.type.VegetableType;


public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderBread(BreadType breadType);


    OrderBuilder orderVegetable(VegetableType vegetableType);


    Order build();
}

