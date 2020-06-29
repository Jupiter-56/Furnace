package fr.jupidev.furnace.Commands;

import fr.jupidev.furnace.Main;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;



public class Furnace implements CommandExecutor {
    @Override
    @SuppressWarnings("deprecated")
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("furnace")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                ItemStack item = p.getItemInHand();
                Material mat = item.getType();
                if ((p.hasPermission("perm.furnace"))) {
                    if (Main.getConfiguration().getBoolean("plugin-enable")) {
                            switch (mat) {
                                case COBBLESTONE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.STONE, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case IRON_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case GOLD_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case SAND:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.GLASS, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case PORK:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.GRILLED_PORK, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case RAW_BEEF:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case RAW_FISH:
                                    if (p.getInventory().getItemInHand().getType().getId() == 349 && p.getInventory().getItemInHand().getData().getData() == (byte) 1) {
                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.COOKED_FISH, item.getAmount(), (byte) 1));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    } else {
                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.COOKED_FISH, item.getAmount()));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    }
                                    break;
                                case RAW_CHICKEN:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COOKED_CHICKEN, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case LOG:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COAL, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case POTATO_ITEM:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.BAKED_POTATO, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case RABBIT:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COOKED_RABBIT, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case MUTTON:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COOKED_MUTTON, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case LAPIS_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.INK_SACK, item.getAmount(), (byte) 4));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case NETHERRACK:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.NETHER_BRICK_ITEM, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case CLAY_BALL:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.CLAY_BRICK, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case CLAY:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.HARD_CLAY, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case SMOOTH_BRICK:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.SMOOTH_BRICK, item.getAmount(), (byte) 2));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case COAL_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.COAL, item.getAmount(), (byte) 1));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case DIAMOND_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.DIAMOND, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case REDSTONE_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.REDSTONE, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case EMERALD_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.EMERALD, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case QUARTZ_ORE:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.QUARTZ, item.getAmount()));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case CACTUS:
                                    p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                    p.getInventory().addItem(new ItemStack(Material.INK_SACK, item.getAmount(), (byte) 2));
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));
                                    break;
                                case SPONGE:
                                    if (p.getInventory().getItemInHand().getType().getId() == 19 && p.getInventory().getItemInHand().getData().getData() == (byte) 1) {

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.SPONGE, item.getAmount()));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }

                                    break;
                                //LEATHER_ARMORS
                                case LEATHER_BOOTS:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.leather")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.LEATHER, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case LEATHER_LEGGINGS:
                                case LEATHER_CHESTPLATE:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.leather")) {
                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.LEATHER, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case LEATHER_HELMET:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.leather")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.LEATHER, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //IRON_ARMORS
                                case IRON_BOOTS:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.iron")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case IRON_LEGGINGS:
                                case IRON_CHESTPLATE:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.iron")) {
                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case IRON_HELMET:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.iron")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case IRON_BARDING:
                                    if (Main.getConfiguration().getBoolean("furnace.horse.iron")) {

                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //GOLD_ARMORS
                                case GOLD_BOOTS:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.gold")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case GOLD_LEGGINGS:
                                case GOLD_CHESTPLATE:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.gold")) {
                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case GOLD_HELMET:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.gold")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case GOLD_BARDING:
                                    if (Main.getConfiguration().getBoolean("furnace.horse.gold")) {

                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //DIAMOND_ARMORS
                                case DIAMOND_BOOTS:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.diamond")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case DIAMOND_LEGGINGS:
                                case DIAMOND_CHESTPLATE:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.diamond")) {
                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case DIAMOND_HELMET:
                                    if (Main.getConfiguration().getBoolean("furnace.armors.diamond")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case DIAMOND_BARDING:
                                    if (Main.getConfiguration().getBoolean("furnace.horse.diamond")) {

                                        int max = 0, min = 3;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //WOOD_TOOLS
                                case WOOD_SPADE:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.wood.shovel")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.WOOD, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case WOOD_AXE:
                                case WOOD_HOE:
                                case WOOD_PICKAXE:
                                case WOOD_SWORD:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.wood.other")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.WOOD, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;

                                //STONE_TOOLS
                                case STONE_SPADE:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.stone.shovel")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case STONE_AXE:
                                case STONE_HOE:
                                case STONE_PICKAXE:
                                case STONE_SWORD:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.stone.other")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //IRON_TOOLS
                                case IRON_SPADE:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.iron.shovel")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case IRON_AXE:
                                case IRON_HOE:
                                case IRON_PICKAXE:
                                case IRON_SWORD:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.iron.other")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //GOLD_TOOLS
                                case GOLD_SPADE:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.gold.shovel")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case GOLD_AXE:
                                case GOLD_HOE:
                                case GOLD_PICKAXE:
                                case GOLD_SWORD:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.gold.other")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //DIAMOND_TOOLS
                                case DIAMOND_SPADE:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.diamond.shovel")) {

                                        int max = 0, min = 1;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case DIAMOND_AXE:
                                case DIAMOND_HOE:
                                case DIAMOND_PICKAXE:
                                case DIAMOND_SWORD:
                                    if (Main.getConfiguration().getBoolean("furnace.tools.diamond.other")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                //SADDLE
                                case SADDLE:
                                    if (Main.getConfiguration().getBoolean("furnace.saddle")) {

                                        int max = 0, min = 2;

                                        int a = (int) (Math.random() * (max - min)) + min;

                                        p.getInventory().setItemInHand(new ItemStack(Material.AIR));
                                        p.getInventory().addItem(new ItemStack(Material.LEATHER, a));
                                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.item-cook").replaceAll("&", "§"));

                                    } else {
                                       p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    }
                                    break;
                                case AIR:
                                    p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&", "§") + " " + Main.getConfiguration().getString("messages.cannot-cook-air").replaceAll("&", "§"));
                                    break;
                                default:
                                   p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.cannot-be-cook").replaceAll("&","§"));
                                    break;

                            }
                        } else {

                        if(Main.getConfiguration().getBoolean("alert.not-enable")){

                                p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.not-enable").replaceAll("&","§"));
                        } else {
                            return false;
                        }
                    }

                    } else {
                        p.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.no-permission").replaceAll("&","§"));

                    }
                } else {
                    sender.sendMessage(Main.getConfiguration().getString("prefix").replaceAll("&","§") + " " + Main.getConfiguration().getString("messages.console-executing").replaceAll("&","§"));

                }
        }
        return false;
    }
}

