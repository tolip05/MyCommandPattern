package com.company;

import com.company.core.CommandInterpriterImpl;
import com.company.core.EngineImpl;
import com.company.interfaces.CommandInterpreter;
import com.company.interfaces.Engine;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        CommandInterpreter commandInterpreter =
                new CommandInterpriterImpl();
        Engine engine = new EngineImpl(commandInterpreter);
        engine.run();
    }
}
