package com.company.commands;

import com.company.interfaces.Command;

public class AbortCommand implements Command {

    @Override
    public String execute() {
        return "Command abort succesfully.";
    }
}
