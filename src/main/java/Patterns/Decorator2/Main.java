package Patterns.Decorator2;

public class Main {
    public static void main(String[] args) {
        Notification messangerNotification=new MessageNotification();
        Notification smsNotification=new MessangerNotification(messangerNotification);
        Notification emailNotification=new EmailNotification(smsNotification);
        sendNotification(emailNotification);

    }

    private static void sendNotification(Notification notification){
        notification.send();
    }
}
