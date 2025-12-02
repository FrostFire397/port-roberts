package com.portroberts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("portroberts")
public interface PortRobertsConfig extends Config
{

    @ConfigItem(
            keyName = "showNumbers",
            name = "Show guard timers",
            description = "Toggle tick counts above the guard's heads"
    )
    default boolean showNumbers() { return true; }
}
