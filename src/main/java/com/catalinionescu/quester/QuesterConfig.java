package com.catalinionescu.quester;

import org.bukkit.configuration.file.FileConfiguration;

public class QuesterConfig {
    public final static String ADMIN_PERMISSION_NODE = "quester.admin";

    private final Quester plugin;
    private FileConfiguration config;

    private boolean debug;

    public QuesterConfig(Quester plugin) {
        this.plugin = plugin;
    }

    public void load() {
        plugin.saveDefaultConfig();
        applyConfig();
    }

    private void applyConfig() {
        plugin.reloadConfig();

        config = plugin.getConfig();
        debug = config.getBoolean("debug", false);
    }

    public FileConfiguration getRawConfig() {
        return config;
    }

    public boolean getDebug() {
        return debug;
    }
}
