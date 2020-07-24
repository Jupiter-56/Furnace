package fr.jupidev.furnace.Managers;

import fr.jupidev.furnace.GUI.GUI_Listeners_Furnace;
import fr.jupidev.furnace.Listeners.JoinAlert;
import fr.jupidev.furnace.Main;

public class ListenersManagers {
    public ListenersManagers(){
    }
    public static void Enable(Main main){

        main.getServer().getPluginManager().registerEvents(new GUI_Listeners_Furnace(), main);
        main.getServer().getPluginManager().registerEvents(new JoinAlert(), main);

    }
}
