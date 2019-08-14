/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2017 minecraft-dev
 *
 * MIT License
 */

package pingwel.pingcraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import pingwel.pingcraft.items.tools.*;

public class ToolInit
{
    public static final Item.ToolMaterial pingdiaplustool = EnumHelper.addToolMaterial("ping", 3, 2500, 8.0F, 4.5F, 10);

    public static Item pingcraft_pickaxe;
    public static Item pingcraft_axe;
    public static Item pingcraft_hoe;
    public static Item pingcraft_shovel;
    public static Item pingcraft_sword;


    public static void init()
    {
        pingcraft_pickaxe = new CustomPickaxe("pingcraft_pickaxe", pingdiaplustool);
        pingcraft_axe = new CustomAxe("pingcraft_axe", pingdiaplustool);
        pingcraft_hoe = new CustomHoe("pingcraft_hoe", pingdiaplustool);
        pingcraft_shovel = new CustomShovel("pingcraft_shovel", pingdiaplustool);
        pingcraft_sword = new CustomSword("pingcraft_sword", pingdiaplustool);

    }

    public static void register()
    {
        registerItem(pingcraft_pickaxe);
        registerItem(pingcraft_axe);
        registerItem(pingcraft_hoe);
        registerItem(pingcraft_shovel);
        registerItem(pingcraft_sword);

    }

    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));


    }
}
