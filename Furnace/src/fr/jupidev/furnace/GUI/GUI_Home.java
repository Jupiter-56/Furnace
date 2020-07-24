package fr.jupidev.furnace.GUI;

import fr.jupidev.furnace.Main;
import fr.jupidev.furnace.Utils.Logger;
import fr.jupidev.furnace.Utils.Settings;
import fr.jupidev.furnace.Utils.UpdateChecker;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public class GUI_Home implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("furnaces")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (args.length == 0) {

                    p.sendMessage( Main.getConfiguration().getString("prefix") + " " + Main.getConfiguration().getString("messages.not-enough-arguments"));

                } else {

                    if(args.length == 1){
                        String arg = args[0];
                        if(arg.equalsIgnoreCase("help")){
                            p.sendMessage("§6-----------§cHelp Furnace§6-----------");
                            p.sendMessage(" ");
                            p.sendMessage("§6Version : §b/furnaces version");
                            p.sendMessage("§6Author : §b/furnaces author");
                            p.sendMessage("§6Control Pannel : §b/furnaces panel");
                            p.sendMessage("§6Reload Config : §b/furnaces reload");
                            p.sendMessage("§6Check for Update : §b/furnaces update");
                            p.sendMessage(" ");
                            p.sendMessage("§6-----------§cHelp Furnace§6-----------");
                        }
                        if(arg.equalsIgnoreCase("version")){

                            p.sendMessage(Main.getConfiguration().getString("prefix") + " " + Main.getConfiguration().getString("messages.version") + " " + Settings.VERSION + " " + "§r§a!");

                        }
                        if(arg.equalsIgnoreCase("author")){

                            p.sendMessage(Main.getConfiguration().getString("prefix") + " " + Main.getConfiguration().getString("messages.author") + " " + "§lJupiDev - Jupiter_56" + " " + "§r§a!");


                        }
                        if(arg.equalsIgnoreCase("reload")){

                            p.sendMessage(Main.getConfiguration().getString("prefix") + " " + Main.getConfiguration().getString("messages.reload"));
                            Main.getInstance().reloadConfig();

                        }
                        if(arg.equalsIgnoreCase("panel")){
                            Inventory panel = Bukkit.createInventory(null,27, ChatColor.RED + "Furnace");

                            ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
                            ItemMeta meta = item.getItemMeta();
                            item.setItemMeta(meta);
                            //
                            panel.setItem(0, item);
                            panel.setItem(1, item);
                            panel.setItem(2, item);
                            panel.setItem(3, item);
                            panel.setItem(4, item);
                            panel.setItem(5, item);
                            panel.setItem(6, item);
                            panel.setItem(7, item);
                            panel.setItem(8, item);
                            panel.setItem(9, item);
                            //
                            panel.setItem(11, item);
                            panel.setItem(12, item);
                            //
                            panel.setItem(14, item);
                            panel.setItem(15, item);
                            //
                            panel.setItem(17, item);
                            panel.setItem(18, item);
                            panel.setItem(19, item);
                            panel.setItem(20, item);
                            panel.setItem(21, item);
                            panel.setItem(22, item);
                            panel.setItem(23, item);
                            panel.setItem(24, item);
                            panel.setItem(25, item);


                            ItemStack item2 = new ItemStack(Material.FURNACE,1/*Version & Author*/);
                            ItemMeta meta2 = item2.getItemMeta();
                            meta2.setDisplayName("§6§lInformations");
                            meta2.setLore(Arrays.asList("§a§lVersion : §r§a" + Settings.VERSION, "§9§lAuthor : §r§fJupiDev - Jupiter_56"));
                            item2.setItemMeta(meta2);
                            panel.setItem(10, item2);

                            if(Main.getConfiguration().getBoolean("plugin-enable")){

                                ItemStack item3 = new ItemStack(Material.WOOL,1,(byte) 5/*Vert*/);
                                ItemMeta meta3 = item3.getItemMeta();
                                meta3.setDisplayName("§a§lON");
                                meta3.setLore(Arrays.asList("§fRight click for", "§4disable"));
                                item3.setItemMeta(meta3);
                                panel.setItem(13, item3);

                            } else {

                                ItemStack item4 = new ItemStack(Material.WOOL,1, (byte) 14/*Rouge*/);
                                ItemMeta meta4 = item4.getItemMeta();
                                meta4.setDisplayName("§c§lOFF");
                                meta4.setLore(Arrays.asList("§fRight click for", "§2enable"));
                                item4.setItemMeta(meta4);
                                panel.setItem(13, item4);

                            }


                            ItemStack item5 = new ItemStack(Material.BARRIER,1/*Reload*/);
                            ItemMeta meta5 = item5.getItemMeta();
                            meta5.setDisplayName("§cReload");
                            meta5.setLore(Arrays.asList("§fRight click for", "§6§kA§r§cReload§r§6§kA","§fthe config"));
                            item5.setItemMeta(meta5);
                            panel.setItem(16,item5);


                            ItemStack item6 = new ItemStack(Material.ARROW,1/*Retour*/);
                            ItemMeta meta6 = item6.getItemMeta();
                            meta6.setDisplayName("§bClose");
                            meta6.setLore(Arrays.asList("§fRight click for", "§fclose the panel"));
                            item6.setItemMeta(meta6);
                            panel.setItem(26,item6);


                            p.openInventory(panel);



                        }

                        if(arg.equalsIgnoreCase("update")){
                            p.sendMessage(ChatColor.RED + "Checking for updates...");
                            new UpdateChecker(Main.getInstance(), 80841).getLatestVersion(version -> {
                                if (!Main.getInstance().getDescription().getVersion().equalsIgnoreCase(version)){
                                    p.sendMessage(ChatColor.GRAY + "****************************************************************");
                                    p.sendMessage(ChatColor.RED + "Furnace is outdated!");
                                    p.sendMessage(ChatColor.RED + "Newest version: " + version);
                                    p.sendMessage(ChatColor.RED + "Your version: " + ChatColor.BOLD + Settings.VERSION);
                                    p.sendMessage(ChatColor.GOLD + "Please Update Here: " + ChatColor.ITALIC + Settings.PLUGIN_URL);
                                    p.sendMessage(ChatColor.GRAY + "****************************************************************");
                                } else {
                                    p.sendMessage(ChatColor.GRAY + "****************************************************************");
                                    p.sendMessage(ChatColor.RED + "Furnace is up to date!");
                                    p.sendMessage(ChatColor.RED + "Your version: " + ChatColor.BOLD + Settings.VERSION);
                                    p.sendMessage(ChatColor.GOLD + "Download Link: " + ChatColor.ITALIC + Settings.PLUGIN_URL);
                                    p.sendMessage(ChatColor.GRAY + "****************************************************************");
                                }
                            });


                        }
                    }
                }
            } else {
                sender.sendMessage(Main.getConfiguration().getString("prefix") + " " + Main.getConfiguration().getString("messages.console-executing"));
            }
        }



        return false;
    }
}
