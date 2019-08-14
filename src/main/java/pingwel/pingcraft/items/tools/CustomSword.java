/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2017 minecraft-dev
 *
 * MIT License
 */

package pingwel.pingcraft.items.tools;


import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

    public CustomSword(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}

