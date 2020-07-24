package fr.jupidev.furnace.Managers;

import fr.jupidev.furnace.Commands.Furnace;
import fr.jupidev.furnace.GUI.GUI_Home;
import fr.jupidev.furnace.Main;

public class CommandsManagers {
    public CommandsManagers(){
    }
    public static void Enable(Main main){

        main.getCommand("furnace").setExecutor(new Furnace());
        main.getCommand("furnaces").setExecutor(new GUI_Home());

    }
}
