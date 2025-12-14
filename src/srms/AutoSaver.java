package srms;

 public class AutoSaver extends Thread {

    private SRMS system;
    private int interval;
    private boolean active;

    public AutoSaver(SRMS system, int interval) {
        this.system = system;
        this.interval = interval;
        this.active = true;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (active) {
            try {
                Thread.sleep(interval);
                system.autoSave();
            } catch (InterruptedException e) {
                active = false;
            }
        }
    }

    public void stopSaving() {
        active = false;
        interrupt();
    }
}
