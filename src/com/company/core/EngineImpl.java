package com.company.core;

import com.company.interfaces.CommandInterpreter;
import com.company.interfaces.Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EngineImpl implements Engine {
    private CommandInterpreter commandInterpreter;

    public EngineImpl(CommandInterpreter commandInterpreter) {
        this.commandInterpreter = commandInterpreter;
    }

    @Override
    public void run() throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try{
                String[] inputArgs = br.readLine().split("\\s+");
                String result = this.commandInterpreter.read(inputArgs);
                System.out.println(result);
            }catch (IllegalStateException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
