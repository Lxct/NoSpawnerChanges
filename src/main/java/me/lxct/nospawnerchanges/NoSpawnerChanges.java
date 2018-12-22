package me.lxct.nospawnerchanges;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import static me.lxct.nospawnerchanges.Variables.loadVariables;

public class NoSpawnerChanges extends JavaPlugin implements Listener {
    static NoSpawnerChanges plugin;
    public void onEnable() {
        plugin = this;
        loadVariables();
        getServer().getPluginManager().registerEvents(new OnSpawnerChange(), this);
        getCommand("Reload").setExecutor(new Reload());
    }
}
