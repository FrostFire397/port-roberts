package com.portroberts;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PortRobertsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PortRobertsPlugin.class);
		RuneLite.main(args);
	}
}