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


import net.minecraft.item.ItemHoe;
import pingwel.pingcraft.PingCraft;

public class CustomHoe extends ItemHoe
{

    public CustomHoe(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PingCraft.pingcrafttab);
    }
}
