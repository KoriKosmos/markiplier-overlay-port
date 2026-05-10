package com.korikosmos.markiplieroverlayport;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MarkiplierOverlayPort.MOD_ID)
public class MarkiplierOverlayPort {
    public static final String MOD_ID = "markiplier_overlay_port";
    private static final Logger LOGGER = LoggerFactory.getLogger(MarkiplierOverlayPort.class);

    public MarkiplierOverlayPort(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, MarkiplierConfig.SPEC);
        LOGGER.info("Loaded {}", MOD_ID);
    }
}
