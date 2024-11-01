package State;

import Main.Order;
public class ProcessingState extends State {
    public ProcessingState(Order order) {
        super(order);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pesanan sudah dibuat dan sedang diproses.");
    }

    @Override
    public void processOrder() {
        System.out.println("Pesanan sudah diproses.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pesanan sedang dikirim.");
        order.setState(order.getCompletedState());
    }

    @Override
    public void completeOrder() {
        System.out.println("Pesanan belum dikirim.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pesanan dibatalkan.");
        order.setState(order.getCancelledState());
    }

    @Override
    public void payOrder() {
        System.out.println("Pembayaran tidak dapat dilakukan saat pesanan belum diterima.");
    }
}