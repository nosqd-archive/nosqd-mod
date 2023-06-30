package dev.nosqd.nosqdmod.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import static net.minecraft.server.command.CommandManager.*;


public class NosqdModsCommands {
    public static void initialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(literal("nosqd").executes(context -> {
                // /nosqd
                context.getSource().sendMessage(NosqdTextFormatter.getTextWithNosqd("hello!"));

                return 1;
            }).then(literal("config").executes(context -> {
                // /nosqd config
                context.getSource().sendMessage(NosqdTextFormatter.getTextWithNosqd("TODO: open config menu."));

                return 1;
            })));
        });
    }
}
