package Threading;

public class ThreadSchedularExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println("Thread count 1:"+i);
            }
        });
        
        Thread thread2 = new Thread(() ->{
            for(int i=1;i<=5;i++) {
                System.out.println("Thread count 2:"+i);
            }
        });
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
 }

}


