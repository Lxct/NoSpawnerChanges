package me.lxct.nospawnerchanges;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import static me.lxct.nospawnerchanges.Variables.*;
import static org.bukkit.GameMode.CREATIVE;
import static org.bukkit.Material.SPAWNER;
import static org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;

public class OnSpawnerChange implements Listener {
    @EventHandler
    public static void onSpawnerChange(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        if(event.getAction() == RIGHT_CLICK_BLOCK && block.getType() == SPAWNER){
            Player player = event.getPlayer();
            Material egg = player.getInventory().getItemInMainHand().getType();
            for(Object allowedEgg : allowedMobList){
                if(!egg.equals(allowedEgg)){
                    if(player.getGameMode() == CREATIVE) {
                        if(!allowChangesInCreative) {
                            event.setCancelled(true);
                            if (sendMessage) {
                                event.getPlayer().sendMessage(colorize(message));
                            }
                            if(logChangesToConsole){
                                Bukkit.getLogger().info(player.getName() + ":\nX: " + block.getX() + "\nY: " + block.getY() + "\nZ=" + block.getZ() + "\nEgg: " + egg);
                            }
                        }
                    } else {
                        event.setCancelled(true);
                        if (sendMessage) {
                            event.getPlayer().sendMessage(colorize(message));
                        }
                        if(logChangesToConsole){
                            Bukkit.getLogger().info(player.getName() + ":\nX: " + block.getX() + "\nY: " + block.getY() + "\nZ=" + block.getZ() + "\nEgg: " + egg);
                        }
                    }
                }
            }
        }
    }
}
