package me.lxct.nospawnerchanges;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static me.lxct.nospawnerchanges.Variables.colorize;
import static me.lxct.nospawnerchanges.Variables.loadVariables;
import static me.lxct.nospawnerchanges.Variables.reload;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("nscreload") && commandSender.hasPermission("nsc.reload")){
            NoSpawnerChanges.plugin.reloadConfig();
            loadVariables();
            commandSender.sendMessage(colorize(reload));
        }
        return false;
    }
}
