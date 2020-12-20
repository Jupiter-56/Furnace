package fr.jupidev.furnace.listeners;

import fr.jupidev.furnace.Furnace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import sun.applet.Main;

import java.util.UUID;

public class Cooldown implements Listener {

    @EventHandler
    public void onChat(PlayerCommandPreprocessEvent event) {
        UUID uuid = event.getPlayer().getUniqueId();
        Player player = event.getPlayer();

        if (player.getServer().dispatchCommand(player, "/furnace")) {
            if (Furnace.getConfiguration().getBoolean("cooldown")) {

                if (Furnace.getInstance().cooldown.containsKey(uuid)) {
                    float time = (System.currentTimeMillis() - Furnace.getInstance().cooldown.get(uuid)) / 1000;

                    if (time < Furnace.getConfiguration().getInt("cooldown.time") + .0f) {
                        event.setCancelled(true);
                       player.sendMessage(Furnace.getConfiguration().getString("prefix") + Furnace.getConfiguration().get("cooldown-error") + Furnace.getConfiguration().get("cooldown-unit"));
                    } else {
                        Furnace.getInstance().cooldown.put(uuid, System.currentTimeMillis());
                    }
                } else {
                    Furnace.getInstance().cooldown.put(uuid, System.currentTimeMillis());
                }
            }
        }
    }

}
