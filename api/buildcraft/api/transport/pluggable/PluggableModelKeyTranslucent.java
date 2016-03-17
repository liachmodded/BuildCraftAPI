package buildcraft.api.transport.pluggable;

import java.util.Arrays;
import java.util.Objects;

import net.minecraft.util.EnumFacing;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public abstract class PluggableModelKeyTranslucent<K extends PluggableModelKeyTranslucent<K>> {
    public final PluggableModelBaker.Translucent<K> baker;
    public final EnumFacing side;
    private final int hash;

    public PluggableModelKeyTranslucent(PluggableModelBaker.Translucent<K> baker, EnumFacing side) {
        if (baker == null) throw new NullPointerException("baker");
        this.baker = baker;
        this.side = side;
        this.hash = Arrays.hashCode(new int[] { System.identityHashCode(baker), Objects.hashCode(side) });
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        PluggableModelKeyTranslucent<?> other = (PluggableModelKeyTranslucent<?>) obj;
        if (baker != other.baker) return false;
        if (side != other.side) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return hash;
    }
}
