package lesson17;

public class Singer2 extends Thread{
    public void run() {
        while (true){

            try {
                synchronized (Monitors.MICROFON){
                    Monitors.MICROFON.wait();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int i = 0; i < 2; i++){
                System.out.println(" ------------ LA");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }
        }
    }
}
