package pingwel.pingcraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import pingwel.pingcraft.items.armor.CustomArmor;
import pingwel.pingcraft.reference.Reference;

public class ArmorInit
{
    //Add more Armor Materials here if needed
    public static final ItemArmor.ArmorMaterial pingdiaplusarmor = EnumHelper.addArmorMaterial("pingdiaplusarmor", Reference.MOD_ID + ":pingcraft", 45, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //Add new items to the list
    public static Item pingcraft_helmet;
    public static Item pingcraft_chestplate;
    public static Item pingcraft_leggings;
    public static Item pingcraft_boots;

    //Add more Armors here
    public static void init()
    {
        pingcraft_helmet = new CustomArmor(pingdiaplusarmor, 1, EntityEquipmentSlot.HEAD);
        pingcraft_chestplate = new CustomArmor(pingdiaplusarmor, 1, EntityEquipmentSlot.CHEST);
        pingcraft_leggings = new CustomArmor(pingdiaplusarmor, 1, EntityEquipmentSlot.LEGS);
        pingcraft_boots = new CustomArmor(pingdiaplusarmor, 1, EntityEquipmentSlot.FEET);
    }
    //register items here
    public static void register()
    {
        registerItem(pingcraft_helmet);
        registerItem(pingcraft_chestplate);
        registerItem(pingcraft_leggings);
        registerItem(pingcraft_boots);
    }
testing

    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));


    }
}
