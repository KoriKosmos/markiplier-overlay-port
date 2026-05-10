package com.korikosmos.markiplieroverlayport;

import net.neoforged.neoforge.common.ModConfigSpec;

public class MarkiplierConfig {

    static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue IMAGE_WIDTH;
    public static final ModConfigSpec.IntValue IMAGE_HEIGHT;

    static {
        BUILDER.push("overlay");

        IMAGE_WIDTH = BUILDER
            .comment("Width of the Markiplier overlay image in pixels")
            .defineInRange("imageWidth", 125, 1, 7680);

        IMAGE_HEIGHT = BUILDER
            .comment("Height of the Markiplier overlay image in pixels")
            .defineInRange("imageHeight", 115, 1, 4320);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
