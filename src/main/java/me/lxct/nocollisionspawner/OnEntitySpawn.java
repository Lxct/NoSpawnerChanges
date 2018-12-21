package me.lxct.nocollisionspawner;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class OnEntitySpawn implements Listener {
    @EventHandler
    public static void onEntitySpawn(CreatureSpawnEvent event) {
        if(event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER){
            event.getEntity().setCollidable(false);
        }
    }
}
