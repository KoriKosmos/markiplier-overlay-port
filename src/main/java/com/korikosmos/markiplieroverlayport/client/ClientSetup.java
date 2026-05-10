package com.korikosmos.markiplieroverlayport.client;

import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

public class ClientSetup {
    public static void register(ModContainer modContainer) {
        modContainer.registerExtensionPoint(
            IConfigScreenFactory.class,
            (IConfigScreenFactory) (container, screen) -> new ConfigurationScreen(container, screen)
        );
    }
}
