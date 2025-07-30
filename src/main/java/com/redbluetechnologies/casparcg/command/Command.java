package com.redbluetechnologies.casparcg.command;

public abstract class Command {
    private String commandString;

    protected void setCommand(String commandString) {
        this.commandString = commandString;
    }

    public String getCommand() {
        return commandString;
    }
}
