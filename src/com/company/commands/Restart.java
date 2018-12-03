package com.company.commands;

import com.company.interfaces.Command;

public class Restart implements Command {
    String[] inputArgs;

    public Restart(String[] inputArgs) {
        this.inputArgs = inputArgs;
    }

    @Override
    public String execute() {
        StringBuilder sb = new StringBuilder();
        for (String inputArg : inputArgs) {
            sb.append(inputArg).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
