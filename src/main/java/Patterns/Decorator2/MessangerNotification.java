package Patterns.Decorator2;

public class MessangerNotification implements Notification{
    private Notification notification;

    public MessangerNotification() {
    }

    public MessangerNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if(notification!=null)
        notification.send();
        System.out.println("Notification SMS");
    }
}
