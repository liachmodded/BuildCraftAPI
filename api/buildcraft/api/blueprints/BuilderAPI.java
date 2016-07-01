/** Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 *
 * The BuildCraft API is distributed under the terms of the MIT License. Please check the contents of the license, which
 * should be located as "LICENSE.API" in the BuildCraft source code distribution. */
package buildcraft.api.blueprints;

public final class BuilderAPI {
    public static ISchematicRegistry schematicRegistry;
    public static ISchematicHelper schematicHelper;

@Deprecated    public static final int BREAK_ENERGY = 160;// rf
@Deprecated    public static final int BUILD_ENERGY = 240;// rf
    public static final int BREAK_POWER = 16_000;// mMj
    public static final int BUILD_POWER = 24_000;// mMj

    private BuilderAPI() {}
}
