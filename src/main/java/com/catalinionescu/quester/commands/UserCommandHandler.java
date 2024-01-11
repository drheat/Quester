package com.catalinionescu.quester.commands;

import org.bukkit.command.CommandSender;

import com.catalinionescu.quester.Quester;
import com.catalinionescu.quester.util.ChatMessages;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;

@CommandAlias("quest|q")
public class UserCommandHandler extends BaseCommand {
    private Quester plugin;

    public UserCommandHandler(Quester plugin) {
        this.plugin = plugin;
    }

    @CommandAlias("help")
    public void cmdHelp(CommandSender sender) {
        sender.sendMessage(ChatMessages.getMessage("help"));
    }
}
