package lesson17;

public class Singer1 extends Thread{
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            for(int i = 0; i < 2; i++){
                System.out.println("LA ------------");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }

            try {
                synchronized (Monitors.MICROFON){
                    Monitors.MICROFON.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            if (count > 4) {
                needStop = true;
            }


        }
    }
}
