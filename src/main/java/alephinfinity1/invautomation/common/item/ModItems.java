package alephinfinity1.invautomation.common.item;

import alephinfinity1.invautomation.InventoryAutomation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InventoryAutomation.MOD_ID);
	
	public static final RegistryObject<Item> INVENTORY_FURNACE = ITEMS.register("inventory_furnace", () -> new InventoryFurnaceItem(new Item.Properties()));

}
