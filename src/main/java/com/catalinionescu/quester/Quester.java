package com.catalinionescu.quester;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.catalinionescu.quester.commands.AdminCommandHandler;
import com.catalinionescu.quester.commands.UserCommandHandler;
import com.catalinionescu.quester.listeners.ChatHandlerListener;
import com.catalinionescu.quester.listeners.PlayerListener;
import com.catalinionescu.quester.listeners.WorldListener;
import com.catalinionescu.quester.util.ChatMessages;
import com.google.common.collect.ImmutableList;

import co.aikar.commands.PaperCommandManager;

public class Quester extends JavaPlugin {
    private static Quester plugin;
    public static final Logger logger = Logger.getLogger("Quester");

    private QuesterConfig config;

    @Override
    public void onEnable() {
        plugin = this;

        // Initialize plugin messages via messages.properties
        ChatMessages.loadPluginMessages(getClassLoader());

        config = new QuesterConfig(this);
        config.load();

        Bukkit.getScheduler().runTaskLater(this, () -> {
            final PluginManager pluginManager = getServer().getPluginManager();
            pluginManager.registerEvents(new WorldListener(), this);
            pluginManager.registerEvents(new PlayerListener(), this);
            pluginManager.registerEvents(new ChatHandlerListener(), this);

            PaperCommandManager manager = new PaperCommandManager(this);

            manager.registerCommand(new AdminCommandHandler(this));
            manager.registerCommand(new UserCommandHandler(this));

            manager.getCommandCompletions().registerCompletion("onoff", c -> {
                return ImmutableList.of("on", "off");
            });
        }, 20);
    }

    @Override
    public void onDisable() {
        // Empty for now
    }

    public static Quester getInstance() {
        return plugin;
    }

    public QuesterConfig getQuesterConfig() {
        return config;
    }

    public void logDebugMessage(final String msg, final Object... args) {
        if (!getQuesterConfig().getDebug()) {
            return;
        }

        if (args == null || args.length == 0) {
            logger.fine(msg);
        } else {
            logger.fine(String.format(msg, args));
        }
    }

    public void logInfoMessage(final String msg, final Object... args) {
        if (args == null || args.length == 0) {
            logger.info(msg);
        } else {
            logger.info(String.format(msg, args));
        }
    }

    public void logErrorMessage(final String msg, final Object... args) {
        if (args == null || args.length == 0) {
            logger.severe(msg);
        } else {
            logger.severe(String.format(msg, args));
        }
    }
}