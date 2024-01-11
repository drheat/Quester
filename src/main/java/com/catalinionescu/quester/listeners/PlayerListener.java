package com.catalinionescu.quester.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerPickupItem(EntityPickupItemEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerFood(FoodLevelChangeEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerDrown(EntityAirChangeEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        // TODO
    }

    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        // TODO
    }
}
