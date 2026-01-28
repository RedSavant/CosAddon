package fr.redsavant;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[RS] Plugin ---- enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("[RS] Plugin ---- disabled");
    }
}