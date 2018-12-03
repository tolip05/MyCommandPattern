package com.company.core;

import com.company.commands.AbortCommand;
import com.company.commands.ExitCommand;
import com.company.commands.Restart;
import com.company.commands.Shutdown;
import com.company.interfaces.Command;
import com.company.interfaces.CommandInterpreter;

import java.util.Arrays;

public class CommandInterpriterImpl implements CommandInterpreter {

    private Command command;
    @Override
    public String read(String[] inputArgs) {
        String action = inputArgs[0];

        String[] modifiedArray = Arrays.copyOfRange(inputArgs, 1, inputArgs.length);
        switch (action){
            case "shutdown":
                command = new Shutdown(modifiedArray);
                break;
            case "AbortCommand":
                command = new AbortCommand();
                break;
            case "Restart":
                command = new Restart(modifiedArray);
                break;
            case "ExitCommand":
               command = new ExitCommand();
                break;
                default:break;
        }
        if (command == null){
            throw new IllegalArgumentException("Command is not suported");
        }
        String result = command.execute();
        return result;
    }
}
