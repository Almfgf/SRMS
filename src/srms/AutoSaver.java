package srms;

public class AutoSaver extends Thread {
    private final SRMS system;
    private boolean running = true;

    public AutoSaver(SRMS system) {
        this.system = system;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(30000);
                system.autoSave();
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void stopSaving() {
        running = false;
        interrupt();
    }
}