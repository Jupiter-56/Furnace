package fr.jupidev.furnace;

import fr.jupidev.furnace.Commands.Furnace;
import fr.jupidev.furnace.GUI.GUI_Listeners_Furnace;
import fr.jupidev.furnace.GUI.GUI_Home;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    public Main() {
    }

    @Override
    public void onLoad() {

    }

    public void onEnable() {
        instance = this;

        ConsoleCommandSender csl = Bukkit.getConsoleSender();
        csl.sendMessage(c("&a------------------------------------"));
        csl.sendMessage(c("Plugin Furnace --> ON"));
        csl.sendMessage(c("Version --> 1.0.0"));
        csl.sendMessage(c("&a------------------------------------"));
        saveDefaultConfig();

        getCommand("furnace").setExecutor(new Furnace());
        getCommand("furnaces").setExecutor(new GUI_Home());
        getServer().getPluginManager().registerEvents(new GUI_Listeners_Furnace(), this);

    }

    public void onDisable() {
    }

    public static Main getInstance() {
        return instance;
    }

    public static FileConfiguration getConfiguration() {
        return getInstance().getConfig();
    }


    //Couleurs de la console
    public static String c(String msg) {
        return msg.replaceAll("&", "§");
    }

}