package CreationalPattern.BuilderPattern.concretebuilder;
import CreationalPattern.BuilderPattern.builder.OrderBuilder;
import CreationalPattern.BuilderPattern.product.order.*;
import CreationalPattern.BuilderPattern.product.type.BreadType;
import CreationalPattern.BuilderPattern.product.type.OrderType;
import CreationalPattern.BuilderPattern.product.type.SauceType;
import CreationalPattern.BuilderPattern.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }

}
