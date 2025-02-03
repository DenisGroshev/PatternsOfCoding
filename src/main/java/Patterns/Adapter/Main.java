package Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Usb resource;
        Card card=new Card();
        resource=new CardAdapter(card);
        System.out.println(resource.getUSBDate());
    }
}