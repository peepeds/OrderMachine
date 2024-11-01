package State;
import Main.Order;
public class CompletedState extends State {
    public CompletedState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan sudah selesai. Tidak bisa diproses lagi.");
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan sudah selesai. Tidak bisa diproses lagi.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan sudah dikirim. Tidak bisa dikirim lagi.");
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan sudah selesai.");
        order.setState(order.getPaidState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan tidak bisa dibatalkan setelah selesai.");
    }

    @Override
    public void payOrder() {
        System.out.println("Pembayaran hanya dapat dilakukan setelah pesanan yang sudah selesai.");
    }
}