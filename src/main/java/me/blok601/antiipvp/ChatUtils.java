package me.blok601.antiipvp;

import me.blok601.antiipvp.listener.CoreListener;
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
                p.sendMessage(ChatUtils.format("&7Possible iPvP from &6" + player.getName() + "&7type: &6" + type.toString() + "&6(" + type.getMessage() + ") &cVL: " + CoreListener.vls.get(player.getUniqueId())));
            }
        }

    }



}
