package me.fury.togglechat;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

import me.fury.togglechat.Keybind;
import net.minecraft.client.Minecraft;

public class InputHandler {
    public boolean toggled = false;
	
    /* KeyInput event. */
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent e) {
		if (Keybind.kb.isPressed()) {
			toggled = !toggled;
			Minecraft.getMinecraft().gameSettings.chatVisibility = (toggled) ? 
			Minecraft.getMinecraft().gameSettings.chatVisibility.HIDDEN : Minecraft.getMinecraft().gameSettings.chatVisibility.FULL;
		}
	}
}
