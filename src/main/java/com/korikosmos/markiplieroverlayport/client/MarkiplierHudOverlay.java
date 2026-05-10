package com.korikosmos.markiplieroverlayport.client;

// Original Fabric mod by Rrat (https://modrinth.com/user/Rratt), ported to NeoForge 1.21.1 by KoriKosmos

import com.korikosmos.markiplieroverlayport.MarkiplierOverlayPort;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderGuiEvent;

import java.util.Random;

@EventBusSubscriber(modid = MarkiplierOverlayPort.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class MarkiplierHudOverlay {

    private static final int IMAGE_COUNT = 27;
    private static final long INTERVAL_MS = 2000L;
    private static final Random RANDOM = new Random();
    private static long lastTime = 0L;
    private static int currentImage = 0;

    @SubscribeEvent
    public static void onRenderGui(RenderGuiEvent.Post event) {
        updateImage();
        Minecraft client = Minecraft.getInstance();
        if (client.player != null && !client.options.hideGui) {
            ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(
                MarkiplierOverlayPort.MOD_ID,
                "textures/screenshot_" + currentImage + ".png"
            );
            event.getGuiGraphics().blit(texture, 0, 0, 0.0F, 0.0F, 125, 115, 125, 115);
        }
    }

    private static void updateImage() {
        long now = System.currentTimeMillis();
        if (now - lastTime >= INTERVAL_MS) {
            currentImage = RANDOM.nextInt(IMAGE_COUNT);
            lastTime = now;
        }
    }
}
