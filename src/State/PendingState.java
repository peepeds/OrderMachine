package State;

import Main.Order;
public class PendingState extends State {
    public PendingState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan sudah dibuat dan dalam status pending.");
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan sedang diproses.");
        order.setState(order.getProcessingState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan belum bisa dikirim. Status: Pending.");
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan belum selesai diproses.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan dibatalkan.");
        order.setState(order.getCancelledState());
    }

    @Override
    public void payOrder() {
        System.out.println("Pembayaran tidak dapat dilakukan saat pesanan belum diproses.");
    }
}