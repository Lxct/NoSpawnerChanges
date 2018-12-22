package me.lxct.nospawnerchanges;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

class Variables {

    static List<?> allowedMobList;
    static boolean sendMessage;
    static String message;
    static boolean allowChangesInCreative;
    static boolean logChangesToConsole;

    static void loadVariables(){

        FileConfiguration config = NoSpawnerChanges.plugin.getConfig();

        allowedMobList = config.getList("allowedMobs");
        sendMessage = config.getBoolean("sendMessage");
        message = config.getString("message");
        allowChangesInCreative = config.getBoolean("allowChangesInCreative");
        logChangesToConsole = config.getBoolean("logChangesToConsole");

    }

    static String colorize(String string) {
        return org.bukkit.ChatColor.translateAlternateColorCodes('&', string);
    }

}
