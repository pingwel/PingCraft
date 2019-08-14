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

import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe
{

    public CustomPickaxe(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
