package me.lxct.nospawnerchanges;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnerChanges extends JavaPlugin implements Listener {
    static NoSpawnerChanges plugin;
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new OnSpawnerChange(), this);
    }
}
