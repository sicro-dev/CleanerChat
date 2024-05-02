package br.com.sicro.cleanerchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cleanerchat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
            return true;
        }

        Player player = (Player) sender;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            for (int i = 0; i < 100; i++) {
                onlinePlayer.sendMessage("");
            }
            onlinePlayer.sendMessage(ChatColor.GREEN + "Cleaner Chat " + ChatColor.YELLOW + "=>" + ChatColor.GREEN + " O chat foi limpo por " + ChatColor.YELLOW + player.getName() + "!");
        }

        return true;
    }
}
