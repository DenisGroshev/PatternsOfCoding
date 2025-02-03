package Patterns.Adapter;


public class CardAdapter implements Usb{

    private Card card=new Card();
    public CardAdapter(Card card){

    }
    @Override
    public String getUSBDate() {
        return card.getCardDate()+" lol";
    }
}
