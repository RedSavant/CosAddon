package fr.redsavant.commands;

import fr.redsavant.Main;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static fr.redsavant.utils.Colorize.colorize;

public class CommandInfo implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        if (sender instanceof Player player) {
            player.sendMessage(colorize("<dark_gray>-----------------------------"));
            player.sendMessage(colorize("<aqua>CosAddon Plugin by RedSavant"));
            player.sendMessage(colorize("<gradient:blue:aqua>Version: </gradient><green>" + Main.version + "</green>"));
            player.sendMessage(colorize("<dark_gray>-----------------------------"));
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
