package io.github.apcrisu.webcmdpl;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Level;

import static spark.Spark.*;

public final class WebCmdPL extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.getLogger().log(Level.INFO, "Hello, World!");
        get(
                "index.html",
                (req, res) -> new File(super.getDataFolder() + File.separator + "index.html")
        );
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.getLogger().log(Level.INFO, "Bey, W..ld...");
    }
}
