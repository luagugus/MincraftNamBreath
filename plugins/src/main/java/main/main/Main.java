package main.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void move(PlayerMoveEvent a){
        Player p = a.getPlayer();
        p.sendMessage("움직이는중");
    }

    @EventHandler
    public void join(PlayerJoinEvent a){
        Player p = a.getPlayer();
        p.sendMessage(p.getName() + "님 안녕하세요~");
    }

    @EventHandler
    public void command(PlayerChatEvent a){
        Player p = a.getPlayer();
        if(a.getMessage().equals("!eggname")){
            p.setDisplayName("구구");
            p.setCustomName("구구");
            p.setPlayerListName("구구");
            p.sendMessage(p.getName() + "님 안녕하세요~");
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String  label, String[] args){
        if(command.getName().equalsIgnoreCase("이름변환")) {
            if(sender instanceof Player) {
                sender.sendMessage("args[1]");
            }
        }
        return true;
    }

}
