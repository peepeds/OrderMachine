package Main;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.placeOrder();

        order.processOrder();
        order.payOrder();
        order.shipOrder();
//        order.payOrder();

        order.completeOrder();

        order.payOrder();

//        order.cancelOrder();
//
//        order.placeOrder();
    }
}
