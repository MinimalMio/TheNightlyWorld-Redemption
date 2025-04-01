package moe.ksakura;

import moe.ksakura.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheNightlyWorldRedemption implements ModInitializer {
	public static final String MOD_ID = "nightly";

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}