package com.github.chaosindustry.landmine;
//java_plugin is library or module ni
import org.bukkit.plugin.java.JavaPlugin;
//main_class
public final class LandminePlugin extends JavaPlugin {
    // conducted in plugin off we don't use absolutely

    // Plugin startup logic pluginが発生するイベントをしていする。
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Landmine(), this);
    }

    //プラグインを終了させるイベントを指定する。
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}