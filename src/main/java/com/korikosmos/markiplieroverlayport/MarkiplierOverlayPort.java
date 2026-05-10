package com.korikosmos.markiplieroverlayport;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MarkiplierOverlayPort.MOD_ID)
public class MarkiplierOverlayPort {
    public static final String MOD_ID = "markiplier_overlay_port";
    private static final Logger LOGGER = LoggerFactory.getLogger(MarkiplierOverlayPort.class);

    public MarkiplierOverlayPort() {
        LOGGER.info("Loaded {}", MOD_ID);
    }
}
