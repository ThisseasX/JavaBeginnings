package thisseasx.december2017.exercises.FacadeExercise;

class ServerFacade {

    private static final ScheduleServer server = new ScheduleServer();

    static void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    static void stopServer() {
        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destroyListeners();
        server.destoryContext();
        server.shutdown();
    }
}
