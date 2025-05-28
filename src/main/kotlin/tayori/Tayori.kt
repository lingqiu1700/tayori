package tayori

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import tayori.item.DiamondApple
import tayori.item.ModitemGroup

object Tayori : ModInitializer {
    private val logger = LoggerFactory.getLogger("tayori")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
		DiamondApple.registerDiamondApple();
		ModitemGroup.registerItemGroups();
	}
}