package State;
import Main.Order;

public class CancelledState extends State {
    public CancelledState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan dibatalkan. Silakan buat pesanan baru.");
        order.setState(order.getNewOrderState());
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan dibatalkan. Tidak bisa diproses.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan dibatalkan. Tidak bisa dikirim.");
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan dibatalkan. Tidak bisa diselesaikan.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan sudah dibatalkan.");
    }

    @Override
    public void payOrder() {
        System.out.println("Pesanan dibatalkan. Pembayaran tidak dapat dilakukan.");
    }
}