package de.celinadev.clicksoundfix;

import de.celinadev.clicksoundfix.util.Util;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        Util.startTimer();
    }
}
