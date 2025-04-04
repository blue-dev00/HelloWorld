package com.bluedev.helloWorld;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("안녕").setExecutor(new HelloCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
