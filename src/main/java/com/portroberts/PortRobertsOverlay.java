package com.portroberts;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

public class PortRobertsOverlay extends Overlay {

    private final PortRobertsPlugin plugin;

    private final PortRobertsConfig config;

    @Inject
    private PortRobertsOverlay(PortRobertsPlugin plugin, PortRobertsConfig config) {
        this.plugin = plugin;
        this.config = config;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    public Dimension render(Graphics2D graphics) {

        int tick = plugin.getCurrentTick();

        Color cballColor;
        Color oreColor;

        if (tick <= 10 || tick > 30) {
            cballColor = Color.RED;
            oreColor = Color.GREEN;
        } else {
            cballColor = Color.GREEN;
            oreColor = Color.RED;
        }

        if (plugin.getOreStall() == null || plugin.getCballStall() == null) {
            return null;
        }


        Shape cbox = plugin.getOreStall().getClickbox();
        if (cbox != null) {
            OverlayUtil.renderPolygon(graphics, cbox, oreColor);
        }
        cbox = plugin.getCballStall().getClickbox();
        if (cbox != null) {
            OverlayUtil.renderPolygon(graphics, cbox, cballColor);
        }
        return null;
    }
}
