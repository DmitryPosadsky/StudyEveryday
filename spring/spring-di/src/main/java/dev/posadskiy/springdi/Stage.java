package dev.posadskiy.springdi;

public class Stage {

    private Stage() {
    }

    private static class StageSingltoneHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingltoneHolder.instance;
    }

}
