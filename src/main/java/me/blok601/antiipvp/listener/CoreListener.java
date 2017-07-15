package me.blok601.antiipvp.listener;

import me.blok601.antiipvp.Antiipvp;
import me.blok601.antiipvp.ChatUtils;
import me.blok601.antiipvp.Settings;
import me.blok601.antiipvp.iPvPType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by Blok on 7/14/2017.
 */
public class CoreListener implements Listener{

    public static HashMap<UUID, Integer> vls = new HashMap<>();


    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        if(Antiipvp.isiPvP()){
           return;
        }

        Player p = e.getPlayer();

        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(p.getItemInHand().getType() == Material.FLINT_AND_STEEL){
                if(Settings.getCancel()){
                    e.setCancelled(true);
                    p.sendMessage(ChatUtils.format(Settings.getCancelMessage()));
                }
                vls.put(p.getUniqueId(), vls.get(p.getUniqueId()) + 1);
                ChatUtils.sendAlertMessage(iPvPType.BURN, p);
            }else if(p.getItemInHand().getType() == Material.LAVA_BUCKET){
                if(Settings.getCancel()){
                    e.setCancelled(true);
                    p.sendMessage(ChatUtils.format(Settings.getCancelMessage()));
                }
                vls.put(p.getUniqueId(), vls.get(p.getUniqueId()) + 1);
                ChatUtils.sendAlertMessage(iPvPType.BURN, p);
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(!vls.containsKey(e.getPlayer().getUniqueId())){
            vls.put(e.getPlayer().getUniqueId(), 0);
        }
    }

}
