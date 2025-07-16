package com.bartoszolewinski.gamba.item;

import com.bartoszolewinski.gamba.GambaCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.bartoszolewinski.gamba.GambaCraft.MODID;
import static com.bartoszolewinski.gamba.blocks.ModBlocks.CASINO_TILL;

public class ModItems {


    // Create a Deferred Register to hold Items which will all be registered under the "gambacraft" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);


    //casino chips
    public static final DeferredItem<Item> CASINO_CHIP_1s = ITEMS.registerItem(
            "casino_chip_1s",
            Item::new,
            new Item.Properties().rarity(Rarity.COMMON)
    );

    public static final DeferredItem<Item> CASINO_CHIP_10s = ITEMS.registerItem(
            "casino_chip_10s",
            Item::new,
            new Item.Properties().rarity(Rarity.UNCOMMON)
    );
    public static final DeferredItem<Item> CASINO_CHIP_25s = ITEMS.registerItem(
            "casino_chip_25s",
            Item::new,
            new Item.Properties().rarity(Rarity.RARE)
    );
    public static final DeferredItem<Item> CASINO_CHIP_50s = ITEMS.registerItem(
            "casino_chip_50s",
            Item::new,
            new Item.Properties().rarity(Rarity.EPIC)
    );


    //casino till profession block item
    public static final DeferredItem<BlockItem> CASINO_TILL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            CASINO_TILL
    );




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
