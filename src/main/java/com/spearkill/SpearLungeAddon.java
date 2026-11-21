package com.spearkill;

import com.mojang.logging.LogUtils;
import com.spearkill.modules.SpearLunge;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class SpearLungeAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing Spear Lunge");

        Modules.get().add(new SpearLunge());
    }

    @Override
    public String getPackage() {
        return "com.spearkill";
    }
}
