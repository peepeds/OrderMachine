package State;
import Main.Order;
public class OrderState extends State {
    public OrderState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan telah dibuat.");
        order.setState(order.getPendingState());
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan belum dibuat. Silakan buat pesanan terlebih dahulu.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan belum dibuat. Silakan buat pesanan terlebih dahulu.");
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan belum dibuat. Silakan buat pesanan terlebih dahulu.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan dibatalkan.");
        order.setState(order.getCancelledState());
    }

    @Override
    public void payOrder() {
        System.out.println("Pesanan belum dibuat. Silakan buat pesanan terlebih dahulu.");
    }
}