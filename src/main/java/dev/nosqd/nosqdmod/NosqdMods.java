package dev.nosqd.nosqdmod;

import dev.nosqd.nosqdmod.commands.NosqdModsCommands;
import net.fabricmc.api.ModInitializer;

public class NosqdMods implements ModInitializer {
    @Override
    public void onInitialize() {
        NosqdModsCommands.initialize();
    }
}
