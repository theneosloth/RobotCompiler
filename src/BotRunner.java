package com.superstepa.bot;

import com.superstepa.bot.SimpleBot;
import com.superstepa.bot.CommandParser;

public class BotRunner{
    public static void main(String[] args){
        try{
            SimpleBot robot  = new SimpleBot();
            CommandParser.readLines("C:\\Users\\Superstepa\\Sync\\Programming\\Java\\RobotCompiler\\commands.cm");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
