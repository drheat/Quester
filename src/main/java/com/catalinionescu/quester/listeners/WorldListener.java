package com.catalinionescu.quester.listeners;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class WorldListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // TODO
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        // TODO
    }

    @EventHandler
    public void onHangingPlace(HangingPlaceEvent event) {
        // TODO
    }

    @EventHandler
    public void onHangingBreak(HangingBreakByEntityEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerPlaceIntoFrame(PlayerInteractEntityEvent event) {
        final Player player = event.getPlayer();

        Entity entity = event.getRightClicked();
        if (entity instanceof ItemFrame || entity instanceof ArmorStand) {
            // TODO
        }
    }

    @EventHandler
    public void onPlayerMessArmorStands(PlayerArmorStandManipulateEvent event) {
        final Player player = event.getPlayer();

        // TODO
    }
}
