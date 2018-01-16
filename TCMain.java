package me.fury.togglechat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraftforge.client.ClientCommandHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

import me.fury.togglechat.Keybind;
import me.fury.togglechat.InputHandler;

@Mod(modid = TCMain.MODID, version = TCMain.VERSION)
public class TCMain
{
    public static final String MODID = "ToggleChat";
    public static final String VERSION = "1.0";
    
    /* Forge initialization event. */
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	/* Register the main class. */
    	FMLCommonHandler.instance().bus().register(this);
    	/* Register the input handler. */
    	FMLCommonHandler.instance().bus().register(new InputHandler());
    	/* Register the keybind. */
    	Keybind.register();
    }
}
