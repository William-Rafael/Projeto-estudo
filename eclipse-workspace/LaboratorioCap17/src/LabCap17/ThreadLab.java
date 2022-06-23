package LabCap17;

/*public class ThreadLab extends Thread {

	/*public ThreadLab(String n1) {
		super(n1);
	}

	// metodo run()
	public void run() {
		
		for (int i = 0; i < 10; i++){
		
			System.out.println(Thread.currentThread().getName());
			try {
			this.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}
} */
	

public class ThreadLab extends Thread {
    static Object lock = new Object();

    public ThreadLab(String param) {
        super(param);
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());

                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}