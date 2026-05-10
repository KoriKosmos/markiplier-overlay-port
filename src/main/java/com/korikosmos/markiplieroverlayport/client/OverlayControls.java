package com.korikosmos.markiplieroverlayport.client;

// Original Fabric mod by Rrat (https://modrinth.com/user/Rratt), ported to NeoForge 1.21.1 by KoriKosmos

import com.mojang.blaze3d.platform.InputConstants;
import com.korikosmos.markiplieroverlayport.MarkiplierOverlayPort;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = MarkiplierOverlayPort.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OverlayControls {

    public static final KeyMapping KEY_TOGGLE = new KeyMapping(
        "key.markiplier_overlay_port.toggle",
        InputConstants.Type.KEYSYM,
        InputConstants.UNKNOWN.getValue(),
        "key.categories.markiplier_overlay_port"
    );

    @SubscribeEvent
    public static void onRegisterKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(KEY_TOGGLE);
    }
}
