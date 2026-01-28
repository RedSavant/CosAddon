package fr.redsavant.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.md_5.bungee.api.ChatColor;

public class Colorize {
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();
    public static Component colorize(String message) {
        return miniMessage.deserialize(message);
    }
}
