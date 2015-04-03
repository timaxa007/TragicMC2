/*
 * TragicMC 2 - Minecraft Mod that uses Minecraft Forge API
 * Copyright (C) 2014 TragicNeko
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package tragicneko.tragicmc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tragicneko.tragicmc.client.CommonProxy;
import tragicneko.tragicmc.commands.DoomCommand;
import tragicneko.tragicmc.commands.DoomsdayCoomand;
import tragicneko.tragicmc.dimension.SynapseWorldProvider;
import tragicneko.tragicmc.dimension.TragicWorldProvider;
import tragicneko.tragicmc.doomsday.DoomsdayManager;
import tragicneko.tragicmc.events.AmuletEvents;
import tragicneko.tragicmc.events.ChallengeItemEvents;
import tragicneko.tragicmc.events.DoomEvents;
import tragicneko.tragicmc.events.DropEvents;
import tragicneko.tragicmc.events.DynamicHealthScaling;
import tragicneko.tragicmc.events.EnchantmentEvents;
import tragicneko.tragicmc.events.MiscEvents;
import tragicneko.tragicmc.events.PotionEvents;
import tragicneko.tragicmc.events.RespawnDoomEvents;
import tragicneko.tragicmc.events.VanillaChangingEvents;
import tragicneko.tragicmc.network.MessageAmulet;
import tragicneko.tragicmc.network.MessageAttack;
import tragicneko.tragicmc.network.MessageDoom;
import tragicneko.tragicmc.network.MessageFlight;
import tragicneko.tragicmc.network.MessageGui;
import tragicneko.tragicmc.network.MessageHandlerAmulet;
import tragicneko.tragicmc.network.MessageHandlerAttack;
import tragicneko.tragicmc.network.MessageHandlerDoom;
import tragicneko.tragicmc.network.MessageHandlerFlight;
import tragicneko.tragicmc.network.MessageHandlerGui;
import tragicneko.tragicmc.network.MessageHandlerSpawnParticle;
import tragicneko.tragicmc.network.MessageHandlerUseDoomsday;
import tragicneko.tragicmc.network.MessageParticle;
import tragicneko.tragicmc.network.MessageUseDoomsday;
import tragicneko.tragicmc.worldgen.AerisWorldGen;
import tragicneko.tragicmc.worldgen.BoulderWorldGen;
import tragicneko.tragicmc.worldgen.CustomSpikesWorldGen;
import tragicneko.tragicmc.worldgen.DarkShieldWorldGen;
import tragicneko.tragicmc.worldgen.DimensionLayerWorldGen;
import tragicneko.tragicmc.worldgen.DimensionOreWorldGen;
import tragicneko.tragicmc.worldgen.FlowerWorldGen;
import tragicneko.tragicmc.worldgen.GeyserWorldGen;
import tragicneko.tragicmc.worldgen.InvertedSpikeWorldGen;
import tragicneko.tragicmc.worldgen.IsleWorldGen;
import tragicneko.tragicmc.worldgen.NetherOreWorldGen;
import tragicneko.tragicmc.worldgen.OverworldOreWorldGen;
import tragicneko.tragicmc.worldgen.RuggedTerrainWorldGen;
import tragicneko.tragicmc.worldgen.StarCrystalWorldGen;
import tragicneko.tragicmc.worldgen.SteamVentWorldGen;
import tragicneko.tragicmc.worldgen.StringLightWorldGen;
import tragicneko.tragicmc.worldgen.StructureWorldGen;
import tragicneko.tragicmc.worldgen.VoidPitWorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = TragicMC.MODID, name = TragicMC.MODNAME, version = TragicMC.VERSION, acceptedMinecraftVersions = TragicMC.ACCEPTED_VERSION, dependencies="required-after:Forge")
public class TragicMC
{
	public static final String MODNAME = "TragicMC 2";
	public static final String MODID = "TragicMC";
	public static final String VERSION = "2.42.2178 Beta";
	public static final String ACCEPTED_VERSION = "[1.7.10]";

	@Instance(TragicMC.MODID)
	private static TragicMC instance;

	@SidedProxy(clientSide = "tragicneko.tragicmc.client.ClientProxy", serverSide = "tragicneko.tragicmc.client.CommonProxy")
	public static CommonProxy proxy;

	public static SimpleNetworkWrapper net;
	private static final Logger logger = LogManager.getLogger(TragicMC.MODID);

	public static final int idAmuletGui = 1;

	public static final Random rand = new Random();
	private static Configuration config;

	private static long time = 0L;
	public static boolean DEBUG = true;

	public static CreativeTabs Survival;
	public static CreativeTabs Creative;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logTime();

		config = null;
		config = new Configuration(event.getSuggestedConfigurationFile(), TragicMC.VERSION, true);
		TragicConfig.initialize();
		MinecraftForge.EVENT_BUS.register(new TragicConfig());

		logDuration("Configuration");

		if (TragicConfig.allowPotions)
		{
			if (Potion.potionTypes.length >= 64)
			{
				TragicPotion.load();
				MinecraftForge.EVENT_BUS.register(new PotionEvents());
			}
			else
			{
				TragicMC.logError("The potionType array was not set to an adequate amount, as a result potion effects are disabled now to prevent any crashes.");
				TragicConfig.disablePotions();
			}
		}

		if (TragicConfig.allowEnchantments) TragicEnchantments.load();
		if (TragicConfig.allowEnchantments) MinecraftForge.EVENT_BUS.register(new EnchantmentEvents());

		logDuration("Potions and Enchantments");

		Survival = (new CreativeTabs("tragicMCSurvival") {
			@Override
			public Item getTabIconItem() {
				return TragicItems.AwakeningStone;
			}
		});

		Creative = (new CreativeTabs("tragicMCCreative") {
			@Override
			public Item getTabIconItem() {
				return TragicItems.NekoNekoWand;
			}
		});

		TragicBlocks.load();
		logDuration("Blocks");
		TragicItems.load();
		logDuration("Items");
		if (TragicConfig.allowPotions) TragicPotion.setPotionIcons();
		if (!TragicConfig.mobsOnly) TragicRecipes.load();

		if (TragicConfig.allowAmulets) MinecraftForge.EVENT_BUS.register(new AmuletEvents());
		MinecraftForge.EVENT_BUS.register(new MiscEvents());
		MinecraftForge.EVENT_BUS.register(new ChallengeItemEvents());

		if (TragicConfig.allowDoom)
		{
			MinecraftForge.EVENT_BUS.register(new DoomEvents());
			FMLCommonHandler.instance().bus().register(new RespawnDoomEvents());
		}
		logDuration("Events 1");

		if (TragicConfig.allowMobs)
		{
			TragicEntities.load();
			MinecraftForge.EVENT_BUS.register(new DynamicHealthScaling());
		}

		logDuration("Entities");

		if (TragicConfig.allowChallengeScrolls) TragicItems.initializeChallengeItem();

		MinecraftForge.EVENT_BUS.register(new DropEvents());
		logDuration("Events 2");

		if (TragicConfig.allowDimension)
		{
			if (!DimensionManager.isDimensionRegistered(TragicConfig.dimensionID))
			{
				DimensionManager.registerProviderType(TragicConfig.providerID, TragicWorldProvider.class, TragicConfig.keepDimensionLoaded);
				DimensionManager.registerDimension(TragicConfig.dimensionID, TragicConfig.providerID);
			}
			else
			{
				int id = DimensionManager.getNextFreeDimId();
				TragicConfig.dimensionID = id;
				TragicConfig.providerID = id;
				DimensionManager.registerProviderType(TragicConfig.providerID, TragicWorldProvider.class, TragicConfig.keepDimensionLoaded);
				DimensionManager.registerDimension(TragicConfig.dimensionID, TragicConfig.providerID);
			}

			if (!DimensionManager.isDimensionRegistered(TragicConfig.synapseID))
			{
				DimensionManager.registerProviderType(TragicConfig.synapseProviderID, SynapseWorldProvider.class, TragicConfig.keepDimensionLoaded);
				DimensionManager.registerDimension(TragicConfig.synapseID, TragicConfig.synapseProviderID);
			}
			else
			{
				int id = DimensionManager.getNextFreeDimId();
				TragicConfig.synapseID = id;
				TragicConfig.synapseProviderID = id;
				DimensionManager.registerProviderType(TragicConfig.synapseProviderID, SynapseWorldProvider.class, TragicConfig.keepDimensionLoaded);
				DimensionManager.registerDimension(TragicConfig.synapseID, TragicConfig.synapseProviderID);
			}

			TragicBiomes.load();
			MinecraftForge.ORE_GEN_BUS.register(new MiscEvents());
		}

		logDuration("Dimension Registrations");

		NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
		if (TragicConfig.allowDoomsdays) FMLCommonHandler.instance().bus().register(new DoomsdayManager());
		DoomsdayManager.clearRegistry();

		logDuration("Events 3");

		if (TragicConfig.allowVanillaChanges) MinecraftForge.EVENT_BUS.register(new VanillaChangingEvents());
		if (TragicConfig.allowOverworldOreGen) GameRegistry.registerWorldGenerator(new OverworldOreWorldGen(), 1);
		if (TragicConfig.allowNetherOreGen) GameRegistry.registerWorldGenerator(new NetherOreWorldGen(), 2);
		GameRegistry.registerWorldGenerator(new FlowerWorldGen(), 3);

		if (TragicConfig.allowDimension)
		{
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.PaintedClearing);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.PaintedForest);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.PaintedHills);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.PaintedPlains);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.AshenBadlands);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.AshenHills);
			FlowerWorldGen.allowedBiomes.add(TragicBiomes.AshenMountains);

			if (TragicConfig.allowVoidPitGen) GameRegistry.registerWorldGenerator(new VoidPitWorldGen(), 4);
			if (TragicConfig.allowDarkStoneVariantGen) GameRegistry.registerWorldGenerator(new DimensionLayerWorldGen(), 5);
			GameRegistry.registerWorldGenerator(new StarCrystalWorldGen(), 6); //for the starlit prarie
			GameRegistry.registerWorldGenerator(new CustomSpikesWorldGen(), 7); //for the decaying wasteland and tainted spikes
			GameRegistry.registerWorldGenerator(new RuggedTerrainWorldGen(), 8); //for the ashen badlands and tainted scarlands
			GameRegistry.registerWorldGenerator(new DarkShieldWorldGen(), 9); //for the ashen badlands and decaying wasteland
			GameRegistry.registerWorldGenerator(new IsleWorldGen(), 10); //for the tainted isles
			GameRegistry.registerWorldGenerator(new StringLightWorldGen(), 12); //For Hallowed biomes
			GameRegistry.registerWorldGenerator(new GeyserWorldGen(), 13); //For the Scorched biomes
			GameRegistry.registerWorldGenerator(new SteamVentWorldGen(), 14); //For Scorched biomes
			GameRegistry.registerWorldGenerator(new BoulderWorldGen(), 15); //For Scorched biomes
			GameRegistry.registerWorldGenerator(new InvertedSpikeWorldGen(), 18); //For the tainted scarlands
			GameRegistry.registerWorldGenerator(new DimensionOreWorldGen(), 19);
			GameRegistry.registerWorldGenerator(new AerisWorldGen(), 25);
		}

		if (TragicConfig.allowStructureGen) GameRegistry.registerWorldGenerator(new StructureWorldGen(), 20);

		logDuration("WorldGen registration");

		net = new SimpleNetworkWrapper(TragicMC.MODID);
		net.registerMessage(MessageHandlerDoom.class, MessageDoom.class, 0, Side.CLIENT);
		net.registerMessage(MessageHandlerAmulet.class, MessageAmulet.class, 1, Side.CLIENT);
		net.registerMessage(MessageHandlerGui.class, MessageGui.class, 2, Side.SERVER);
		net.registerMessage(MessageHandlerUseDoomsday.class, MessageUseDoomsday.class, 3, Side.SERVER);
		net.registerMessage(MessageHandlerFlight.class, MessageFlight.class, 4, Side.CLIENT);
		net.registerMessage(MessageHandlerAttack.class, MessageAttack.class, 5, Side.SERVER);
		net.registerMessage(MessageHandlerSpawnParticle.class, MessageParticle.class, 6, Side.CLIENT);

		logDuration("Network Handlers");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		logTime();

		proxy.registerRenders();
		logDuration("Proxy Registrations");
	}

	@EventHandler
	public void onServerLoad(FMLServerStartingEvent event)
	{
		if (TragicConfig.allowDoom) event.registerServerCommand(new DoomCommand());
		if (TragicConfig.allowDoomsdays) event.registerServerCommand(new DoomsdayCoomand());

		if (!event.getServer().isFlightAllowed())
		{
			TragicConfig.allowFlight = false;
			logWarning("Flight potion effect is disabled due to the server not allowing it. Change the option in your server.properties file if you want it enabled.");
		}
	}

	public static void doPotionReflection()
	{
		try
		{
			Potion[] potionTypes;
			Field f = ReflectionHelper.findField(Potion.class, "potionTypes", "field_76425_a");

			if (f == null) throw new Throwable();

			Field modfield = Field.class.getDeclaredField("modifiers");
			modfield.setAccessible(true);
			modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
			potionTypes = (Potion[])f.get(null);

			if (potionTypes.length <= 64)
			{
				final Potion[] newPotionTypes = new Potion[256];
				System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
				f.set(null, newPotionTypes);
			}
			else
			{
				logWarning("potionTypes[]'s array length was " + Potion.potionTypes.length + ", so it is assumed that it was previously reflected to an adequate amount.");
			}
		}
		catch (Throwable t)
		{
			logError("There was an error during Potion array reflection, this may be due to obfuscation and could have unintended side effects.", t);
		}
	}

	public static void logError(String s)
	{
		logger.error(s);
	}

	public static void logError(String s, Exception e)
	{
		logger.error(s, e);
	}

	public static void logError(String s, Throwable t)
	{
		logger.error(s, t);
	}

	public static void logInfo(String s)
	{
		if (!DEBUG) return;
		logger.info(s);
	}

	public static void logWarning(String s)
	{
		logger.warn(s);
	}

	public static Configuration getConfig()
	{
		return config;
	}

	public static void logTime()
	{
		time = System.currentTimeMillis();
	}

	public static void logDuration(String sectionName)
	{
		if (!DEBUG) return;

		long l = System.currentTimeMillis() - time;
		logInfo("Time to complete section (" + sectionName + ") was " + l + " ms.");
		logTime();
	}

	public static TragicMC getInstance() {
		return instance;
	}
}
