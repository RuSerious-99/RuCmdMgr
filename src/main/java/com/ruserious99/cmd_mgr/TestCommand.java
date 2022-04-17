package com.ruserious99.cmd_mgr;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TestCommand extends  Command{

    public TestCommand() {
        super("Test", new String[]{"apple", "banana"},
                "A really cool command!", "Test.Test");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        Bukkit.broadcastMessage("test command works");

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return null;
    }
}

