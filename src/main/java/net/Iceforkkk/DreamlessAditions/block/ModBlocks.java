package net.Iceforkkk.DreamlessAditions.block;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Dreamless_Spells.MOD_ID);

    public static final DeferredBlock<Block> SLEEPLESSCLOTHBLOCK = registerBlock("sleepless_cloth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> JADEORE = registerBlock("jade_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TUNGSTENORE = registerBlock("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> TUNGSTENBLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).sound(SoundType.NETHERITE_BLOCK)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void  registerBlockItem(String Name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(Name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
