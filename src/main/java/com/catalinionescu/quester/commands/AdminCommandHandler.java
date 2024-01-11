package com.catalinionescu.quester.commands;

import org.bukkit.command.CommandSender;

import com.catalinionescu.quester.Quester;
import com.catalinionescu.quester.QuesterConfig;
import com.catalinionescu.quester.util.ChatMessages;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CatchUnknown;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;

// For more details on command annotations see https://aikar.github.io/commands/

@CommandAlias("questadmin|qa")
@CommandPermission(QuesterConfig.ADMIN_PERMISSION_NODE)
public class AdminCommandHandler extends BaseCommand {
    private Quester plugin;

    public AdminCommandHandler(Quester plugin) {
        this.plugin = plugin;
    }

    @Subcommand("help")
    @CatchUnknown
    @Default
    public void doHelp(CommandSender sender) {
        sender.sendMessage(ChatMessages.getMessage("cmd-help"));
    }

    @Subcommand("reload")
    public void subCmdReload(CommandSender sender) {
        plugin.getQuesterConfig().load();
        sender.sendMessage(ChatMessages.getMessage("configuration-loaded"));
    }
}
