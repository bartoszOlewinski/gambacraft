package com.bartoszolewinski.gamba.screen.custom;

import com.bartoszolewinski.gamba.blocks.custom.SlotsMachineBlock;
import com.bartoszolewinski.gamba.blocks.entity.SlotsMachineBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

public class SlotsMachineMenu extends AbstractContainerMenu {

    public final SlotsMachineBlockEntity blockEntity;
    private final Level level;


    protected SlotsMachineMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        this(containerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()));
    }

    public SlotsMachineMenu(int containerId, Inventory inv, BlockEntity block) {
        super(, containerId);

        this.blockEntity = ((SlotsMachineBlockEntity) block);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
