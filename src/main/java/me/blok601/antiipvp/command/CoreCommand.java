package me.blok601.antiipvp.command;

import me.blok601.antiipvp.Antiipvp;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Blok on 7/14/2017.
 */
public class CoreCommand implements CommandExecutor{

    /**
     * Executes the given command, returning its success
     *
     * @param s  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
            if(args.length != 1){
                s.sendMessage(ChatColor.RED  + "Usage: /ipvp <on/off>");
                return false;
            }else{
                String option = args[0];
                if(!option.equalsIgnoreCase("on") || !option.equalsIgnoreCase("off")){
                    s.sendMessage(ChatColor.RED  + "Usage: /ipvp <on/off>");
                    return false;
                }

                if(option.equalsIgnoreCase("on")){
                    Antiipvp.setiPvP(true);
                    s.sendMessage(ChatColor.GREEN + "iPvP is now on!");
                }else if(option.equalsIgnoreCase("off")){
                    Antiipvp.setiPvP(false);
                    s.sendMessage(ChatColor.GREEN + "iPvP is now on!");
                }

                return true;

            }
    }
}
