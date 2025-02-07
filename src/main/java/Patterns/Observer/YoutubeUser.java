package Patterns.Observer;

public class YoutubeUser implements Subscriber{
    @Override
    public void notification(String text) {
        System.out.println("New video is out now: "+text);
    }
}
