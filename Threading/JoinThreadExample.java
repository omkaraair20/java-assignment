package Threading;

public class JoinThreadExample {
    public static void main(String[] args) {
		Thread thread1= new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Thread1-Count:"+i);
			}
		});
		
		Thread thread2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Thread2-Count:"+i);
			}
		});
		
		thread1.start();
		try {
			thread1.join();
		}
        catch(InterruptedException e){
        	e.printStackTrace();
        }
		thread2.start();
	}

}


