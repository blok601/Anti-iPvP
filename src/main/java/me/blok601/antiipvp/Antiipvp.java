package me.blok601.antiipvp;

import me.blok601.antiipvp.command.CoreCommand;
import me.blok601.antiipvp.listener.CoreListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Antiipvp extends JavaPlugin {

    private static Antiipvp instance;

    private static boolean iPvP = false;

    @Override
    public void onEnable() {
        instance = this;
        registerListeners();
        getCommand("ipvp").setExecutor(new CoreCommand());

    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static Antiipvp getInstance() {
        return instance;
    }

    public static boolean isiPvP() {
        return iPvP;
    }

    public static void setiPvP(boolean iPvP) {
        Antiipvp.iPvP = iPvP;
    }

    private void registerListeners(){
        Bukkit.getPluginManager().registerEvents(new CoreListener(), this);
    }
}
