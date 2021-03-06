package net.guavy.gravestones.api;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface GravestonesApi {
    List<ItemStack> getInventory(PlayerEntity entity);

    //Return extra items that don't fit!
    List<ItemStack> setInventory(List<ItemStack> inventory, PlayerEntity entity);

    int getInventorySize(PlayerEntity entity);
}
