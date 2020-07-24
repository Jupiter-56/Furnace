package fr.jupidev.furnace.Listeners;

import fr.jupidev.furnace.Main;
import fr.jupidev.furnace.Utils.Logger;
import fr.jupidev.furnace.Utils.Settings;
import fr.jupidev.furnace.Utils.UpdateChecker;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinAlert implements Listener {


    @EventHandler(
            priority = EventPriority.HIGHEST
    )
    public static void OnJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if(Main.getConfiguration().getBoolean("version.alert-onjoin")){
            if(player.hasPermission("furnace.update")){
                new UpdateChecker(Main.getInstance(), 80841).getLatestVersion(version -> {
                    if (Main.getInstance().getDescription().getVersion().equalsIgnoreCase(version)){
                        player.sendMessage(Main.getConfiguration().getString("version").replaceAll("&", "§") + " " + "§aNo update available, the plugin is up to date !");
                    } else {
                        player.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + "§aA new update is available, please check our Spigot page !");
                    }
                });

            } else {
                player.updateInventory();
            }
        } else {
            player.updateInventory();
        }

    }

    @EventHandler
    public void onDevJoin(PlayerJoinEvent e) { //THIS EVENT IS USED FOR DEBUG REASONS ONLY!
        Player p = e.getPlayer();
        if (p.getName().equals("Jupiter_56")) {
            p.sendMessage(ChatColor.RED + "JupiDev Debug Message");
            p.sendMessage(" ");
            p.sendMessage(ChatColor.GREEN + "This server is using " + Settings.NAME + " version " + Settings.VERSION);
            p.sendMessage(" ");
        }
    }



}
