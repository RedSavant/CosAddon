package fr.redsavant;

import fr.redsavant.commands.CommandInfo;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public class Main extends JavaPlugin {
    public static Main instance;

    public static final String version = "1.0.0";

    public static Main getInstance() {return instance;}

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("CosAddon enabled !");
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("CosAddon disabled !");
    }

    public void registerCommands() {
        Objects.requireNonNull(getCommand("info")).setExecutor(new CommandInfo());
    }
    public void registerEvent() {
    }
}