/* lmao one line plugin */package net.badbird5907.onelineplugin;import org.bukkit.Bukkit;import org.bukkit.event.EventHandler;import org.bukkit.event.Listener;import org.bukkit.event.player.PlayerMoveEvent;import org.bukkit.plugin.java.JavaPlugin;public final class OneLinePlugin extends JavaPlugin implements Listener { @Override public void onEnable() {Bukkit.getServer().getPluginManager().registerEvents(this,this);}@EventHandler public void onMove(PlayerMoveEvent event){event.getPlayer().sendMessage("From: " + event.getFrom() + " | To: " + event.getTo() );}}