package fr.jupidev.furnace;

import fr.jupidev.furnace.Commands.Furnace;

import fr.jupidev.furnace.GUI.GUI_Listeners_Furnace;
import fr.jupidev.furnace.GUI.GUI_Home;
import fr.jupidev.furnace.Managers.CommandsManagers;
import fr.jupidev.furnace.Managers.ListenersManagers;
import fr.jupidev.furnace.Utils.Logger;
import fr.jupidev.furnace.Utils.Settings;
import fr.jupidev.furnace.Utils.UpdateChecker;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    private static Main instance;

    public Main() {
    }
    @Override
    public void onLoad() {

        super.onLoad();
    }

    public void onEnable() {
        instance = this;

        ConsoleCommandSender csl = Bukkit.getConsoleSender();
        csl.sendMessage(c("&6------------------&bFurnace&6------------------"));
        csl.sendMessage(c("&8[&bF&8] &dPlugin created by &aJupiter_56 - JupiDev"));
        csl.sendMessage(c("&8[&bF&8] &dVersion &8--> &a " + Settings.VERSION));
        csl.sendMessage(c("&8[&bF&8] &dSupport Link &8--> &a " + Settings.SUPPORT_DISCORD_URL));
        csl.sendMessage(c("&8[&bF&8] &dSpigot Link &8--> &a " + Settings.PLUGIN_URL));
        csl.sendMessage(cOff(cOn(c("&8[&bF&8] &dPlugin &8--> ") + Main.getConfiguration().getBoolean("plugin-enable"))));
        if(Main.getConfiguration().getBoolean("enable")) {
            csl.sendMessage(cOff(cOn(c("&8[&bF&8] &dAlerts &8--> ") + Main.getConfiguration().getBoolean("alert.not-enable"))));
        } else {

            csl.sendMessage(c("&8[&bF&8] &dAlerts &8--> &4Plugin Deactivated"));
        }
        csl.sendMessage(c("&6------------------&bFurnace&6------------------"));
        //------------------Managers------------------//
        CommandsManagers.Enable(this);
        ListenersManagers.Enable(this);
        //Update System
        MetricsLite metrics = new MetricsLite(this,8300);
        //Create Configuration File
        this.createConfig();
//Update Checker
        new UpdateChecker(this, 80841).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)){
                Logger.log(Logger.LogLevel.SUCCESS, "The plugin is up to date !");
            } else {
                //Outdated Version

                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
                Logger.log(Logger.LogLevel.WARNING, ("Furnace is outdated!"));
                Logger.log(Logger.LogLevel.WARNING, ("Newest version: " + version));
                Logger.log(Logger.LogLevel.WARNING, ("Your version: " + Settings.VERSION));
                Logger.log(Logger.LogLevel.WARNING, ("Please Update Here: " + Settings.PLUGIN_URL));
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
            }
        });

        super.onEnable();

    }

    public void onDisable() {
        super.onDisable();
    }

    private void createConfig() {
        try {
            if (!getDataFolder().exists()) getDataFolder().mkdirs();

            File file = new File(getDataFolder(), "config.yml");
            if (!file.exists()) {
                saveDefaultConfig();
            }

        } catch (Exception exception) {
            getLogger().info(exception.getMessage());
        }
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
    public static String cOn(String msg) { return msg.replaceAll("true", "§2ON"); }
    public static String cOff(String msg) { return msg.replaceAll("false", "§4OFF"); }

}