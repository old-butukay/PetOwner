package com.butukay.petowner.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.entity.passive.FoxEntity;

import java.util.List;
import java.util.UUID;

@Mixin(FoxEntity.class)
public interface FoxEntityMixin {

    @Invoker("getTrustedUuids")
    List<UUID> getTrustedIds();

}
