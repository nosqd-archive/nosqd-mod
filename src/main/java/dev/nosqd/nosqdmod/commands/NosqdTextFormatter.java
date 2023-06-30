package dev.nosqd.nosqdmod.commands;

import net.minecraft.text.*;
import net.minecraft.util.Formatting;

public class NosqdTextFormatter {
    public static Text getNosqdText() {
        Text leftP = Text.literal("[").formatted(Formatting.GRAY);
        Text nosqd = Text.literal("nosqd mod")
                .formatted(Formatting.YELLOW)
                .styled(s -> s.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.literal("nosqd - author of mod"))));
        Text rightP = Text.literal("]").formatted(Formatting.GRAY);
        return Text.literal("").append(leftP).append(nosqd).append(rightP);
    }

    public static Text getTextWithNosqd(String t) {
        return Text.literal("").append(getNosqdText()).append(" " + t);
    }
}
