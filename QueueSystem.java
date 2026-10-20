package singletonPattern;

public class QueueSystem {
    private int currentQueueNo;
    private int lastIssuedQueueNo;
    private static QueueSystem instance;

    private QueueSystem() {
        this.currentQueueNo = 0;
        this.lastIssuedQueueNo = 0;
    }

    public static synchronized QueueSystem getInstance() {
        if (instance == null)
                instance = new QueueSystem();
        return instance;
    }
    

    public synchronized int getCurrentQueueNo() {
        if (currentQueueNo < lastIssuedQueueNo) {
            currentQueueNo++;
            System.out.println("Currently serving: " + currentQueueNo);
        }
        else {
            System.out.println("No more customers in queue.");
        }
        return currentQueueNo;
    }

    public synchronized int getNextQueueNo() {
        lastIssuedQueueNo++;
        System.out.println("New queue number issued: " + lastIssuedQueueNo);
        return lastIssuedQueueNo;
    }

    public synchronized void resetQueue(int newNo) {
        lastIssuedQueueNo = newNo;
        currentQueueNo = newNo;
        System.out.println("Queue reset to: " + newNo);
    }
}