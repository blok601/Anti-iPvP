package me.blok601.antiipvp.listener;

import me.blok601.antiipvp.Antiipvp;
import me.blok601.antiipvp.ChatUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * Created by Blok on 7/14/2017.
 */
public class CoreListener implements Listener{


    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if(Antiipvp.isiPvP()){
            return;
        }

        Block block = e.getBlock();

        switch(block.getType()){
            case FLINT_AND_STEEL:
                e.setCancelled(true);
                p.sendMessage(ChatUtils.format("&cYou can't place flint and steel before PvP is enabled!"));
                break;
            case LAVA_BUCKET:
                e.setCancelled(true);
                p.sendMessage(ChatUtils.format("&cYou can't place lava before PvP is enabled!"));
                break;
        }
    }

}
