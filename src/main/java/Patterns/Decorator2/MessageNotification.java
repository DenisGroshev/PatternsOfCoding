package Patterns.Decorator2;

public class MessageNotification implements Notification{
    private Notification notification;

    public MessageNotification() {
    }

    public MessageNotification(Notification notification) {
        this.notification = notification;
    }

    @Override


    public void send() {
        if(notification!=null)notification.send();
        System.out.println("Telegram message");
    }
}
