package Patterns.ChainsOfResponsibility;

public class Repeater extends Handler {
    private Order order;

    @Override
    public void handle(Order order) {
        if(this.order==order){
            System.out.println("Sorry, may be you want something other?");
            super.handle(order);
        }else{
            this.order=order;
        }
    }
}
