package me.blok601.antiipvp;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by Blok on 7/14/2017.
 */
public class ChatUtils {

    public static String format(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void sendAlertMessage(iPvPType type, Player player){
        for (Player p : Bukkit.getOnlinePlayers()){
            if(p.hasPermission("uhc.moderator")){
                //Change that perm to your liking!
                if(type.equals(iPvPType.BURN)){
                    p.sendMessage(format("&7Possible iPvP from &6" + player.getName() + " &7type: &6BURN (placed lava or flint-and-steel)"));
                }
            }
        }

    }



}
