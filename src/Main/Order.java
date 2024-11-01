package Main;

import State.*;

public class Order {
    private State newOrderState;
    private State pendingState;
    private State processingState;
    private State completedState;
    private State cancelledState;
    private State paidState;
    private State currentState;

    public Order() {
        newOrderState = new OrderState(this);
        pendingState = new PendingState(this);
        processingState = new ProcessingState(this);
        completedState = new CompletedState(this);
        cancelledState = new CancelledState(this);
        paidState = new PaidState(this);
        currentState = newOrderState; // Memulai dengan status pesanan baru
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNewOrderState() {
        return newOrderState;
    }

    public State getPendingState() {
        return pendingState;
    }

    public State getProcessingState() {
        return processingState;
    }

    public State getCompletedState() {
        return completedState;
    }

    public State getCancelledState() {
        return cancelledState;
    }

    public State getPaidState() {
        return paidState;
    }

    public void placeOrder() {
        currentState.placeOrder();
    }

    public void processOrder() {
        currentState.processOrder();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void completeOrder() {
        currentState.completeOrder();
    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }

    public void payOrder() {
        currentState.payOrder();
    }
}
