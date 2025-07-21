package com.bartoszolewinski.gamba.event;

import com.bartoszolewinski.gamba.GambaCraft;
import com.bartoszolewinski.gamba.item.ModItems;
import com.bartoszolewinski.gamba.villagers.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = GambaCraft.MODID)
public class ModEvents {


    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.CASINO_TELLER.getKey()) {

            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.COAL, 32),
                    new ItemStack(ModItems.CASINO_CHIP_1s.get(), 8),
                    6,
                    3,
                    0.05f
            ));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.COPPER_INGOT, 32),
                    new ItemStack(ModItems.CASINO_CHIP_10s.get(), 8),
                    6,
                    4,
                    0.05f
            ));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.IRON_INGOT, 32),
                    new ItemStack(ModItems.CASINO_CHIP_25s.get(), 8),
                    6,
                    5,
                    0.05f
            ));
            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(ModItems.CASINO_CHIP_50s.get(), 8),
                    6,
                    6,
                    0.05f
            ));

            //trade for buying blackjack and poker tables
        }
    }
}
