package State;
import Main.Order;

public abstract class State {
    protected Order order;

    public State(Order order) {
        this.order = order;
    }

    public abstract void placeOrder();
    public abstract void processOrder();
    public abstract void shipOrder();
    public abstract void completeOrder();
    public abstract void cancelOrder();
    public abstract void payOrder();
}
