package br.com.sicro.cleanerchat;

import br.com.sicro.cleanerchat.listeners.*;
import br.com.sicro.cleanerchat.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Cleaner Chat inicializado com sucesso!");
        this.getCommand("cc").setExecutor(new cleanerchat());
        this.getServer().getPluginManager().registerEvents(new listener(), this);
    }

    @Override
    public void onDisable() {

    }
}
