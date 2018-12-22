package me.lxct.nospawnerchanges;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

class Variables {

    static List<?> allowedMobList;
    static boolean sendMessage;
    static String message;
    static String reload;
    static boolean allowChangesInCreative;
    static boolean logChangesToConsole;

    static void loadVariables(){

        FileConfiguration config = NoSpawnerChanges.plugin.getConfig();

        reload = config.getString("reload", "&7NoSpawnerChanges successfully reloaded!");
        allowedMobList = config.getList("allowedMobs");
        sendMessage = config.getBoolean("sendMessage", true);
        message = config.getString("message", "&cYou cannot change this spawner!");
        allowChangesInCreative = config.getBoolean("allowChangesInCreative", true);
        logChangesToConsole = config.getBoolean("logChangesToConsole", false);

    }

    static String colorize(String string) {
        return org.bukkit.ChatColor.translateAlternateColorCodes('&', string);
    }

}
