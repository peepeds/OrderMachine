package Main;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nNormal Case");
        normalCase();
        System.out.println("\nCancel Case");
        cancelCase();
        System.out.println("\nWrong Case");
        wrongCase1();
        System.out.println("\nWrong Case");
        wrongCase2();


    }
    static void normalCase(){
        Order order = new Order();
        order.placeOrder();
        order.processOrder();
        order.shipOrder();
        order.completeOrder();
        order.payOrder();
    }
    static void cancelCase(){
        Order order = new Order();
        order.placeOrder();
        order.cancelOrder();
    }

    static void wrongCase1(){
        Order order = new Order();
        order.shipOrder();
        order.placeOrder();
        order.completeOrder();
    }

    static void wrongCase2(){
        Order order = new Order();
        order.placeOrder();
        order.payOrder();
    }

}

