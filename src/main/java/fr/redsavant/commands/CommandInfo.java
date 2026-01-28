package fr.redsavant.commands;

import fr.redsavant.Main;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandInfo implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player player) {
            player.sendMessage("&8-----------------------------");
            player.sendMessage("&bCosAddon Plugin by RedSavant");
            player.sendMessage("&bVersion: " + Main.version);
            player.sendMessage("&8-----------------------------");
        } else {
            sender.sendMessage("-----------------------------");
            sender.sendMessage("CosAddon Plugin by RedSavant");
            sender.sendMessage("Version: " + Main.version);
            sender.sendMessage("-----------------------------");
        }
        if (args.length > 0) {
            if (sender instanceof Player player) {
                Location loc = player.getLocation();
                player.sendMessage("Usage: /info");
                player.playSound(loc, Sound.ENTITY_VILLAGER_NO,10,1);
            } else {
                sender.sendMessage("Usage: /info");
            }
        }
        return true;
    }
}
