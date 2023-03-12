package eu.ansquare.welcounter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;


public class Welcounter extends JavaPlugin {
    Events ev;
    Welcounter instance;
    ArrayList<Map<String, String>> list;
    @Override
    public void onEnable(){
        instance = this;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(label.equalsIgnoreCase("welcounter")){
            if(args[0].equalsIgnoreCase("count"))
            return true;
        }
        return false;
    }
    void getWelcomeCount(Player player){
        UUID playerUuid = player.getUniqueId();
        for (Map<String, String> map: list) {

        }
    }

}