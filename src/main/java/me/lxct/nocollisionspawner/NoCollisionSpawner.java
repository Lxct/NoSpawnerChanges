package me.lxct.nocollisionspawner;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoCollisionSpawner extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnEntitySpawn(), this);
    }
}
