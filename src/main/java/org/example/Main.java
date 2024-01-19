package org.example;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault("INSERT_TOKEN_HERE");

        builder.setActivity(Activity.watching("void(0)"));

        builder.build();
    }
}