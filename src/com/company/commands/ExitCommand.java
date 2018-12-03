package com.company.commands;

import com.company.interfaces.Command;
import javafx.scene.web.HTMLEditorSkin;

public class ExitCommand implements Command {
    @Override
    public String execute() {
        String result = "Buy buy!";
        return result;
    }
}
