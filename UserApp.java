package singletonPattern;

public class UserApp {
    public static void main(String [] args) {
        QueueSystem qs = QueueSystem.getInstance();

        System.out.println("VISITORS OBTAINING QUEUE NUMBERS");
        qs.getNextQueueNo();
        qs.getNextQueueNo();
        qs.getNextQueueNo();

        System.out.println("\nONLINE MONITORING SYSTEM");
        qs.getCurrentQueueNo();
        qs.getCurrentQueueNo();
        qs.getCurrentQueueNo();
        qs.getCurrentQueueNo();

        System.out.println("\nHELP DESK RESET ACTION");
        qs.resetQueue(100);

        System.out.println("\nNEW VISITORS AFTER RESET");
        qs.getNextQueueNo();

        System.out.println("\nFINAL ONLINE MONITORING CHECK");
        qs.getCurrentQueueNo();
        qs.getCurrentQueueNo();
    }
}