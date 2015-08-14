package tragicneko.tragicmc;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class TragicConfig {

	public static boolean mobsOnly;

	private static final String catMaster = "Master Configs";
	private static final String catBlanket = "Blanket Configs";
	//private static final String catAchievements = "Achievements";
	private static final String catAmulet = "Amulets";
	private static final String catDimension = "Dimension";
	private static final String catDoom = "Doom";
	//private static final String catDoomsday = "Doomsdays";
	//private static final String catWeapons = "Weapons";
	private static final String catEnchant = "Enchantments";
	private static final String catMobs = "Mobs";
	//private static final String catMobStats = "Mob Stats";
	private static final String catPotion = "Potions";
	private static final String catVanilla = "Vanilla Changes";
	private static final String catWorldGen = "WorldGen";
	private static final String catMisc = "Miscellaneous";
	private static final String catMod = "Attribute Modifiers";

	private static boolean[] blanketConfigs = new boolean[9];
	public static boolean allowAchievements, allowAmulets, allowDimension, allowDoom, allowEnchantments, allowMobs, allowPotions, allowVanillaChanges, allowWorldGen;

	private static boolean[] blanketAmulet = new boolean[12];
	public static boolean allowNormalAmulets, allowCursedAmulets, allowEpicAmulets, allowAmuletLeveling, allowAmuletCrafting, shouldUnlockAmuletSlots, allowAmuletKillRecharge;
	public static boolean showAmuletStatus, allowAmuletModifiers, deathDropsAmulets;
	private static int[] amuletInts = new int[8];
	public static int maxAmuletSlots, overallAmuletRarity, amuletReleaseRarity, amuletModifierChance, amuletModifierChance2, amuletModifierChance3;
	private static boolean[] normalAmuletConfigs = new boolean[24];
	public static boolean amuPeace, amuYeti, amuClaymation, amuChicken, amuBlacksmith, amuCreeper, amuZombie, amuSkeleton, amuIce, amuSnowGolem, amuIronGolem;
	public static boolean amuSpider, amuStin, amuSupernatural, amuFusea, amuLuck;
	private static boolean[] cursedAmuletConfigs = new boolean[12];
	public static boolean amuKitsune, amuMartyr, amuPiercing, amuApis, amuSunken, amuEnderman, amuPolaris, amuLightning, amuConsumption, amuUndead, amuEnderDragon;
	private static boolean[] epicAmuletConfigs = new boolean[8];
	public static boolean amuTime, amuWither, amuOverlord, amuEnyvil;

	public static boolean keepDimensionLoaded, allowDimensionRespawn, allowSynapseVariants, allowSynapseDigitalSea;
	public static int synapseVariantChance;
	private static int[] dimensionIDs = new int[5];
	public static int dimensionID, providerID, synapseID, synapseProviderID, collisionBiomeSize;
	private static int[] biomeIDs = new int[64];
	public static int idDecayingHills, idDecayingValley, idDecayingWasteland, idDecayingMountains, idPaintedForest, idPaintedPlains, idPaintedHills, idPaintedClearing;
	public static int idAshenMountains, idAshenHills, idAshenBadlands, idStarlitPrarie, idStarlitPlateaus, idStarlitCliffs, idStarlitLowlands, idTaintedSpikes;
	public static int idTaintedLowlands, idTaintedRises, idTaintedScarlands, idTaintedIsles, idHallowedHills, idHallowedForest, idHallowedPrarie, idHallowedCliffs;
	public static int idScorchedWastelands, idScorchedValley, idScorchedScarlands, idCorrodedSteppe, idCorrodedHeights, idCorrodedVeld, idCorrodedRunoff, idCorrodedFallout;
	public static int idFrozenTundra, idFrozenHills, idFrozenDepths, idCrystal, idDarkForest, idDarkForestHills, idDarkMarsh, idSynapseDead, idSynapseCorrupt;
	public static int idSynapse;
	private static int[] biomeWeights = new int[64];
	public static int decayingHillsW, decayingValleyW, decayingWastelandW, decayingMountainsW, paintedForestW, paintedPlainsW, paintedHillsW, paintedClearingW;
	public static int ashenMountainsW, ashenHillsW, ashenBadlandsW, starlitPrarieW, starlitPlateausW, starlitCliffsW, starlitLowlandsW, taintedSpikesW, taintedLowlandsW;
	public static int taintedRisesW, taintedScarlandsW, taintedIslesW, hallowedHillsW, hallowedForestW, hallowedPrarieW, hallowedCliffsW, scorchedWastelandsW, scorchedValleyW;
	public static int scorchedScarlandsW, corrodedSteppeW, corrodedHeightsW, corrodedVeldW, corrodedRunoffW, corrodedFalloutW, frozenTundraW, frozenHillsW, frozenDepthsW;
	public static int synapseW, crystalW, darkForestW, darkForestHillsW, darkMarshW, synapseDeadW, synapseCorruptW;

	private static boolean[] blanketDoom = new boolean[17];
	public static boolean allowDoomsdays, allowInfluenceDoomsday, allowCrisisDoomsday, allowOverflowDoomsday, allowWorldShaperDoomsday, allowCombinationDoomsday, allowNonDoomsdayAbilities;
	public static boolean shouldDoomLimitIncrease, allowConsumeRefill, allowDoomPainRecharge, allowNaturalRecharge, allowCrucialMoments, allowBacklash, allowCooldown, allowDoomKillRecharge;
	public static boolean allowCooldownDefuse, showDoomGui;
	private static int[] doomInts = new int[12];
	public static int maxDoomAmount, doomRechargeRate, doomConsumeRarity, cooldownDefuseRarity, consumeRefillAmount, defuseRefillAmount, backlashChance, crucialMomentChance;
	public static int doomConsumeAmount, maxDoomMinimum, doomRechargeAmount;
	public static boolean[] doomsdayAllow = new boolean[96];
	public static int[] doomsdayCooldowns = new int[96];
	public static int[] doomsdayCosts = new int[96];
	public static boolean[] nonDoomsdayAbilities = new boolean[64];
	public static int[] nonDoomsdayAbilityCosts = new int[64];

	private static boolean[] blanketEnchant = new boolean[2];
	public static boolean allowWeaponEnchants, allowArmorEnchants;
	private static boolean[] weaponEnchantConfigs = new boolean[14];
	public static boolean allowDecay, allowSlay, allowAbsolve, allowVampirism, allowLeech, allowConsume, allowDistract, allowMultiply, allowCombustion, allowRuneBreak;
	public static boolean allowReach, allowUnbreakable, allowRust, allowVeteran;
	private static boolean[] armorEnchantConfigs = new boolean[12];
	public static boolean allowDeathTouch, allowIgnition, allowToxicity, allowParalysis, allowElasticity, allowAgility, allowRuneWalker, allowLuminescence;
	private static int[] enchantIDs = new int[32];
	public static int idDecay, idSlay, idAbsolve, idVampirism, idLeech, idConsume, idDistract, idMultiply, idCombustion, idRuneBreak, idReach, idUnbreakable, idRust, idVeteran;
	public static int idDeathTouch, idIgnition, idToxicity, idParalysis, idElasticity, idAgility, idRuneWalker, idLuminescence;

	private static boolean[] blanketMob = new boolean[16];
	public static boolean allowNormalMobs, allowMiniBosses, allowBosses, allowBossOverworldSpawns, allowExtraBossLoot, allowVictoryBuffs, allowCorruptionDamage, allowMobTransformation;
	public static boolean allowDynamicHealthScaling, allowNonDimensionMobSpawns, allowGroupBuffs, allowEasyBosses, allowMobSounds;
	private static boolean[] mobConfigs = new boolean[48];
	public static boolean allowJabba, allowJanna, allowPlague, allowGragul, allowMinotaur, allowInkling, allowRagr, allowPumpkinhead, allowTragicNeko, allowTox, allowPox;
	public static boolean allowCryse, allowStarCryse, allowNorVox, allowStarVox, allowPirah, allowLavaPirah, allowStin, allowStinBaby, allowWisp, allowAbomination, allowErkel;
	public static boolean allowSirv, allowPsygote, allowLockbot, allowNanoSwarm, allowSnowGolem, allowHunter, allowHarvester, allowArchangel, allowIre;
	public static boolean allowFusea, allowRanmas, allowParasmite, allowAvris;
	private static int[] mobsSC = new int[48];
	public static int jabbaSC, jannaSC, plagueSC, gragulSC, minotaurSC, inklingSC, ragrSC, pumpkinheadSC, tragicNekoSC, toxSC, poxSC, cryseSC, starCryseSC, norVoxSC, starVoxSC;
	public static int pirahSC, lavaPirahSC, stinSC, stinBabySC, wispSC, abominationSC, erkelSC, sirvSC, psygoteSC, lockbotSC, nanoSwarmSC, snowGolemSC, hunterSC;
	public static int harvesterSC, archangelSC, ireSC, fuseaSC, ranmasSC, parasmiteSC, avrisSC;
	private static boolean[] miniBossConfigs = new boolean[16];
	public static boolean allowJarra, allowKragul, allowMagmox, allowMegaCryse, allowVoxStellarum, allowGreaterStin, allowStinKing, allowStinQueen, allowLocobot, allowAegar;
	public static boolean allowVolatileFusea;
	private static int[] miniBossSC = new int[16];
	public static int jarraSC, kragulSC, magmoxSC, megaCryseSC, voxStellarumSC, greaterStinSC, stinKingSC, stinQueenSC, locobotSC, aegarSC, volatileFuseaSC;
	private static boolean[] bossConfigs = new boolean[12];
	public static boolean allowApis, allowDeathReaper, allowKitsune, allowYeti, allowTimeController, allowPolaris, allowEnyvil, allowClaymation, allowOverlord;
	private static int[] bossSC = new int[12];
	public static int apisSC, deathReaperSC, kitsuneSC, yetiSC, timeControllerSC, polarisSC, enyvilSC, claymationSC, overlordSC;
	private static int[] mobInts = new int[12];
	public static int commonDropRate, rareDropRate, mobTransformationChance, bossDamageCap, groupBuffChance;
	private static double[][] mobStats = new double[48][];
	public static double[] jabbaStats, jannaStats, plagueStats, gragulStats, minotaurStats, inklingStats, ragrStats, pumpkinheadStats, tragicNekoStats, toxStats, poxStats, cryseStats;
	public static double[] starCryseStats, norVoxStats, starVoxStats, goldenPirahStats, pirahStats, stinStats, stinBabyStats, wispStats, abominationStats, erkelStats, sirvStats, psygoteStats;
	public static double[] lockbotStats, nanoSwarmStats, hunterStats, harvesterStats, seekerStats, archangelStats, ireStats, fuseaStats, ranmasStats, parasmiteStats, kurayamiStats, avrisStats;
	private static double[][] miniBossStats = new double[16][];
	public static double[] jarraStats, kragulStats, magmoxStats, megaCryseStats, voxStellarumStats, greaterStinStats, stinKingStats, stinQueenStats, locobotStats, aegarStats, volatileFuseaStats;
	private static double[][] bossStats = new double[12][];
	public static double[] apisStats, deathReaperStats, kitsuneStats, yetiStats, timeControllerStats, polarisStats, enyvilStats, claymationStats, overlordCoreStats, overlordCombatStats, overlordCocoonStats;

	private static boolean[] blanketPotion = new boolean[2];
	public static boolean allowPositivePotions, allowNegativePotions;
	private static boolean[] positivePotionConfigs = new boolean[20];
	public static boolean allowFlight, allowAquaSuperiority, allowImmunity, allowResurrection, allowHarmony, allowInvulnerability, allowClarity, allowConvergence, allowDivinity;
	private static boolean[] negativePotionConfigs = new boolean[20];
	public static boolean allowCorruption, allowDisorientation, allowStun, allowFear, allowMalnourish, allowCripple, allowSubmission, allowInhibit, allowLeadFoot, allowHacked, allowBurned;
	private static int[] potionIDs = new int[32];
	public static int idFlight, idAquaSuperiority, idImmunity, idResurrection, idHarmony, idInvulnerability, idClarity, idConvergence, idDivinity;
	public static int idCorruption, idDisorientation, idStun, idFear, idMalnourish, idCripple, idSubmission, idInhibit, idLeadFoot, idHacked, idBurned;

	private static boolean[] blanketVanillaChanges = new boolean[14];
	public static boolean allowVanillaMobBuffs, allowExtraMobEffects, allowAnimalRetribution, allowMobModdedArmorAndEnchants, allowRespawnPunishment, allowExtraExplosiveEffects;
	public static boolean allowMobBlindnessDebuff, allowExtraOverworldFlowers, allowOverworldSilverfishGen, allowNetherOreGen, allowOverworldOreGen, allowQuicksandGen, allowAnimalGolemCorruption;
	private static int[] vanillaInts = new int[7];
	public static int rubyOreRarity, sapphireOreRarity, mercuryOreRarity, tungstenOreRarity, quicksandGenRarity, drudgeGenRarity, silverfishGenRarity;

	private static boolean[] blanketWorldGen = new boolean[6];
	public static boolean allowVoidPitGen, allowLargeSpikeGen, allowDarkStoneVariantGen, allowStructureGen, allowNonBossStructureGen, allowBossStructureGen;
	private static int[] worldGenInts = new int[24];
	public static int voidPitRarity, largeSpikeRarity, starCrystalRarity, structureOverallRarity, apisTempleRarity, desertTowerRarity, deathCircleRarity, obsidianCavernRarity;
	public static int kitsuneDenRarity, celestialTempleRarity, timeAltarRarity, soulTombRarity, aerisRarity, empariahCaveRarity, claymationRuinRarity, darkHutRarity, spiderNestRarity;
	public static int memoryCacheRarity, lightSpireRarity, hackerNetRarity, cubeMazeRarity, outlookRarity;

	private static boolean[] miscConfigs = new boolean[16];
	public static boolean allowRandomWeaponLore, allowChallengeScrolls, allowMobStatueDrops, allowAnimatedGui, allowGeneratorItems, allowItemTimeAltering, allowWeaponModels;
	public static boolean allowPvP, allowFlightNotify, allowArmorModels, allowAnomalyAugment, allowNuke, allowDivinityColorChange;
	private static int[] miscInts = new int[16];
	public static int challengeScrollDropChance, mobStatueDropChance, guiTransparency, guiTexture, guiX, guiY;
	public static double[] modifierAmts = new double[32];
	public static boolean[] griefConfigs = new boolean[8];
	
	private static final int BLANK_ACHIEVE = 0, BLANK_AMULET = 1, BLANK_DIMENSION = 2, BLANK_DOOM = 3, BLANK_ENCHANT = 4, BLANK_MOB = 5, BLANK_POTION = 6, BLANK_VANILLA = 7, BLANK_WORLDGEN = 8;

	public static void initialize()
	{
		Configuration config = TragicMC.getConfig();
		config.load();

		Property prop;
		prop = config.get(catMaster, "isMobsOnly", false);
		prop.comment = "Is the mod in mob only mode?";
		prop.setLanguageKey("tragicmc.mobsOnly");
		mobsOnly = prop.getBoolean(mobsOnly);
		
		config.addCustomCategoryComment(catMaster, "These completely override any other mod options. More to come later.");

		int id = 0;
		byte mapping = 0;
		//Blanket options
		blanketConfigs[BLANK_ACHIEVE] = false; //(config.get(catBlanket, "allowAchievements", true).getBoolean(true)); //these aren't set up yet
		blanketConfigs[BLANK_AMULET] = (config.get(catBlanket, "allowAmulets", true).getBoolean(true));
		blanketConfigs[BLANK_DIMENSION] = (config.get(catBlanket, "allowDimensions", true).getBoolean(true));
		blanketConfigs[BLANK_DOOM] = (config.get(catBlanket, "allowDoom", true).getBoolean(true));
		blanketConfigs[BLANK_ENCHANT] = (config.get(catBlanket, "allowEnchantments", true).getBoolean(true));
		blanketConfigs[BLANK_MOB] = (config.get(catBlanket, "allowMobs", true).getBoolean(true));
		blanketConfigs[BLANK_POTION] = (config.get(catBlanket, "allowPotions", true).getBoolean(true));
		blanketConfigs[BLANK_VANILLA] = (config.get(catBlanket, "allowVanillaChanges", true).getBoolean(true));
		blanketConfigs[BLANK_WORLDGEN] = (config.get(catBlanket, "allowWorldgen", true).getBoolean(true));

		config.addCustomCategoryComment(catBlanket, "These toggle all options in their respective categories off.");

		//Amulets
		mapping = 0;
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowNormalAmuletEffects", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowCursedAmuletEffects", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowEpicAmuletEffects", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowAmuletLeveling", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowCraftingWithRawMaterials", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "requireUnlockAmuletSlots", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowToughKillRecharge", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "showAmuletStatusGui", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "allowAmuletModifiers", true).getBoolean(true));
		blanketAmulet[mapping++] = (config.get(catAmulet, "deathDropsAmulets", true).getBoolean(true));

		mapping = 0;
		amuletInts[mapping++] = MathHelper.clamp_int((config.get(catAmulet, "maxAmuletSlots", 3).getInt(3)), 1, 3);
		amuletInts[mapping++] = MathHelper.clamp_int(config.get(catAmulet, "overallAmuletRarity", 5).getInt(5), 3, 250);
		amuletInts[mapping++] = MathHelper.clamp_int(config.get(catAmulet, "amuletReleaseRarity", 5).getInt(5), 3, 250);
		amuletInts[mapping++] = MathHelper.clamp_int(config.get(catAmulet, "modifierChance", 54).getInt(54), 1, 100);
		amuletInts[mapping++] = MathHelper.clamp_int(config.get(catAmulet, "modifierChance2", 79).getInt(79), 1, 100);
		amuletInts[mapping++] = MathHelper.clamp_int(config.get(catAmulet, "modifierChance3", 89).getInt(89), 1, 100);

		mapping = 0;
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectPeace", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectYeti", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectClaymation", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectChicken", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectBlacksmith", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectCreeper", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectZombie", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectSkeleton", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectIce", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectSnowGolem", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectIronGolem", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectSpider", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectStin", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectSupernatural", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectFusea", true).getBoolean(true));
		normalAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectLuck", true).getBoolean(true));

		mapping = 0;
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectKitsune", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectMartyr", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectHornet", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectApis", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectSunken", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectEnderman", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectPolaris", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletLightning", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletConsumption", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletUndead", true).getBoolean(true));
		cursedAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEnderDragon", true).getBoolean(true));

		mapping = 0;
		epicAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectTime", true).getBoolean(true));
		epicAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectWither", true).getBoolean(true));
		epicAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectOverlord", true).getBoolean(true));
		epicAmuletConfigs[mapping++] = (config.get(catAmulet, "amuletEffectEnyvil", true).getBoolean(true));

		config.addCustomCategoryComment(catAmulet, "Disable specific amulet effects, does not remove the Amulets from the game.");

		//Dimension
		keepDimensionLoaded = (config.get(catDimension, "keepDimensionLoaded", false).getBoolean(false));
		dimensionIDs[0] = (config.get(catDimension, "dimensionID", DimensionManager.getNextFreeDimId()).getInt(DimensionManager.getNextFreeDimId()));
		dimensionIDs[1] = (config.get(catDimension, "providerID", dimensionIDs[0]).getInt(dimensionIDs[0]));
		dimensionIDs[2] = (config.get(catDimension, "synapseID", DimensionManager.getNextFreeDimId()).getInt(DimensionManager.getNextFreeDimId()));
		dimensionIDs[3] = (config.get(catDimension, "synapseProviderID", dimensionIDs[2]).getInt(dimensionIDs[2]));
		dimensionIDs[4] = MathHelper.clamp_int((config.get(catDimension, "collisionBiomeSize", 6).getInt(6)), 1, 20);
		allowDimensionRespawn = (config.get(catDimension, "allowCollisionRespawn", false).getBoolean(false));
		allowSynapseVariants = (config.get(catDimension, "allowSynapseMiniBiomes", true).getBoolean(true));
		synapseVariantChance = (config.get(catDimension, "synapseMiniBiomeChance", 128).getInt(128));
		allowSynapseDigitalSea = (config.get(catDimension, "allowSynapseDigitalSea", true).getBoolean(true));

		mapping = 0;
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDecayingHillsWeight", 20).getInt(20));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDecayingHillsID", getOpenIDForBiome(90)).getInt(getOpenIDForBiome(90)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDecayingValleyWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDecayingValleyID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDecayingWastelandWeight", 20).getInt(20));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDecayingWastelandID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDecayingMountainsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDecayingMountainsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomePaintedForestWeight", 30).getInt(30));
		biomeIDs[mapping++] = (config.get(catDimension, "biomePaintedForestID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomePaintedPlainsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomePaintedPlainsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomePaintedHillsWeight", 20).getInt(20));
		biomeIDs[mapping++] = (config.get(catDimension, "biomePaintedHillsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomePaintedClearingWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomePaintedClearingID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeAshenMountainsWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeAshenMountainsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeAshenHillsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeAshenHillsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeAshenBadlandsWeight", 20).getInt(20));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeAshenBadlandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeStarlitPrarieWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeStarlitPrarieID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeStarlitPlateausWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeStarlitPlateausID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeStarlitCliffsWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeStarlitCliffsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeStarlitLowlandsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeStarlitLowlandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeTaintedSpikesWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeTaintedSpikesID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeTaintedLowlandsWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeTaintedLowlandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeTaintedRisesWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeTaintedRisesID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeTaintedScarlandsWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeTaintedScarlandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeTaintedIslesWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeTaintedIslesID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeSynapseWeight", 0).getInt(0));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeSynapseID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeHallowedHillsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeHallowedHillsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeHallowedForestWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeHallowedForestID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeHallowedPrarieWeight", 20).getInt(20));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeHallowedPrarieID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeHallowedCliffsWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeHallowedCliffsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeScorchedWastelandsWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeScorchedWastelandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeScorchedValleyWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeScorchedValleyID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeScorchedScarlandsWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeScorchedScarlandsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCorrodedSteppeWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCorrodedSteppeID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCorrodedHeightsWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCorrodedHeightsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCorrodedVeldWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCorrodedVeldID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCorrodedRunoffWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCorrodedRunoffID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCorrodedFalloutWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCorrodedFalloutID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeFrozenTundraWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeFrozenTundraID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeFrozenHillsWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeFrozenHillsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeFrozenDepthsWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeFrozenDepthsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeCrystalWeight", 5).getInt(5));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeCrystalID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDarkForestWeight", 25).getInt(25));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDarkForestID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDarkForestHillsWeight", 15).getInt(15));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDarkForestHillsID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeDarkMarshWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeDarkMarshID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeSynapseDeadSectorWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeSynapseDeadSectorID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));
		biomeWeights[mapping] = clampPositive(config.get(catDimension, "biomeSynapseCorruptChunkWeight", 10).getInt(10));
		biomeIDs[mapping++] = (config.get(catDimension, "biomeSynapseCorruptChunkID", getOpenIDForBiome(biomeIDs[mapping - 2] + 1)).getInt(getOpenIDForBiome(biomeIDs[mapping - 2] + 1)));

		config.addCustomCategoryComment(catDimension, "Set the various biome IDs in the Dimension, including the Dimension's own ID, also set if the Dimension should stay loaded.");

		mapping = 0;
		blanketDoom[mapping++] = (config.get(catDoom, "allowDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowInfluenceDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowCrisisDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowOverflowDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowWorldShaperDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowCombinationDoomsdays", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowNonDoomsdayAbilities", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "requireDoomConsumeUse", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowDoomConsumeRefill", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowDoomPainRecharge", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowDoomNaturalRecharge", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowCrucialMoments", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowBacklash", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowCooldown", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowCooldownDefuse", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "showDoomGui", true).getBoolean(true));
		blanketDoom[mapping++] = (config.get(catDoom, "allowDoomKillRecharge", false).getBoolean(false));

		mapping = 0;
		doomInts[mapping++] = clampPositive(config.get(catDoom, "maxDoomAmount", 500).getInt(500));
		doomInts[mapping++] = MathHelper.clamp_int(config.get(catDoom, "doomRechargeRate", 1).getInt(1), 0, 20);
		doomInts[mapping++] = clampPositive(config.get(catDoom, "doomConsumeRarity", 3).getInt(3));
		doomInts[mapping++] = clampPositive(config.get(catDoom, "cooldownDefuseRarity", 5).getInt(5));
		doomInts[mapping++] = clampPositive(config.get(catDoom, "doomConsumeRefillAmount", 50).getInt(50));
		doomInts[mapping++] = clampPositive(config.get(catDoom, "cooldownDefuseRefillAmount", 30).getInt(30));
		doomInts[mapping++] = MathHelper.clamp_int(config.get(catDoom, "backlashChance", 5).getInt(5), 1, 100);
		doomInts[mapping++] = MathHelper.clamp_int(config.get(catDoom, "crucialMomentChance", 5).getInt(5), 1, 100);
		doomInts[mapping++] = clampPositive(config.get(catDoom, "doomConsumeAmount", 100).getInt(100));
		doomInts[mapping++] = clampPositive(config.get(catDoom, "maxDoomMinimumAmount", 100).getInt(100));
		doomInts[mapping++] = clampPositive(config.get(catDoom, "doomRechargeAmount", 1).getInt(1));

		mapping = 1;
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDecayAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayHuntersInstinctAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayToxicityAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayBerserkerAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPiercingLightAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayNatureDrainAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPoisonBreakAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySnipeAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayRapidFireAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPulseAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayLightShoveAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFearAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayHarmonizerAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayRavageAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayTormentAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayBeastlyImpulsesAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySuicidalTendenciesAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayReaperLaughAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayRealityAlterAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySkullCrusherAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMinerSkillsAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFreezeAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMoonlightSonataAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFlightOfTheValkyriesAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayTitanfallAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayBloodlustAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPermafrostAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPurgeAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayLightningRushAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMarionetteAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMindcrackAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayGrowthSpurtAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayBlizzardAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayAsphyxiateAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFireRainAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDragonsRoarAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFirestormAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayShotgunAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayGuardianAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayHardenAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySharpenAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayFlashAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySepticsAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayKurayamiAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayLifeShareAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDeathMarkAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayParadigmShiftAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayAdrenalineAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayEscapeAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayGiftOfTheGodsAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayGamblerAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySoulstealerAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayParasiteAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySymbiosisAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayTimeCollapseAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMagnetizerAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayAmbienceAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDimentiaAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDeleteAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayLaserCutterAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayRadiantLightAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayDangerZoneAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdaySupportAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayPurifyAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayRecallAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayShuffleAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayBlinkAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayEvacuateAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayMedicAllow", true).getBoolean(true));
		doomsdayAllow[mapping++] = (config.get(catDoom, "doomsdayResurgenceAllow", true).getBoolean(true));

		mapping = 1;
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDecayCooldown", 20).getInt(20));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayHuntersInstinctCooldown", 25).getInt(25));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayToxicityCooldown", 15).getInt(15));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayBerserkerCooldown", 15).getInt(15));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPiercingLightCooldown", 30).getInt(30));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayNatureDrainCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPoisonBreakCooldown", 10).getInt(10));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySnipeCooldown", 55).getInt(55));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayRapidFireCooldown", 3).getInt(3));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPulseCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayLightShoveCooldown", 1).getInt(1));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFearCooldown", 20).getInt(20));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayHarmonizerCooldown", 30).getInt(30));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayRavageCooldown", 35).getInt(35));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayTormentCooldown", 20).getInt(20));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayBeastlyImpulsesCooldown", 50).getInt(50));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySuicidalTendenciesCooldown", 4).getInt(4));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayReaperLaughCooldown", 3).getInt(3));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayRealityAlterCooldown", 12).getInt(12));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySkullCrusherCooldown", 15).getInt(15));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMinerSkillsCooldown", 20).getInt(20));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFreezeCooldown", 30).getInt(30));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMoonlightSonataCooldown", 60).getInt(60));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFlightOfTheValkyriesCooldown", 10).getInt(10));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayTitanfallCooldown", 10).getInt(10));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayBloodlustCooldown", 30).getInt(30));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPermafrostCooldown", 5).getInt(5));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPurgeCooldown", 4).getInt(4));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayLightningRushCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMarionetteCooldown", 3).getInt(3));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMindcrackCooldown", 60).getInt(60));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayGrowthSpurtCooldown", 10).getInt(10));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayBlizzardCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayAsphyxiateCooldown", 3).getInt(3));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFireRainCooldown", 5).getInt(5));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDragonsRoarCooldown", 15).getInt(15));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFirestormCooldown", 8).getInt(8));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayShotgunCooldown", 5).getInt(5));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayGuardianCooldown", 50).getInt(50));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayHardenCooldown", 4).getInt(4));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySharpenCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayFlashCooldown", 5).getInt(5));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySepticsCooldown", 6).getInt(6));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayKurayamiCooldown", 80).getInt(80));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayLifeShareCooldown", 25).getInt(25));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDeathMarkCooldown", 10).getInt(10));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayParadigmShiftCooldown", 0).getInt(0));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayAdrenalineCooldown", 21).getInt(21));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayEscapeCooldown", 38).getInt(38));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayGiftOfTheGodsCooldown", 100).getInt(100));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayGamblerCooldown", 20).getInt(20));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySoulstealerCooldown", 8).getInt(8));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayParasiteCooldown", 12).getInt(12));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySymbiosisCooldown", 14).getInt(14));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayTimeCollapseCooldown", 2).getInt(2));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMagnetizerCooldown", 65).getInt(65));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayAmbienceCooldown", 1).getInt(1));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDimentiaCooldown", 77).getInt(77));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDeleteCooldown", 125).getInt(125));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayLaserCutterCooldown", 15).getInt(15));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayRadiantLightCooldown", 65).getInt(65));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayDangerZoneCooldown", 24).getInt(24));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdaySupportCooldown", 16).getInt(16));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayPurifyCooldown", 42).getInt(42));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayRecallCooldown", 22).getInt(22));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayShuffleCooldown", 8).getInt(8));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayBlinkCooldown", 1).getInt(1));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayEvacuateCooldown", 77).getInt(77));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayMedicCooldown", 9).getInt(9));
		doomsdayCooldowns[mapping++] = clampPositive(config.get(catDoom, "doomsdayResurgenceCooldown", 55).getInt(55));

		mapping = 1;
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDecayCost", 40).getInt(40));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayHuntersInstinctCost", 60).getInt(60));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayToxicityCost", 40).getInt(40));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayBerserkerCost", 50).getInt(50));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPiercingLightCost", 60).getInt(60));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayNatureDrainCost", 12).getInt(12));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPoisonBreakCost", 30).getInt(30));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySnipeCost", 90).getInt(90));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayRapidFireCost", 8).getInt(8));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPulseCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayLightShoveCost", 3).getInt(3));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFearCost", 30).getInt(30));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayHarmonizerCost", 40).getInt(40));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayRavageCost", 55).getInt(55));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayTormentCost", 45).getInt(45));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayBeastlyImpulsesCost", 60).getInt(60));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySuicidalTendenciesCost", 12).getInt(12));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayReaperLaughCost", 16).getInt(16));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayRealityAlterCost", 40).getInt(40));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySkullCrusherCost", 50).getInt(50));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMinerSkillsCost", 30).getInt(30));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFreezeCost", 30).getInt(30));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMoonlightSonataCost", 1).getInt(1));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFlightOfTheValkyriesCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayTitanfallCost", 5).getInt(5));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayBloodlustCost", 80).getInt(80));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPermafrostCost", 6).getInt(6));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPurgeCost", 5).getInt(5));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayLightningRushCost", 8).getInt(8));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMarionetteCost", 3).getInt(3));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMindcrackCost", 45).getInt(45));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayGrowthSpurtCost", 50).getInt(50));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayBlizzardCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayAsphyxiateCost", 3).getInt(3));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFireRainCost", 8).getInt(8));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDragonsRoarCost", 25).getInt(25));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFirestormCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayShotgunCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayGuardianCost", 75).getInt(75));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayHardenCost", 60).getInt(60));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySharpenCost", 75).getInt(75));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayFlashCost", 10).getInt(10));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySepticsCost", 8).getInt(8));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayKurayamiCost", 115).getInt(115));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayLifeShareCost", 65).getInt(65));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDeathMarkCost", 12).getInt(12));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayParadigmShiftCost", 50).getInt(50));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayAdrenalineCost", 33).getInt(33));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayEscapeCost", 12).getInt(12));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayGiftOfTheGodsCost", 115).getInt(115));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayGamblerCost", 15).getInt(15));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySoulstealerCost", 12).getInt(12));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayParasiteCost", 16).getInt(16));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySymbiosisCost", 18).getInt(18));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayTimeCollapseCost", 3).getInt(3));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMagnetizerCost", 95).getInt(95));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayAmbienceCost", 1).getInt(1));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDimentiaCost", 99).getInt(99));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDeleteCost", 135).getInt(135));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayLaserCutterCost", 16).getInt(16));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayRadiantLightCost", 62).getInt(62));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayDangerZoneCost", 22).getInt(22));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdaySupportCost", 60).getInt(60));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayPurifyCost", 42).getInt(42));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayRecallCost", 82).getInt(82));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayShuffleCost", 18).getInt(18));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayBlinkCost", 15).getInt(15));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayEvacuateCost", 56).getInt(56));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayMedicCost", 9).getInt(9));
		doomsdayCosts[mapping++] = clampPositive(config.get(catDoom, "doomsdayResurgenceCost", 135).getInt(135));

		mapping = 0;
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "beastlyClaws-Combo", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "blindingLight-SolarBombs", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "blindingLight-Burn", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "blindingLight-ProjectileDeflect", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "butcher-CriticalKnockback", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "butcher-KnockbackResistanceBuff", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "butcher-WeaknessDebuff", true).getBoolean(true)); //6
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "celestialAegis-DamageReduction", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "celestialLongbow-Teleport", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "dragonFang-Burn", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "dragonFang-LargeFireball", true).getBoolean(true)); //10
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "dragonFang-Extinguish", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "frozenLightning-SlowdownHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "frozenLightning-LightningStrike", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "frozenLightning-Icicles", true).getBoolean(true)); //14
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "gravitySpike-Launch", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "guiltyThorn-PoisonStun", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "harmonyBell-HarmonyHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "harmonyBell-Healing", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "mourningStar-SelfDestruct", true).getBoolean(true)); //19
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "mourningStar-SightExplosion", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "paranoia-FearSubmissionHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "paranoia-DarkEnergySpray", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "paranoia-SingleDarkEnergy", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "pitchBlack-Throw", true).getBoolean(true)); //24
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "reaperScythe-SmallPumpkinbomb", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "reaperScythe-LargePumpkinbomb", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "splinter-RandomDirectionHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "splinter-AOERandomDirectionHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "thardus-SlownessHit", true).getBoolean(true)); //29
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "thardus-Icicles", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "titan-LightningStrikeHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "titan-LightningChain", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "titan-LightningAbsorb", true).getBoolean(true)); //33
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "witheringAxe-WitherHit", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "witheringAxe-WitherSkull", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "witheringAxe-BlueWitherSkull", true).getBoolean(true));
		nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "dragonFang-Flamethrower", true).getBoolean(true)); //37
		//nonDoomsdayAbilities[mapping++] = (config.get(catDoom, "", true).getBoolean(true));

		mapping = 0;
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "beastlyClaws-ComboCost", 0).getInt(0));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "blindingLight-SolarBombsCost", 15).getInt(15));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "blindingLight-BurnCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "blindingLight-ProjectilDeflectCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "butcher-CriticalKnockbackCost", 1).getInt(1));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "butcher-KnockbackResistanceBuffCost", 0).getInt(0));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "butcher-WeaknessDebuffCost", 0).getInt(0));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "celestialAegis-DamageReductionCost", 0).getInt(0));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "celestialLongbow-TeleportCost", 0).getInt(0));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "dragonFang-BurnCost", 1).getInt(1));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "dragonFang-LargeFireballCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "dragonFang-ExtinguishCost", 1).getInt(1));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "frozenLightning-SlowdownHitCost", 3).getInt(3));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "frozenLightning-LightningStrikeCost", 20).getInt(20));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "frozenLightning-IciclesCost", 3).getInt(3));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "gravitySpike-LaunchCost", 7).getInt(7));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "guiltyThorn-PoisonStunCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "harmonyBell-HarmonyHitCost", 3).getInt(3));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "harmonyBell-HealingCost", 1).getInt(1));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "mourningStar-SelfDestructCost", 25).getInt(25));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "mourningStar-SightExplosionCost", 30).getInt(30));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "paranoia-FearSubmissionHitCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "paranoia-DarkEnergySprayCost", 15).getInt(15));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "paranoia-SingleDarkEnergyCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "pitchBlack-ThrowCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "reaperScythe-SmallPumpkinbombCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "reaperScythe-LargePumpkinbombCost", 15).getInt(15));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "splinter-RandomDirectionHitCost", 3).getInt(3));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "splinter-AOERandomDirectionHitCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "thardus-SlownessHitCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "thardus-IciclesCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "titan-LightningStrikeHitCost", 10).getInt(10));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "titan-LightningChainCost", 20).getInt(20));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "titan-LightningAbsorbCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "witheringAxe-WitherHitCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "witheringAxe-WitherSkullCost", 5).getInt(5));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "witheringAxe-BlueWitherSkullCost", 15).getInt(15));
		nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "dragonFang-FlamethrowerCost", 3).getInt(3));
		//nonDoomsdayAbilityCosts[mapping++] = clampPositive(config.get(catDoom, "", 0).getInt(0));

		config.addCustomCategoryComment(catDoom, "Set various aspects of Doom and Doomsdays, refill amounts scale to total doom amount. Set each Doomsday and weapon ability's cost and allowances.");

		blanketEnchant[0] = (config.get(catEnchant, "allowWeaponEnchantments", true).getBoolean(true));
		blanketEnchant[1] = (config.get(catEnchant, "allowArmorEnchantments", true).getBoolean(true));

		mapping = 0;
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "decayAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "slayAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "absolveAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "vampirismAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "leechAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "consumeAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "distractAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "multiplyAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "combustionAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "runeBreakAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "reachAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "unbreakableAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "rustAllow", true).getBoolean(true));
		weaponEnchantConfigs[mapping++] = (config.get(catEnchant, "veteranAllow", true).getBoolean(true));

		mapping = 0;
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "deathTouchAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "ignitionAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "toxicityAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "paralysisAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "elasticityAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "agilityAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "runeWalkerAllow", true).getBoolean(true));
		armorEnchantConfigs[mapping++] = (config.get(catEnchant, "luminescenceAllow", true).getBoolean(true));
		
		mapping = 0;
		id = getOpenIDForEnchant(64);
		enchantIDs[mapping++] = (config.get(catEnchant, "decayID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "slayID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "absolveID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "vampirismID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "leechID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "consumeID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "distractID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "multiplyID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "combustionID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "runeBreakID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "reachID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "unbreakableID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "rustID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "veteranID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "deathTouchID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "ignitionID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "toxicityID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "paralysisID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "elasticityID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "agilityID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "runeWalkerID", id).getInt(id));
		id = getOpenIDForEnchant(enchantIDs[mapping - 1] + 1);
		enchantIDs[mapping++] = (config.get(catEnchant, "luminescenceID", id).getInt(id));

		config.addCustomCategoryComment(catEnchant, "Set whether specific Enchantments are allowed, also can choose whether an enchantment type is allowed, set their IDs as well.");

		blanketMob[0] = (config.get(catMobs, "allowNormalMobs", true).getBoolean(true));
		blanketMob[1] = (config.get(catMobs, "allowMiniBosses", true).getBoolean(true));
		blanketMob[2] = (config.get(catMobs, "allowBosses", true).getBoolean(true));
		blanketMob[3] = (config.get(catMobs, "allowOverworldBossSpawns", false).getBoolean(false));
		blanketMob[4] = (config.get(catMobs, "allowExtraBossLoot", true).getBoolean(true));
		blanketMob[5] = (config.get(catMobs, "allowVictoryBuffs", true).getBoolean(true));
		blanketMob[6] = (config.get(catMobs, "allowCorruptionDamage", true).getBoolean(true));
		blanketMob[7] = (config.get(catMobs, "allowMobTransformation", true).getBoolean(true));
		blanketMob[8] = (config.get(catMobs, "allowMobHealthScaling", true).getBoolean(true));
		blanketMob[9] = (config.get(catMobs, "allowMobVanillaDimensionSpawns", true).getBoolean(true));
		blanketMob[10] = (config.get(catMobs, "allowGroupBuffs", true).getBoolean(true));
		blanketMob[11] = (config.get(catMobs, "allowBossesOnEasy", false).getBoolean(false));
		blanketMob[12] = (config.get(catMobs, "allowCustomMobSounds", true).getBoolean(true));

		mobInts[0] = MathHelper.clamp_int(config.get(catMobs, "overallMobCommonDropChance", 25).getInt(25), 1, 200);
		mobInts[1] = MathHelper.clamp_int(config.get(catMobs, "overallMobRareDropChance", 5).getInt(5), 1, 100);
		mobInts[2] = MathHelper.clamp_int(config.get(catMobs, "mobTransformationChance", 3).getInt(3), 1, 100);
		mobInts[3] = clampPositive(config.get(catMobs, "bossDamageCap", 25).getInt(25));
		mobInts[4] = MathHelper.clamp_int(config.get(catMobs, "groupBuffChance", 15).getInt(15), 1, 200);

		mapping = 0;
		mobsSC[mapping] = clampPositive(config.get(catMobs, "jabbaSpawnChance", 75).getInt(75));
		mobConfigs[mapping++] = (config.get(catMobs, "jabbaAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "jannaSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "jannaAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "plagueSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "plagueAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "gragulSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "gragulAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "minotaurSpawnChance", 75).getInt(75));
		mobConfigs[mapping++] = (config.get(catMobs, "minotaurAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "inklingSpawnChance", 75).getInt(75));
		mobConfigs[mapping++] = (config.get(catMobs, "inklingAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "ragrSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "ragrAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "pumpkinheadSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "pumpkinheadAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "tragicNekoSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "tragicNekoAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "toxSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "toxAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "poxSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "poxAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "cryseSpawnChance", 75).getInt(75));
		mobConfigs[mapping++] = (config.get(catMobs, "cryseAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "starCryseSpawnChance", 75).getInt(75));
		mobConfigs[mapping++] = (config.get(catMobs, "starCryseAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "norVoxSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "norVoxAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "starVoxSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "starVoxAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "pirahSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "pirahAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "lavaPirahSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "lavaPirahAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "stinSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "stinAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "stinBabySpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "stinBabyAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "greaterStinSpawnChance", 5).getInt(5));
		mobConfigs[mapping++] = (config.get(catMobs, "greaterStinAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "wispSpawnChance", 15).getInt(15));
		mobConfigs[mapping++] = (config.get(catMobs, "wispAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "abominationSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "abominationAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "erkelSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "erkelAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "sirvSpawnChance", 50).getInt(50));
		mobConfigs[mapping++] = (config.get(catMobs, "sirvAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "psygoteSpawnChance", 5).getInt(5));
		mobConfigs[mapping++] = (config.get(catMobs, "psygoteAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "lockbotSpawnChance", 5).getInt(5));
		mobConfigs[mapping++] = (config.get(catMobs, "lockbotAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "nanoSwarmSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "nanoSwarmAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "snowGolemSpawnChance", 20).getInt(20));
		mobConfigs[mapping++] = (config.get(catMobs, "snowGolemAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "hunterChance", 15).getInt(15));
		mobConfigs[mapping++] = (config.get(catMobs, "hunterAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "harvesterSpawnChance", 10).getInt(10));
		mobConfigs[mapping++] = (config.get(catMobs, "harveseterAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "archangelSpawnChance", 5).getInt(5));
		mobConfigs[mapping++] = (config.get(catMobs, "archangelAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "ireSpawnChance", 45).getInt(45));
		mobConfigs[mapping++] = (config.get(catMobs, "ireAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "fuseaSpawnChance", 45).getInt(45));
		mobConfigs[mapping++] = (config.get(catMobs, "fuseaAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "ranmasSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "ranmasAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "parasmiteSpawnChance", 25).getInt(25));
		mobConfigs[mapping++] = (config.get(catMobs, "parasmiteAllow", true).getBoolean(true));
		mobsSC[mapping] = clampPositive(config.get(catMobs, "avrisSpawnChance", 5).getInt(5));
		mobConfigs[mapping++] = (config.get(catMobs, "avrisAllow", true).getBoolean(true));

		mapping = 0;
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "jarraSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "jarraAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "kragulSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "kragulAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "magmoxSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "magmoxAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "megaCryseChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "megaCryseAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "voxStellarumSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "voxStellarumAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "stinKingSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "stinKingAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "stinQueenSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "stinQueenAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "aegarSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "aegarAllow", true).getBoolean(true));
		miniBossSC[mapping] = clampPositive(config.get(catMobs, "volatileFuseaSpawnChance", 5).getInt(5));
		miniBossConfigs[mapping++] = (config.get(catMobs, "volatileFuseaAllow", true).getBoolean(true));

		mapping = 0;
		bossSC[mapping] = clampPositive(config.get(catMobs, "apisSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "apisAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "deathReaperSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "deathReaperAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "kitsuneSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "kitsuneAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "polarisSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "polarisAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "yetiSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "yetiAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "timeControllerSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "timeControllerAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "enyvilSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "enyvilAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "claymationSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "claymationAllow", true).getBoolean(true));
		bossSC[mapping] = clampPositive(config.get(catMobs, "overlordSpawnChance", 5).getInt(5));
		bossConfigs[mapping++] = (config.get(catMobs, "overlordAllow", true).getBoolean(true));

		mapping = 0;
		mobStats[mapping++] = (config.get(catMobs, "jabbaStats", new double[] {40.0, 0.275, 5.5, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "jannaStats", new double[] {20.0, 0.325, 4.5, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "plagueStats", new double[] {4.0, 0.235, 1.0, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "gragulStats", new double[] {5.0, 0.350, 5.0, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "minotaurStats", new double[] {32.0, 0.350, 7.0, 32.0, 0.5, 6}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "inklingStats", new double[] {16.0, 0.230, 1.0, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "ragrStats", new double[] {65.0, 0.380, 7.0, 32.0, 1.0, 10}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "pumpkinheadStats", new double[] {60.0, 0.275, 6.0, 32.0, 0.0, 18}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "tragicNekoStats", new double[] {80.0, 0.335, 6.0, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "toxStats", new double[] {40.0, 0.050, 8.0, 64.0, 1.0, 16}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "poxStats", new double[] {30.0, 0.050, 4.0, 64.0, 0.7, 10}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "cryseStats", new double[] {35.0, 0.285, 4.0, 48.0, 0.0, 4}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "starCryseStats", new double[] {55.0, 0.315, 4.0, 48.0, 0.0, 4}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "norVoxStats", new double[] {30.0, 0.390, 4.0, 32.0, 0.25, 8}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "starVoxStats", new double[] {40.0, 0.390, 4.0, 32.0, 0.25, 16}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "goldenPirahStats", new double[] {25.0, 0.450, 7.5, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "pirahStats", new double[] {10.0, 0.450, 3.0, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "stinStats", new double[] {40.0, 0.246, 10.0, 32.0, 0.5, 6}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "stinBabyStats", new double[] {16.0, 0.346, 6.0, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "greaterStinStats", new double[] {80.0, 0.276, 14.0, 24.0, 1.0, 12}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "wispStats", new double[] {8.0, 0.476, 1.0, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "abominationStats", new double[] {45.0, 0.276, 7.0, 32.0, 0.5, 4}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "erkelStats", new double[] {16.0, 0.476, 1.0, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "sirvStats", new double[] {8.0, 0.375, 14.0, 64.0, 0.5, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "psygoteStats", new double[] {52.0, 0.290, 8.0, 32.0, 0.65, 10}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "lockbotStats", new double[] {22.0, 0.0, 1.0, 8.0, 100.0, 8}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "nanoSwarmStats", new double[] {6.0, 0.335, 2.0, 64.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "hunterStats", new double[] {16.0, 0.236, 4.0, 32.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "harvesterStats", new double[] {56.0, 0.145, 0.0, 16.0, 100.0, 20}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "seekerStats", new double[] {30.0, 0.0, 1.0, 48.0, 100.0, 24}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "archangelStats", new double[] {45.0, 0.0, 1.0, 32.0, 0.5, 12}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "ireStats", new double[] {25.0, 0.0, 1.0, 16.0, 100.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "fuseaStats", new double[] {10.0, 0.0, 0.0, 16.0, 100.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "ranmasStats", new double[] {50.0, 0.0, 1.0, 32.0, 100.0, 24}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "parasmiteStats", new double[] {10.0, 0.0, 1.0, 16.0, 0.0, 0}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "kurayamiStats", new double[] {120.0, 0.420, 12.0, 64.0, 0.4, 10}).getDoubleList());
		mobStats[mapping++] = (config.get(catMobs, "avrisStats", new double[] {75.0, 0.312, 2.0, 64.0, 0.6, 16}).getDoubleList());

		for (double[] stat : mobStats) 
		{
			if (stat != null && !verify(stat, 6)) throw new IllegalArgumentException("Not enough or invalid values for a certain mob's stats [ " + stat + "].");
		}

		mapping = 0;
		miniBossStats[mapping++] = (config.get(catMobs, "jarraStats", new double[] {70.0, 0.360, 6.5, 64.0, 0.0, 0}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "kragulStats", new double[] {8.0, 0.380, 5.0, 5.0, 32.0, 0}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "magmoxStats", new double[] {75.0, 0.050, 15.0, 64.0, 1.0, 20}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "megaCryseStats", new double[] {50.0, 0.310, 6.0, 48.0, 1.0, 18}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "voxStellarumStats", new double[] {150.0, 0.460, 4.0, 64.0, 0.2, 16}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "stinKingStats", new double[] {100.0, 0.226, 20.0, 32.0, 2.0, 20}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "stinQueenStats", new double[] {160.0, 0.186, 12.0, 24, 2.0, 10}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "aegarStats", new double[] {150.0, 0.185, 26.0, 32.0, 2.5, 24}).getDoubleList());
		miniBossStats[mapping++] = (config.get(catMobs, "volatileFuseaStats", new double[] {18.0, 0.0, 0.0, 32.0, 100.0, 0}).getDoubleList());

		for (double[] stat : miniBossStats) 
		{
			if (stat != null && !verify(stat, 6)) throw new IllegalArgumentException("Not enough or invalid values for a certain miniBoss's stats [ " + stat + "].");
		}

		mapping = 0;
		bossStats[mapping++] = (config.get(catMobs, "apisStats", new double[] {160.0, 0.375, 12.0, 32.0, 1.0, 16}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "deathReaperStats", new double[] {220.0, 0.350, 16.0, 32.0, 1.0, 20}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "kitsuneStats", new double[] {80.0, 0.420, 6.0, 64.0, 0.0, 0}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "polarisStats", new double[] {120.0, 0.440, 5.0, 64.0, 0.0, 14}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "yetiStats", new double[] {140.0, 0.326, 16.0, 48.0, 2.0, 22}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "timeControllerStats", new double[] {350.0, 0.366, 6.0, 64.0, 0.5, 18}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "enyvilStats", new double[] {450.0, 0.276, 24.0, 48.0, 1.0, 4}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "claymationStats", new double[] {150.0, 0.320, 12.0, 32.0, 1.0, 18}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "overlordCoreStats", new double[] {1000.0, 0.326, 24.0, 64.0, 4.5, 0}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "overlordCombatStats", new double[] {500.0, 0.326, 24.0, 64.0, 4.5, 0}).getDoubleList());
		bossStats[mapping++] = (config.get(catMobs, "overlordCocoonStats", new double[] {500.0, 0.226, 24.0, 64.0, 4.5, 0}).getDoubleList());

		for (double[] stat : bossStats) 
		{
			if (stat != null && !verify(stat, 6)) throw new IllegalArgumentException("Not enough or invalid values for a certain boss's stats [ " + stat + "].");
		}

		config.addCustomCategoryComment(catMobs, "Set whether specific Mobs are allowed or disable certain groups like Mini-Bosses or Bosses. Stats are: Health, Movement Speed, Attack Damage, Follow Range, Knockback Resistance, Armor Value.");

		blanketPotion[0] = (config.get(catPotion, "allowPositivePotionEffects", true).getBoolean(true));
		blanketPotion[1] = (config.get(catPotion, "allowNegativePotionEffects", true).getBoolean(true));

		mapping = 0;
		positivePotionConfigs[mapping++] = (config.get(catPotion, "flightAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "aquaSuperiorityAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "immunityAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "resurrectionAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "harmonyAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "invulnerabilityAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "clarityAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "convergenceAllow", true).getBoolean(true));
		positivePotionConfigs[mapping++] = (config.get(catPotion, "divinityAllow", true).getBoolean(true));

		mapping = 0;
		negativePotionConfigs[mapping++] = (config.get(catPotion, "corruptionAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "disorientationAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "stunAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "fearAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "malnourishAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "crippleAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "submissionAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "inhibitAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "leadFootAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "hackedAllow", true).getBoolean(true));
		negativePotionConfigs[mapping++] = (config.get(catPotion, "burnedAllow", true).getBoolean(true));

		mapping = 0; //because potion ids are not reserved at all they need to be saved locally so that they don't override each other
		potionIDs[mapping++] = (config.get(catPotion, "flightID", getOpenIDForPotion(32)).getInt(getOpenIDForPotion(32))); 
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "aquaSuperiorityID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "immunityID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "resurrectionID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "harmonyID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "invulnerabilityID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "clarityID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "convergenceID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "divinityID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "corruptionID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "disorientationID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "stunID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "fearID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "malnourishID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "crippleID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "submissionID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "inhibitID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "leadFootID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "hackedID", id).getInt(id));
		id = getOpenIDForPotion(potionIDs[mapping - 1] + 1);
		potionIDs[mapping++] = (config.get(catPotion, "burnedID", id).getInt(id));

		config.addCustomCategoryComment(catPotion, "Set whether specific Potion Effects are allowed, or disable all good or all bad effects, also set their IDs");

		mapping = 0;
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowVanillaMobBuffs", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowExtraMobEffects", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowAnimalRetribution", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowMobModdedArmorAndEnchantments", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowRespawnPunishment", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowExtraExplosiveEffects", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowModdedOverworldFlowerGen", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowOverworldSilverfishOregen", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowNetherOreGen", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowOverworldOreGen", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowQuicksandAndDrudgeGen", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowAnimalAndGolemCorruption", true).getBoolean(true));
		blanketVanillaChanges[mapping++] = (config.get(catVanilla, "allowMobBlindnessDebuff", true).getBoolean(true));

		mapping = 0;
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "rubyOreGenRate", 10).getInt(10), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "sapphireOreGenRate", 10).getInt(10), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "mercuryOreGenRate", 20).getInt(20), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "tungstenOreGenRate", 10).getInt(10), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "quicksandGenRate", 5).getInt(20), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "netherDrudgeGenRate", 10).getInt(20), 1, 25);
		vanillaInts[mapping++] = MathHelper.clamp_int(config.get(catVanilla, "silverfishGenRate", 12).getInt(12), 1, 25);

		config.addCustomCategoryComment(catVanilla, "These are all of the things that are changed in Vanilla by this mod, OreGen only affects Overworld and Nether types of the ores");

		mapping = 0;
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowVoidPitGen", true).getBoolean(true));
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowLargeSpikeGen", true).getBoolean(true));
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowDarkStoneVariantGen", true).getBoolean(true));
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowStructureGen", true).getBoolean(true));
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowNonBossStructureGen", true).getBoolean(true));
		blanketWorldGen[mapping++] = (config.get(catWorldGen, "allowBossStructureGen", true).getBoolean(true));

		mapping = 0;
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "voidPitRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "largeSpikeRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "starCrystalRarity", 40).getInt(40), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "structureOverallRarity", 15).getInt(15), 1, 500);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "apisTempleRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "desertTowerRarity", 15).getInt(15), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "deathCircleRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "obsidianCavernRarity", 10).getInt(10), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "kitsuneDenRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "celestialTempleRarity", 3).getInt(3), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "timeAltarRarity", 3).getInt(3), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "soulTombRarity", 15).getInt(15), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "aerisRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "empariahCaveRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "claymationRuinRarity", 5).getInt(5), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "darkHutRarity", 15).getInt(15), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "spiderNestRarity", 15).getInt(15), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "memoryCacheRarity", 3).getInt(3), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "lightSpireRarity", 10).getInt(10), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "hackerNetRarity", 3).getInt(3), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "cubeMazeRarity", 25).getInt(25), 1, 200);
		worldGenInts[mapping++] = MathHelper.clamp_int(config.get(catWorldGen, "outlookRarity", 3).getInt(3), 1, 200);

		config.addCustomCategoryComment(catWorldGen, "These toggle specific WorldGen features, meant to help with lag reduction if your CPU cannot handle it during WorldGen, also toggle rarities of structures");

		mapping = 0;
		miscConfigs[mapping++] = (config.get(catMisc, "allowRandomWeaponLore", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowChallengeScrolls", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowMobStatues", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowAnimatedGui", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowGeneratorItems", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowItemTimeAltering", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowWeaponModels", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowPvP", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowFlightNotify", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowArmorModels", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowAnomalyAugment", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowNuke", true).getBoolean(true));
		miscConfigs[mapping++] = (config.get(catMisc, "allowDivinityColorChange", true).getBoolean(true));

		mapping = 0;
		griefConfigs[mapping++] = config.get(catMisc, "allowNatureDrainDestruction", true).getBoolean(true);
		griefConfigs[mapping++] = config.get(catMisc, "allowRavageDestruction", true).getBoolean(true);
		griefConfigs[mapping++] = config.get(catMisc, "allowFrozenLightningDestruction", true).getBoolean(true);
		griefConfigs[mapping++] = config.get(catMisc, "allowMourningStarDestruction", true).getBoolean(true);
		griefConfigs[mapping++] = config.get(catMisc, "allowTitanDestruction", true).getBoolean(true);

		mapping = 0;
		miscInts[mapping++] = MathHelper.clamp_int(config.get(catMisc, "challengeScrollDropChance", 5).getInt(5), 1, 100);
		miscInts[mapping++] = MathHelper.clamp_int(config.get(catMisc, "mobStatueDropChance", 100).getInt(100), 1, 100);
		miscInts[mapping++] = MathHelper.clamp_int(config.get(catMisc, "guiTransparency", 100).getInt(100), 1, 100);
		miscInts[mapping++] = config.get(catMisc, "guiTextureSkins", 0).getInt(0);
		miscInts[mapping++] = config.get(catMisc, "guiXPosition", 1).getInt(1);
		miscInts[mapping++] = config.get(catMisc, "guiYPosition", 1).getInt(1);

		config.addCustomCategoryComment(catMisc, "Miscellaneous options that don't fit into other categories.");

		mapping = 0;
		modifierAmts[mapping++] = config.get(catMod, "claymationUtilitySpeedDebuff", -1.0).getDouble(-1.0);
		modifierAmts[mapping++] = config.get(catMod, "kitsuneSpeedDebuff", -0.5).getDouble(-0.5);
		modifierAmts[mapping++] = config.get(catMod, "timeControllerSpeedBuff", 0.055).getDouble(0.055);
		modifierAmts[mapping++] = config.get(catMod, "yetiSpeedDebuff", -0.5).getDouble(-0.5);
		modifierAmts[mapping++] = config.get(catMod, "aegarSpeedBuff", 0.156).getDouble(0.156);
		modifierAmts[mapping++] = config.get(catMod, "megaCryseNoShieldAttackBuff", 2.0).getDouble(2.0);
		modifierAmts[mapping++] = config.get(catMod, "jabbaLowHealthDamageBoost", 2.5).getDouble(2.5);
		modifierAmts[mapping++] = config.get(catMod, "norVoxSpeedDebuff", -0.5).getDouble(-0.5);
		modifierAmts[mapping++] = config.get(catMod, "psygoteSpeedDebuff", -0.5).getDouble(-0.5);
		modifierAmts[mapping++] = config.get(catMod, "tragicNekoSpeedDebuff", -0.5).getDouble(-0.5); //9
		modifierAmts[mapping++] = config.get(catMod, "dynamicMobHealthBuff", 20.0).getDouble(20.0);
		modifierAmts[mapping++] = config.get(catMod, "dynamicMobHealthDebuff", -20.0).getDouble(-20.0);
		modifierAmts[mapping++] = config.get(catMod, "dynamicBossHealthBuff", 50.0).getDouble(50.0);
		modifierAmts[mapping++] = 0.0; //13, this particular attribute modifier wasn't actually being used so it'll have no value
		modifierAmts[mapping++] = config.get(catMod, "ghastHealthBuff", 30.0).getDouble(30.0);
		modifierAmts[mapping++] = config.get(catMod, "zombieSkeletonCreeperHealthBuff", 10.0).getDouble(10.0);
		modifierAmts[mapping++] = config.get(catMod, "endermanHealthBuff", 20.0).getDouble(20.0);
		modifierAmts[mapping++] = config.get(catMod, "spiderHealthBuff", 8.0).getDouble(8.0);
		modifierAmts[mapping++] = config.get(catMod, "mobBlindnessFollowRangeDebuff", -16.0).getDouble(-16.0); //18
		modifierAmts[mapping++] = config.get(catMod, "hydrationKnockbackResistanceBuff", 1.0).getDouble(1.0);
		modifierAmts[mapping++] = config.get(catMod, "lightningRodAttackBuff", 5.0).getDouble(5.0);
		modifierAmts[mapping++] = config.get(catMod, "moonlightHealthBuff", 10.0).getDouble(10.0);
		modifierAmts[mapping++] = config.get(catMod, "synthesisHealthBuff", 10.0).getDouble(10.0); //22
		modifierAmts[mapping++] = config.get(catMod, "butcherKnockbackResistanceBuff", 1.0).getDouble(1.0);
		modifierAmts[mapping++] = config.get(catMod, "overlordArmorHealthBuff", 5.0).getDouble(5.0); //24

		config.addCustomCategoryComment(catMod, "These are here due to the addition of the mob stats, in case these need to be modified to fit with the input stats. These could also be set to 0 if you want to nullify them.");

		if (config.hasChanged()) config.save();
		postProcessConfigs();
	}

	public static void postProcessConfigs()
	{
		byte i;

		if (mobsOnly)
		{
			for (i = 0; i < blanketConfigs.length; i++)
			{
				if (i != BLANK_MOB) blanketConfigs[i] = false;
			}
		}

		if (!blanketConfigs[BLANK_AMULET])
		{
			for (i = 0; i < blanketAmulet.length; i++)
			{
				blanketAmulet[i] = false;
			}
			
			for (i = 0; i < normalAmuletConfigs.length; i++)
			{
				normalAmuletConfigs[i] = false;
				if (i < cursedAmuletConfigs.length) cursedAmuletConfigs[i] = false;
				if (i < epicAmuletConfigs.length) epicAmuletConfigs[i] = false;
			}
		}
		else
		{
			
			if (!blanketAmulet[0])
			{
				for (i = 0; i < normalAmuletConfigs.length; i++)
				{
					normalAmuletConfigs[i] = false;
				}
			}

			if (!blanketAmulet[1])
			{
				for (i = 0; i < cursedAmuletConfigs.length; i++)
				{
					cursedAmuletConfigs[i] = false;
				}
			}

			if (!blanketAmulet[2])
			{
				for (i = 0; i < epicAmuletConfigs.length; i++)
				{
					epicAmuletConfigs[i] = false;
				}
			}
		}

		if (!blanketConfigs[BLANK_DOOM])
		{
			for (i = 0; i < blanketDoom.length; i++)
			{
				blanketDoom[i] = false;
			}
		}
		else
		{
			if (!blanketDoom[0])
			{
				for (i = 1; i < 6; i++)
				{
					blanketDoom[i] = false;
				}
			}

			if (!blanketDoom[13])
			{
				blanketDoom[14] = false;
			}

			if (!blanketDoom[6])
			{
				for (i = 0; i < nonDoomsdayAbilities.length; i++)
				{
					nonDoomsdayAbilities[i] = false;
				}
			}
		}

		if (!blanketConfigs[BLANK_ENCHANT])
		{
			for (i = 0; i < weaponEnchantConfigs.length; i++)
			{
				weaponEnchantConfigs[i] = false;
				if (i < armorEnchantConfigs.length) armorEnchantConfigs[i] = false;
				if (i < blanketEnchant.length) blanketEnchant[i] = false;
			}
		}
		else
		{
			if (!blanketEnchant[0])
			{
				for (i = 0; i < weaponEnchantConfigs.length; i++)
				{
					weaponEnchantConfigs[i] = false;
				}
			}

			if (!blanketEnchant[1])
			{
				for (i = 0; i < armorEnchantConfigs.length; i++)
				{
					armorEnchantConfigs[i] = false;
				}
			}
		}

		if (!blanketConfigs[BLANK_MOB])
		{
			for (i = 0; i < mobConfigs.length; i++)
			{
				mobConfigs[i] = false;

				if (i < miniBossConfigs.length) miniBossConfigs[i] = false;
				if (i < bossConfigs.length) bossConfigs[i] = false;
				if (i < blanketMob.length) blanketMob[i] = false;
			}
		}
		else
		{
			if (!blanketMob[0])
			{
				for (i = 0; i < mobConfigs.length; i++)
				{
					mobConfigs[i] = false;
				}
			}

			if (!blanketMob[1])
			{
				for (i = 0; i < miniBossConfigs.length; i++)
				{
					miniBossConfigs[i] = false;
				}
			}

			if (!blanketMob[2])
			{
				for (i = 0; i < bossConfigs.length; i++)
				{
					bossConfigs[i] = false;
				}
			}
		}

		if (!blanketConfigs[BLANK_POTION])
		{
			for (i = 0; i < positivePotionConfigs.length; i++)
			{
				positivePotionConfigs[i] = false;
				if (i < negativePotionConfigs.length) negativePotionConfigs[i] = false;
				if (i < blanketPotion.length) blanketPotion[i] = false;
			}
		}
		else
		{
			if (!blanketPotion[0])
			{
				for (i = 0; i < positivePotionConfigs.length; i++)
				{
					positivePotionConfigs[i] = false;
				}
			}

			if (!blanketPotion[1])
			{
				for (i = 0; i < negativePotionConfigs.length; i++)
				{
					negativePotionConfigs[i] = false;
				}
			}
		}

		if (!blanketConfigs[BLANK_VANILLA])
		{
			for (i = 0; i < blanketVanillaChanges.length; i++)
			{
				blanketVanillaChanges[i] = false;
			}
		}

		if (!blanketConfigs[BLANK_WORLDGEN])
		{
			for (i = 0; i < blanketWorldGen.length; i++)
			{
				blanketWorldGen[i] = false;
			}
		}
		else
		{
			if (!blanketWorldGen[3])
			{
				blanketWorldGen[4] = false;
				blanketWorldGen[5] = false;
			}
		}

		boolean flag = false;
		for (int w : biomeWeights) //if all biome weights are set to 0, the dimensions are disabled
		{
			if (flag) break;
			if (w > 0) flag = true;
		}

		if (!flag) TragicConfig.allowDimension = false;

		initializeAllVariables();
	}

	public static void initializeAllVariables()
	{
		byte mapping = 0;
		allowAchievements = blanketConfigs[mapping++];
		allowAmulets = blanketConfigs[mapping++];
		allowDimension = blanketConfigs[mapping++];
		allowDoom = blanketConfigs[mapping++];
		allowEnchantments = blanketConfigs[mapping++];
		allowMobs = blanketConfigs[mapping++];
		allowPotions = blanketConfigs[mapping++];
		allowVanillaChanges = blanketConfigs[mapping++];
		allowWorldGen = blanketConfigs[mapping++];

		mapping = 0;
		allowNormalAmulets = blanketAmulet[mapping++];
		allowCursedAmulets = blanketAmulet[mapping++];
		allowEpicAmulets = blanketAmulet[mapping++];
		allowAmuletLeveling = blanketAmulet[mapping++];
		allowAmuletCrafting = blanketAmulet[mapping++];
		shouldUnlockAmuletSlots = blanketAmulet[mapping++];
		allowAmuletKillRecharge = blanketAmulet[mapping++];
		showAmuletStatus = blanketAmulet[mapping++];
		allowAmuletModifiers = blanketAmulet[mapping++];
		deathDropsAmulets = blanketAmulet[mapping++];

		mapping = 0;
		maxAmuletSlots = amuletInts[mapping++];
		overallAmuletRarity = amuletInts[mapping++];
		amuletReleaseRarity = amuletInts[mapping++];
		amuletModifierChance = amuletInts[mapping++];
		amuletModifierChance2 = amuletInts[mapping++];
		amuletModifierChance3 = amuletInts[mapping++];

		mapping = 0;
		amuPeace = normalAmuletConfigs[mapping++];
		amuYeti = normalAmuletConfigs[mapping++];
		amuClaymation = normalAmuletConfigs[mapping++];
		amuChicken = normalAmuletConfigs[mapping++];
		amuBlacksmith = normalAmuletConfigs[mapping++];
		amuCreeper = normalAmuletConfigs[mapping++];
		amuZombie = normalAmuletConfigs[mapping++];
		amuSkeleton = normalAmuletConfigs[mapping++];
		amuIce = normalAmuletConfigs[mapping++];
		amuSnowGolem = normalAmuletConfigs[mapping++];
		amuIronGolem = normalAmuletConfigs[mapping++];
		amuSpider = normalAmuletConfigs[mapping++];
		amuStin = normalAmuletConfigs[mapping++];
		amuSupernatural = normalAmuletConfigs[mapping++];
		amuFusea = normalAmuletConfigs[mapping++];
		amuLuck = normalAmuletConfigs[mapping++];

		mapping = 0;
		amuKitsune = cursedAmuletConfigs[mapping++];
		amuMartyr = cursedAmuletConfigs[mapping++];
		amuPiercing = cursedAmuletConfigs[mapping++];
		amuApis = cursedAmuletConfigs[mapping++];
		amuSunken = cursedAmuletConfigs[mapping++];
		amuEnderman = cursedAmuletConfigs[mapping++];
		amuPolaris = cursedAmuletConfigs[mapping++];
		amuLightning = cursedAmuletConfigs[mapping++];
		amuConsumption = cursedAmuletConfigs[mapping++];
		amuUndead = cursedAmuletConfigs[mapping++];
		amuEnderDragon = cursedAmuletConfigs[mapping++];

		amuTime = epicAmuletConfigs[0];
		amuWither = epicAmuletConfigs[1];
		amuOverlord = epicAmuletConfigs[2];
		amuEnyvil = epicAmuletConfigs[3];

		mapping = 0;
		decayingHillsW = biomeWeights[mapping];
		idDecayingHills = biomeIDs[mapping++];
		decayingValleyW = biomeWeights[mapping];
		idDecayingValley = biomeIDs[mapping++];
		decayingWastelandW = biomeWeights[mapping];
		idDecayingWasteland = biomeIDs[mapping++];
		decayingMountainsW = biomeWeights[mapping];
		idDecayingMountains = biomeIDs[mapping++];
		paintedForestW = biomeWeights[mapping];
		idPaintedForest = biomeIDs[mapping++];
		paintedPlainsW = biomeWeights[mapping];
		idPaintedPlains = biomeIDs[mapping++];
		paintedHillsW = biomeWeights[mapping];
		idPaintedHills = biomeIDs[mapping++];
		paintedClearingW = biomeWeights[mapping];
		idPaintedClearing = biomeIDs[mapping++];
		ashenMountainsW = biomeWeights[mapping];
		idAshenMountains = biomeIDs[mapping++];
		ashenHillsW = biomeWeights[mapping];
		idAshenHills = biomeIDs[mapping++];
		ashenBadlandsW = biomeWeights[mapping];
		idAshenBadlands = biomeIDs[mapping++];
		starlitPrarieW = biomeWeights[mapping];
		idStarlitPrarie = biomeIDs[mapping++];
		starlitPlateausW = biomeWeights[mapping];
		idStarlitPlateaus = biomeIDs[mapping++];
		starlitCliffsW = biomeWeights[mapping];
		idStarlitCliffs = biomeIDs[mapping++];
		starlitLowlandsW = biomeWeights[mapping];
		idStarlitLowlands = biomeIDs[mapping++];
		taintedSpikesW = biomeWeights[mapping];
		idTaintedSpikes = biomeIDs[mapping++];
		taintedLowlandsW = biomeWeights[mapping];
		idTaintedLowlands = biomeIDs[mapping++];
		taintedRisesW = biomeWeights[mapping];
		idTaintedRises = biomeIDs[mapping++];
		taintedScarlandsW = biomeWeights[mapping];
		idTaintedScarlands = biomeIDs[mapping++];
		taintedIslesW = biomeWeights[mapping];
		idTaintedIsles = biomeIDs[mapping++];
		synapseW = biomeWeights[mapping];
		idSynapse = biomeIDs[mapping++];
		hallowedHillsW = biomeWeights[mapping];
		idHallowedHills = biomeIDs[mapping++];
		hallowedForestW = biomeWeights[mapping];
		idHallowedForest = biomeIDs[mapping++];
		hallowedPrarieW = biomeWeights[mapping];
		idHallowedPrarie = biomeIDs[mapping++];
		hallowedCliffsW = biomeWeights[mapping];
		idHallowedCliffs = biomeIDs[mapping++];
		scorchedWastelandsW = biomeWeights[mapping];
		idScorchedWastelands = biomeIDs[mapping++];
		scorchedValleyW = biomeWeights[mapping];
		idScorchedValley = biomeIDs[mapping++];
		scorchedScarlandsW = biomeWeights[mapping];
		idScorchedScarlands = biomeIDs[mapping++];
		corrodedSteppeW = biomeWeights[mapping];
		idCorrodedSteppe = biomeIDs[mapping++];
		corrodedHeightsW = biomeWeights[mapping];
		idCorrodedHeights = biomeIDs[mapping++];
		corrodedVeldW = biomeWeights[mapping];
		idCorrodedVeld = biomeIDs[mapping++];
		corrodedRunoffW = biomeWeights[mapping];
		idCorrodedRunoff = biomeIDs[mapping++];
		corrodedFalloutW = biomeWeights[mapping];
		idCorrodedFallout = biomeIDs[mapping++];
		frozenTundraW = biomeWeights[mapping];
		idFrozenTundra = biomeIDs[mapping++];
		frozenHillsW = biomeWeights[mapping];
		idFrozenHills = biomeIDs[mapping++];
		frozenDepthsW = biomeWeights[mapping];
		idFrozenDepths = biomeIDs[mapping++];
		crystalW = biomeWeights[mapping];
		idCrystal = biomeIDs[mapping++];
		darkForestW = biomeWeights[mapping];
		idDarkForest = biomeIDs[mapping++];
		darkForestHillsW = biomeWeights[mapping];
		idDarkForestHills = biomeIDs[mapping++];
		darkMarshW = biomeWeights[mapping];
		idDarkMarsh = biomeIDs[mapping++];
		synapseDeadW = biomeWeights[mapping];
		idSynapseDead = biomeIDs[mapping++];
		synapseCorruptW = biomeWeights[mapping];
		idSynapseCorrupt = biomeIDs[mapping++];

		mapping = 0;
		allowDoomsdays = blanketDoom[mapping++];
		allowInfluenceDoomsday = blanketDoom[mapping++];
		allowCrisisDoomsday = blanketDoom[mapping++];
		allowOverflowDoomsday = blanketDoom[mapping++];
		allowWorldShaperDoomsday = blanketDoom[mapping++];
		allowCombinationDoomsday = blanketDoom[mapping++];
		allowNonDoomsdayAbilities = blanketDoom[mapping++];
		shouldDoomLimitIncrease = blanketDoom[mapping++];
		allowConsumeRefill = blanketDoom[mapping++];
		allowDoomPainRecharge = blanketDoom[mapping++];
		allowNaturalRecharge = blanketDoom[mapping++];
		allowCrucialMoments = blanketDoom[mapping++];
		allowBacklash = blanketDoom[mapping++];
		allowCooldown = blanketDoom[mapping++];
		allowCooldownDefuse = blanketDoom[mapping++];
		showDoomGui = blanketDoom[mapping++];
		allowDoomKillRecharge = blanketDoom[mapping++];

		mapping = 0;
		maxDoomAmount = doomInts[mapping++];
		doomRechargeRate = doomInts[mapping++];
		doomConsumeRarity = doomInts[mapping++];
		cooldownDefuseRarity = doomInts[mapping++];
		consumeRefillAmount = doomInts[mapping++];
		defuseRefillAmount = doomInts[mapping++];
		backlashChance = doomInts[mapping++];
		crucialMomentChance = doomInts[mapping++];
		doomConsumeAmount = doomInts[mapping++];
		maxDoomMinimum = doomInts[mapping++];
		doomRechargeAmount = doomInts[mapping++];

		allowWeaponEnchants = blanketEnchant[0];
		allowArmorEnchants = blanketEnchant[1];

		mapping = 0;
		allowDecay = weaponEnchantConfigs[mapping++];
		allowSlay = weaponEnchantConfigs[mapping++];
		allowAbsolve = weaponEnchantConfigs[mapping++];
		allowVampirism = weaponEnchantConfigs[mapping++];
		allowLeech = weaponEnchantConfigs[mapping++];
		allowConsume = weaponEnchantConfigs[mapping++];
		allowDistract = weaponEnchantConfigs[mapping++];
		allowMultiply = weaponEnchantConfigs[mapping++];
		allowCombustion = weaponEnchantConfigs[mapping++];
		allowRuneBreak = weaponEnchantConfigs[mapping++];
		allowReach = weaponEnchantConfigs[mapping++];
		allowUnbreakable = weaponEnchantConfigs[mapping++];
		allowRust = weaponEnchantConfigs[mapping++];
		allowVeteran = weaponEnchantConfigs[mapping++];
		
		mapping = 0;
		allowDeathTouch = armorEnchantConfigs[mapping++];
		allowIgnition = armorEnchantConfigs[mapping++];
		allowToxicity = armorEnchantConfigs[mapping++];
		allowParalysis = armorEnchantConfigs[mapping++];
		allowElasticity = armorEnchantConfigs[mapping++];
		allowAgility = armorEnchantConfigs[mapping++];
		allowRuneWalker = armorEnchantConfigs[mapping++];
		allowLuminescence = armorEnchantConfigs[mapping++];
		
		mapping = 0;
		idDecay = enchantIDs[mapping++];
		idSlay = enchantIDs[mapping++];
		idAbsolve= enchantIDs[mapping++];
		idVampirism = enchantIDs[mapping++];
		idLeech = enchantIDs[mapping++];
		idConsume = enchantIDs[mapping++];
		idDistract = enchantIDs[mapping++];
		idMultiply = enchantIDs[mapping++];
		idCombustion = enchantIDs[mapping++];
		idRuneBreak = enchantIDs[mapping++];
		idReach = enchantIDs[mapping++];
		idUnbreakable = enchantIDs[mapping++];
		idRust = enchantIDs[mapping++];
		idVeteran = enchantIDs[mapping++];
		idDeathTouch = enchantIDs[mapping++];
		idIgnition = enchantIDs[mapping++];
		idToxicity = enchantIDs[mapping++];
		idParalysis = enchantIDs[mapping++];
		idElasticity = enchantIDs[mapping++];
		idAgility = enchantIDs[mapping++];
		idRuneWalker = enchantIDs[mapping++];
		idLuminescence = enchantIDs[mapping++];

		allowNormalMobs = blanketMob[0];
		allowMiniBosses = blanketMob[1];
		allowBosses = blanketMob[2];
		allowBossOverworldSpawns = blanketMob[3];
		allowExtraBossLoot = blanketMob[4];
		allowVictoryBuffs = blanketMob[5];
		allowCorruptionDamage = blanketMob[6];
		allowMobTransformation = blanketMob[7];
		allowDynamicHealthScaling = blanketMob[8];
		allowNonDimensionMobSpawns = blanketMob[9];
		allowGroupBuffs = blanketMob[10];
		allowEasyBosses = blanketMob[11];
		allowMobSounds = blanketMob[12];

		commonDropRate = mobInts[0];
		rareDropRate = mobInts[1];
		mobTransformationChance = mobInts[2];
		bossDamageCap = mobInts[3];
		groupBuffChance = mobInts[4];

		mapping = 0;
		jabbaSC = mobsSC[mapping];
		allowJabba = mobConfigs[mapping++];
		jannaSC = mobsSC[mapping];
		allowJanna = mobConfigs[mapping++];
		plagueSC = mobsSC[mapping];
		allowPlague = mobConfigs[mapping++];
		gragulSC = mobsSC[mapping];
		allowGragul = mobConfigs[mapping++];
		minotaurSC = mobsSC[mapping];
		allowMinotaur = mobConfigs[mapping++];
		inklingSC = mobsSC[mapping];
		allowInkling = mobConfigs[mapping++];
		ragrSC = mobsSC[mapping];
		allowRagr = mobConfigs[mapping++];
		pumpkinheadSC = mobsSC[mapping];
		allowPumpkinhead = mobConfigs[mapping++];
		tragicNekoSC = mobsSC[mapping];
		allowTragicNeko = mobConfigs[mapping++];
		toxSC = mobsSC[mapping];
		allowTox = mobConfigs[mapping++];
		poxSC = mobsSC[mapping];
		allowPox = mobConfigs[mapping++];
		cryseSC = mobsSC[mapping];
		allowCryse = mobConfigs[mapping++];
		starCryseSC = mobsSC[mapping];
		allowStarCryse = mobConfigs[mapping++];
		norVoxSC = mobsSC[mapping];
		allowNorVox = mobConfigs[mapping++];
		starVoxSC = mobsSC[mapping];
		allowStarVox = mobConfigs[mapping++];
		pirahSC = mobsSC[mapping];
		allowPirah = mobConfigs[mapping++];
		lavaPirahSC = mobsSC[mapping];
		allowLavaPirah = mobConfigs[mapping++];
		stinSC = mobsSC[mapping];
		allowStin = mobConfigs[mapping++];
		stinBabySC = mobsSC[mapping];
		allowStinBaby = mobConfigs[mapping++];
		greaterStinSC = mobsSC[mapping];
		allowGreaterStin = mobConfigs[mapping++];
		wispSC = mobsSC[mapping];
		allowWisp = mobConfigs[mapping++];
		abominationSC = mobsSC[mapping];
		allowAbomination = mobConfigs[mapping++];
		erkelSC = mobsSC[mapping];
		allowErkel = mobConfigs[mapping++];
		sirvSC = mobsSC[mapping];
		allowSirv = mobConfigs[mapping++];
		psygoteSC = mobsSC[mapping];
		allowPsygote = mobConfigs[mapping++];
		lockbotSC = mobsSC[mapping];
		allowLockbot = mobConfigs[mapping++];
		nanoSwarmSC = mobsSC[mapping];
		allowNanoSwarm = mobConfigs[mapping++];
		snowGolemSC = mobsSC[mapping];
		allowSnowGolem = mobConfigs[mapping++];
		hunterSC = mobsSC[mapping];
		allowHunter = mobConfigs[mapping++];
		harvesterSC = mobsSC[mapping];
		allowHarvester = mobConfigs[mapping++];
		archangelSC = mobsSC[mapping];
		allowArchangel = mobConfigs[mapping++];
		ireSC = mobsSC[mapping];
		allowIre = mobConfigs[mapping++];
		fuseaSC = mobsSC[mapping];
		allowFusea = mobConfigs[mapping++];
		ranmasSC = mobsSC[mapping];
		allowRanmas = mobConfigs[mapping++];
		parasmiteSC = mobsSC[mapping];
		allowParasmite = mobConfigs[mapping++];
		avrisSC = mobsSC[mapping];
		allowAvris = mobConfigs[mapping++];

		mapping = 0;
		jarraSC = miniBossSC[mapping];
		allowJarra = miniBossConfigs[mapping++];
		kragulSC = miniBossSC[mapping];
		allowKragul = miniBossConfigs[mapping++];
		magmoxSC = miniBossSC[mapping];
		allowMagmox = miniBossConfigs[mapping++];
		megaCryseSC = miniBossSC[mapping];
		allowMegaCryse = miniBossConfigs[mapping++];
		voxStellarumSC = miniBossSC[mapping];
		allowVoxStellarum = miniBossConfigs[mapping++];
		stinKingSC = miniBossSC[mapping];
		allowStinKing = miniBossConfigs[mapping++];
		stinQueenSC = miniBossSC[mapping];
		allowStinQueen = miniBossConfigs[mapping++];
		aegarSC = miniBossSC[mapping];
		allowAegar = miniBossConfigs[mapping++];
		volatileFuseaSC = miniBossSC[mapping];
		allowVolatileFusea = miniBossConfigs[mapping++];

		mapping = 0;
		apisSC = bossSC[mapping];
		allowApis = bossConfigs[mapping++];
		deathReaperSC = bossSC[mapping];
		allowDeathReaper = bossConfigs[mapping++];
		kitsuneSC = bossSC[mapping];
		allowKitsune = bossConfigs[mapping++];
		polarisSC = bossSC[mapping];
		allowPolaris = bossConfigs[mapping++];
		yetiSC = bossSC[mapping];
		allowYeti = bossConfigs[mapping++];
		timeControllerSC = bossSC[mapping];
		allowTimeController = bossConfigs[mapping++];
		enyvilSC = bossSC[mapping];
		allowEnyvil = bossConfigs[mapping++];
		claymationSC = bossSC[mapping];
		allowClaymation = bossConfigs[mapping++];
		overlordSC = bossSC[mapping];
		allowOverlord = bossConfigs[mapping++];

		mapping = 0;
		jabbaStats = mobStats[mapping++];
		jannaStats = mobStats[mapping++];
		plagueStats = mobStats[mapping++];
		gragulStats = mobStats[mapping++];
		minotaurStats = mobStats[mapping++];
		inklingStats = mobStats[mapping++];
		ragrStats = mobStats[mapping++];
		pumpkinheadStats = mobStats[mapping++];
		tragicNekoStats = mobStats[mapping++];
		toxStats = mobStats[mapping++];
		poxStats = mobStats[mapping++];
		cryseStats = mobStats[mapping++];
		starCryseStats = mobStats[mapping++];
		norVoxStats = mobStats[mapping++];
		starVoxStats = mobStats[mapping++];
		goldenPirahStats = mobStats[mapping++];
		pirahStats = mobStats[mapping++];
		stinStats = mobStats[mapping++];
		stinBabyStats = mobStats[mapping++];
		greaterStinStats = mobStats[mapping++];
		wispStats = mobStats[mapping++];
		abominationStats = mobStats[mapping++];
		erkelStats = mobStats[mapping++];
		sirvStats = mobStats[mapping++];
		psygoteStats = mobStats[mapping++];
		lockbotStats = mobStats[mapping++];
		nanoSwarmStats = mobStats[mapping++];
		hunterStats = mobStats[mapping++];
		harvesterStats = mobStats[mapping++];
		seekerStats = mobStats[mapping++];
		archangelStats = mobStats[mapping++];
		ireStats = mobStats[mapping++];
		fuseaStats = mobStats[mapping++];
		ranmasStats = mobStats[mapping++];
		parasmiteStats = mobStats[mapping++];
		kurayamiStats = mobStats[mapping++];
		avrisStats = mobStats[mapping++];

		mapping = 0;
		jarraStats = miniBossStats[mapping++];
		kragulStats = miniBossStats[mapping++];
		magmoxStats = miniBossStats[mapping++];
		megaCryseStats = miniBossStats[mapping++];
		voxStellarumStats = miniBossStats[mapping++];
		stinKingStats = miniBossStats[mapping++];
		stinQueenStats = miniBossStats[mapping++];
		aegarStats = miniBossStats[mapping++];
		volatileFuseaStats = miniBossStats[mapping++];

		mapping = 0;
		apisStats = bossStats[mapping++];
		deathReaperStats = bossStats[mapping++];
		kitsuneStats = bossStats[mapping++];
		polarisStats = bossStats[mapping++];
		yetiStats = bossStats[mapping++];
		timeControllerStats = bossStats[mapping++];
		enyvilStats = bossStats[mapping++];
		claymationStats = bossStats[mapping++];
		overlordCoreStats = bossStats[mapping++];
		overlordCombatStats = bossStats[mapping++];
		overlordCocoonStats = bossStats[mapping++];

		allowPositivePotions = blanketPotion[0];
		allowNegativePotions = blanketPotion[1];

		mapping = 0;
		allowFlight = positivePotionConfigs[mapping++];
		allowAquaSuperiority = positivePotionConfigs[mapping++];
		allowImmunity = positivePotionConfigs[mapping++];
		allowResurrection = positivePotionConfigs[mapping++];
		allowHarmony = positivePotionConfigs[mapping++];
		allowInvulnerability = positivePotionConfigs[mapping++];
		allowClarity = positivePotionConfigs[mapping++];
		allowConvergence = positivePotionConfigs[mapping++];
		allowDivinity = positivePotionConfigs[mapping++];

		mapping = 0;
		allowCorruption = negativePotionConfigs[mapping++];
		allowDisorientation = negativePotionConfigs[mapping++];
		allowStun = negativePotionConfigs[mapping++];
		allowFear = negativePotionConfigs[mapping++];
		allowMalnourish = negativePotionConfigs[mapping++];
		allowCripple = negativePotionConfigs[mapping++];
		allowSubmission = negativePotionConfigs[mapping++];
		allowInhibit = negativePotionConfigs[mapping++];
		allowLeadFoot = negativePotionConfigs[mapping++];
		allowHacked = negativePotionConfigs[mapping++];
		allowBurned = negativePotionConfigs[mapping++];

		mapping = 0;
		idFlight = potionIDs[mapping++];
		idAquaSuperiority = potionIDs[mapping++];
		idImmunity = potionIDs[mapping++];
		idResurrection = potionIDs[mapping++];
		idHarmony = potionIDs[mapping++];
		idInvulnerability = potionIDs[mapping++];
		idClarity = potionIDs[mapping++];
		idConvergence = potionIDs[mapping++];
		idDivinity = potionIDs[mapping++];
		idCorruption = potionIDs[mapping++];
		idDisorientation = potionIDs[mapping++];
		idStun = potionIDs[mapping++];
		idFear = potionIDs[mapping++];
		idMalnourish = potionIDs[mapping++];
		idCripple = potionIDs[mapping++];
		idSubmission = potionIDs[mapping++];
		idInhibit = potionIDs[mapping++];
		idLeadFoot = potionIDs[mapping++];
		idHacked = potionIDs[mapping++];
		idBurned = potionIDs[mapping++];

		mapping = 0;
		allowVanillaMobBuffs = blanketVanillaChanges[mapping++];
		allowExtraMobEffects = blanketVanillaChanges[mapping++];
		allowAnimalRetribution = blanketVanillaChanges[mapping++];
		allowMobModdedArmorAndEnchants = blanketVanillaChanges[mapping++];
		allowRespawnPunishment = blanketVanillaChanges[mapping++];
		allowExtraExplosiveEffects = blanketVanillaChanges[mapping++];
		allowExtraOverworldFlowers = blanketVanillaChanges[mapping++];
		allowOverworldSilverfishGen = blanketVanillaChanges[mapping++];
		allowNetherOreGen = blanketVanillaChanges[mapping++];
		allowOverworldOreGen = blanketVanillaChanges[mapping++];
		allowQuicksandGen = blanketVanillaChanges[mapping++];
		allowAnimalGolemCorruption = blanketVanillaChanges[mapping++];
		allowMobBlindnessDebuff = blanketVanillaChanges[mapping++];

		mapping = 0;
		rubyOreRarity = vanillaInts[mapping++];
		sapphireOreRarity = vanillaInts[mapping++];
		mercuryOreRarity = vanillaInts[mapping++];
		tungstenOreRarity = vanillaInts[mapping++];
		quicksandGenRarity = vanillaInts[mapping++];
		drudgeGenRarity = vanillaInts[mapping++];
		silverfishGenRarity = vanillaInts[mapping++];

		mapping = 0;
		allowVoidPitGen = blanketWorldGen[mapping++];
		allowLargeSpikeGen = blanketWorldGen[mapping++];
		allowDarkStoneVariantGen = blanketWorldGen[mapping++];
		allowStructureGen = blanketWorldGen[mapping++];
		allowNonBossStructureGen = blanketWorldGen[mapping++];
		allowBossStructureGen = blanketWorldGen[mapping++];

		mapping = 0;
		voidPitRarity = worldGenInts[mapping++];
		largeSpikeRarity = worldGenInts[mapping++];
		starCrystalRarity = worldGenInts[mapping++];
		structureOverallRarity = worldGenInts[mapping++];
		apisTempleRarity = worldGenInts[mapping++];
		desertTowerRarity = worldGenInts[mapping++];
		deathCircleRarity = worldGenInts[mapping++];
		obsidianCavernRarity = worldGenInts[mapping++];
		kitsuneDenRarity = worldGenInts[mapping++];
		celestialTempleRarity = worldGenInts[mapping++];
		timeAltarRarity = worldGenInts[mapping++];
		soulTombRarity = worldGenInts[mapping++];
		aerisRarity = worldGenInts[mapping++];
		empariahCaveRarity = worldGenInts[mapping++];
		claymationRuinRarity = worldGenInts[mapping++];
		darkHutRarity = worldGenInts[mapping++];
		spiderNestRarity = worldGenInts[mapping++];
		memoryCacheRarity  = worldGenInts[mapping++];
		lightSpireRarity = worldGenInts[mapping++];
		hackerNetRarity  = worldGenInts[mapping++];
		cubeMazeRarity = worldGenInts[mapping++];
		outlookRarity  = worldGenInts[mapping++];

		mapping = 0;
		allowRandomWeaponLore = miscConfigs[mapping++];
		allowChallengeScrolls = miscConfigs[mapping++];
		allowMobStatueDrops = miscConfigs[mapping++];
		allowAnimatedGui = miscConfigs[mapping++];
		allowGeneratorItems = miscConfigs[mapping++];
		allowItemTimeAltering = miscConfigs[mapping++];
		allowWeaponModels = miscConfigs[mapping++];
		allowPvP = miscConfigs[mapping++];
		allowFlightNotify = miscConfigs[mapping++];
		allowArmorModels = miscConfigs[mapping++];
		allowAnomalyAugment = miscConfigs[mapping++];
		allowNuke = miscConfigs[mapping++];
		allowDivinityColorChange = miscConfigs[mapping++];

		mapping = 0;
		challengeScrollDropChance = miscInts[mapping++];
		mobStatueDropChance = miscInts[mapping++];
		guiTransparency = miscInts[mapping++];
		guiTexture = miscInts[mapping++];
		guiX = miscInts[mapping++];
		guiY = miscInts[mapping++];

		dimensionID = dimensionIDs[0];
		providerID = dimensionIDs[1];
		synapseID = dimensionIDs[2];
		synapseProviderID = dimensionIDs[3];
		collisionBiomeSize = dimensionIDs[4];
	}

	public static void disablePotions()
	{
		blanketConfigs[6] = false;
		postProcessConfigs();
	}

	private static int getOpenIDForEnchant(int c)
	{
		if (c < Enchantment.enchantmentsList.length && Enchantment.enchantmentsList[c] != null)
		{
			while (Enchantment.enchantmentsList[c] != null)
			{
				c++;
				if (c >= Enchantment.enchantmentsList.length) c -= Enchantment.enchantmentsList.length;
			}
		}
		else if (c >= Enchantment.enchantmentsList.length)
		{
			c -= Enchantment.enchantmentsList.length;

			while (Enchantment.enchantmentsList[c] != null)
			{
				c++;
				if (c >= Enchantment.enchantmentsList.length) c -= Enchantment.enchantmentsList.length;
			}
		}

		return c;
	}

	public static int getOpenIDForPotion(int c)
	{
		if (c < Potion.potionTypes.length && Potion.potionTypes[c] != null)
		{
			while (Potion.potionTypes[c] != null)
			{
				c++;
				if (c >= Potion.potionTypes.length) c -= Potion.potionTypes.length;
			}
		}
		else if (c >= Potion.potionTypes.length)
		{
			c -= Potion.potionTypes.length;

			while (Potion.potionTypes[c] != null)
			{
				c++;
				if (c >= Potion.potionTypes.length) c -= Potion.potionTypes.length;
			}
		}

		return c;
	}

	private static int getOpenIDForBiome(int c)
	{
		if (c < BiomeGenBase.getBiomeGenArray().length && BiomeGenBase.getBiomeGenArray()[c] != null)
		{
			while (BiomeGenBase.getBiomeGenArray()[c] != null)
			{
				c++;
				if (c >= BiomeGenBase.getBiomeGenArray().length) c -= BiomeGenBase.getBiomeGenArray().length;
			}
		}
		else if (c >= BiomeGenBase.getBiomeGenArray().length)
		{
			c -= BiomeGenBase.getBiomeGenArray().length;

			while (BiomeGenBase.getBiomeGenArray()[c] != null)
			{
				c++;
				if (c >= BiomeGenBase.getBiomeGenArray().length) c -= BiomeGenBase.getBiomeGenArray().length;
			}
		}
		return c;
	}

	private static int clampPositive(int i) {
		return i < 0 ? 0 : i;
	}

	private static boolean verify(final double[] array, final int amt)
	{
		if (amt > array.length) return false; 
		for (int i = 0; i < amt; i++)
		{
			if (Double.isNaN(array[i]))
			{
				TragicMC.logInfo("Value of " + array[i] + " was invalid.");
				return false;
			}
		}
		return true;
	}
}
