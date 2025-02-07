package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher{
    private List<Subscriber> subs=new ArrayList<>();
    private List<String> videos=new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String text) {
        subs.forEach(subs->subs.notification(text));
    }

    public void uploadNewVideo(String videoTitle){
        videos.add(videoTitle);
        notifySubscriber(videoTitle);
    }
}
