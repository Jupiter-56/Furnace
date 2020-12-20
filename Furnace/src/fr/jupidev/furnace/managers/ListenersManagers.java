package fr.jupidev.furnace.managers;

import fr.jupidev.furnace.GUI.GUI_Listeners_Furnace;
import fr.jupidev.furnace.listeners.JoinAlert;
import fr.jupidev.furnace.Furnace;

public class ListenersManagers {
    public ListenersManagers(){
    }
    public static void Enable(Furnace main){

        main.getServer().getPluginManager().registerEvents(new GUI_Listeners_Furnace(), main);
        main.getServer().getPluginManager().registerEvents(new JoinAlert(), main);

    }
}
