package me.fury.togglechat;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybind {
	/* Keybind variable declaration. */
	public static KeyBinding kb;
	
	/* Register the keybind with the parameters: name, character, and title. */
	public static void register() {
		kb = new KeyBinding("Toggle Chat", Keyboard.KEY_NONE, "Toggle Chat");
		ClientRegistry.registerKeyBinding(kb);
	}
}
