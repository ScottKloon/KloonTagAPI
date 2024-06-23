package net.kloon.event;

import net.kloon.api.TagAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TagEvent implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String tag =  "[OWNER]";
        TagAPI.setTag(player, tag);

    }
}
