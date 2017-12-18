package thisseasx.december2017.exercises.FacadeExercise;

class ScheduleServer {

    void startBooting() {
        System.out.println("startBooting() called.");
    }

    void readSystemConfigFile() {
        System.out.println("readSystemConfigFile() called.");
    }

    void init() {
        System.out.println("init() called.");
    }

    void initializeContext() {
        System.out.println("initializeContext() called.");
    }

    void initializeListeners() {
        System.out.println("initializeListeners() called.");
    }

    void createSystemObjects() {
        System.out.println("createSystemObjects() called.");
    }

    void releaseProcesses() {
        System.out.println("releaseProcesses() called.");
    }

    void destory() {
        System.out.println("destory() called.");
    }

    void destroySystemObjects() {
        System.out.println("destroySystemObjects() called.");
    }

    void destroyListeners() {
        System.out.println("destroyListeners() called.");
    }

    void destoryContext() {
        System.out.println("destoryContext() called.");
    }

    void shutdown() {
        System.out.println("shutdown() called.");
    }
}
