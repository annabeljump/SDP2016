package Question8Facade;

/**
 * Copied from given code
 * @author not Annabel
 * Modified by
 * @author Annabel
 */
public class ScheduleServerFacade {

    private ScheduleServer schedServ;

    public ScheduleServerFacade(ScheduleServer scheduleServer) {
        this.schedServ = scheduleServer;
    }

    public void startServer() {
        schedServ.startBooting();
        schedServ.readSystemConfigFile();
        schedServ.init();
        schedServ.initializeContext();
        schedServ.initializeListeners();
        schedServ.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

    public void stopServer() {
        schedServ.releaseProcesses();
        schedServ.destory();
        schedServ.destroySystemObjects();
        schedServ.destoryListeners();
        schedServ.destoryContext();
        schedServ.shutdown();
    }
}
