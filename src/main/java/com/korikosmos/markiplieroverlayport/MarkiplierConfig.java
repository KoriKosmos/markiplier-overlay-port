package com.korikosmos.markiplieroverlayport;

import net.neoforged.neoforge.common.ModConfigSpec;

public class MarkiplierConfig {

    static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue IMAGE_WIDTH;
    public static final ModConfigSpec.IntValue IMAGE_HEIGHT;
    public static final ModConfigSpec.IntValue OVERLAY_X;
    public static final ModConfigSpec.IntValue OVERLAY_Y;
    public static final ModConfigSpec.IntValue CYCLE_INTERVAL_MS;

    static {
        BUILDER.push("overlay");

        IMAGE_WIDTH = BUILDER
            .comment("Width of the Markiplier overlay image in pixels")
            .defineInRange("imageWidth", 125, 1, 7680);

        IMAGE_HEIGHT = BUILDER
            .comment("Height of the Markiplier overlay image in pixels")
            .defineInRange("imageHeight", 115, 1, 4320);

        OVERLAY_X = BUILDER
            .comment("X position of the overlay in pixels from the left edge of the screen")
            .defineInRange("overlayX", 0, 0, 7680);

        OVERLAY_Y = BUILDER
            .comment("Y position of the overlay in pixels from the top edge of the screen")
            .defineInRange("overlayY", 0, 0, 4320);

        CYCLE_INTERVAL_MS = BUILDER
            .comment("How often to cycle to a new image, in milliseconds")
            .defineInRange("cycleIntervalMs", 2000, 200, 60000);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
