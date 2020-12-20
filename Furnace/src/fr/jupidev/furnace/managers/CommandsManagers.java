package fr.jupidev.furnace.managers;

import fr.jupidev.furnace.GUI.GUI_Home;
import fr.jupidev.furnace.Furnace;
import fr.jupidev.furnace.commands.FurnaceCmd;

public class CommandsManagers {
    public CommandsManagers(){
    }
    public static void Enable(Furnace main){

        main.getCommand("furnace").setExecutor(new FurnaceCmd());
        main.getCommand("furnaces").setExecutor(new GUI_Home());

    }
}
