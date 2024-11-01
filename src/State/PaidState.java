package State;
import Main.Order;

public class PaidState extends State {
    public PaidState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan sudah dibayar. Tidak bisa diproses lagi.");
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan sudah dibayar. Tidak bisa diproses lagi.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan telah dikirim dan sudah dibayar.");
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan sudah selesai.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan sudah dibayar. Tidak bisa dibatalkan.");
    }

    @Override
    public void payOrder() {
        System.out.println("Pembayaran sudah dilakukan.");
    }
}