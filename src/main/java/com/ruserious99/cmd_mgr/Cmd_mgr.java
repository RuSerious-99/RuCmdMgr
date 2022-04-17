package com.ruserious99.cmd_mgr;

import org.bukkit.plugin.java.JavaPlugin;

public final class Cmd_mgr extends JavaPlugin {

    @Override
    public void onEnable() {
        new TestCommand();
    }

}
