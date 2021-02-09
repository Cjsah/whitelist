package net.cjsah.whitelist;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.Whitelist;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Whitelist.class)
public abstract class WhitelistMixin {
	/**
	 * @author Cjsah
	 * @reason 使白名单匹配名字而不再匹配uuid
	 */
	@Overwrite
	public String toString(GameProfile gameProfile) {
		return gameProfile.getName();
	}
}
