package de.celinadev.clicksoundfix.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Util {

    public static int SCREEN_OPEN_SINCE_TICKS = 0;

    public static void startTimer() {
        Runnable r = () -> SCREEN_OPEN_SINCE_TICKS++;
        ScheduledExecutorService e = Executors.newScheduledThreadPool(1);
        e.scheduleAtFixedRate(r, 0, 50, TimeUnit.MILLISECONDS);
    }

    public static void resetTimer() {
        SCREEN_OPEN_SINCE_TICKS = 0;
    }
}