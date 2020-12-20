package fr.jupidev.furnace.GUI;

import fr.jupidev.furnace.Furnace;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class GUI_Listeners_Furnace implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();
        Inventory inv = event.getInventory();
        ItemStack current = event.getCurrentItem();


        if (inv.getName().equalsIgnoreCase(ChatColor.RED + "Furnace") && inv.getType() == InventoryType.CHEST) {

            if(current == null) return;
            event.setCancelled(true);

            if(current.getType() == Material.WOOL && current.getData().getData() == 5){


                Furnace.getInstance().getConfig().set("plugin-enable", false);


                ItemStack item4 = new ItemStack(Material.WOOL,1, (byte) 14/*Rouge*/);
                ItemMeta meta4 = item4.getItemMeta();
                meta4.setDisplayName("§c§lOFF");
                meta4.setLore(Arrays.asList("§fRight click for", "§2enable"));
                item4.setItemMeta(meta4);
                inv.setItem(13, item4);

                player.updateInventory();

                //Laine Verte

            }

            if(current.getType() == Material.WOOL && current.getData().getData() == 14){

                Furnace.getInstance().getConfig().set("plugin-enable", true);

                ItemStack item3 = new ItemStack(Material.WOOL,1,(byte) 5/*Vert*/);
                ItemMeta meta3 = item3.getItemMeta();
                meta3.setDisplayName("§a§lON");
                meta3.setLore(Arrays.asList("§fRight click for", "§4disable"));
                item3.setItemMeta(meta3);
                inv.setItem(13, item3);

                player.updateInventory();



                //Laine ROUGE

            }

            if(current.getType() == Material.BARRIER){

                Furnace.getInstance().reloadConfig();


            }
            if(current.getType() == Material.ARROW){

                player.closeInventory();

            }
        }
    }
}