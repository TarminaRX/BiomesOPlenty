package biomesoplenty.common.block.trees;

import biomesoplenty.common.worldgen.feature.BOPTreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class DeadTree extends AbstractTreeGrower
{
   @Nullable
   @Override
   protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean flowers)
   {
      return random.nextInt(10) == 0 ? BOPTreeFeatures.DYING_TREE : BOPTreeFeatures.SMALL_DEAD_TREE;
   }
}