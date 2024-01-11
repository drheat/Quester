package com.catalinionescu.quester.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import io.papermc.paper.event.player.AsyncChatEvent;

public class ChatHandlerListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerChat(AsyncChatEvent event) {
        final Player player = event.getPlayer();

        // TODO: look for specific keywords
    }
}
