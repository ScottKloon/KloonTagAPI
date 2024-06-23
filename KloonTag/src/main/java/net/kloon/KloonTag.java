package net.kloon;

import net.kloon.event.TagEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class KloonTag extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TagEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
