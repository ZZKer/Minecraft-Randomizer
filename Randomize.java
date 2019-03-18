import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import rando.Input;

public class Randomize {
	/* Take list of inputs
	 * Take list of outputs
	 * Randomize
	 * Output to files
	 */
	 
	public static String Mversion = "13_0";
	public static String VANILLA = "./vanilla/minecraft/recipes";
	 
	public static void main(String []args) {
		//intro
		System.out.println("Welcome to the craft-o-mizer Version Beta for Mincraft 13.0!");
		System.out.println("This makes a datapack that randomizes crafting and smelting recipes.");
		System.out.print("Please input seed number (0 for new seed): ");
		
		//get seed
		int seed = 0;
		Scanner cin = new Scanner(System.in);
		seed = cin.nextInt();
		if( seed == 0 ){
			seed = (int) Math.floor(Math.random() * 100000000);
			System.out.println("Seed set to: " + seed);
		}
		
		//Take list of inputs
		System.out.print("Adding recipes to table...");
		List<Input> inputs = new ArrayList<Input>();
		int n = 0;
		
		//Crafting Recipes
		inputs.add(n++, new Input(false, "acacia_boat"));
		inputs.add(n++, new Input(false, "acacia_button"));
		inputs.add(n++, new Input(false, "acacia_door"));
		inputs.add(n++, new Input(false, "acacia_fence"));
		inputs.add(n++, new Input(false, "acacia_fence_gate"));
		inputs.add(n++, new Input(false, "acacia_planks"));
		inputs.add(n++, new Input(false, "acacia_pressure_plate"));
		inputs.add(n++, new Input(false, "acacia_slab"));
		inputs.add(n++, new Input(false, "acacia_stairs"));
		inputs.add(n++, new Input(false, "acacia_trapdoor"));
		inputs.add(n++, new Input(false, "acacia_wood"));
		inputs.add(n++, new Input(false, "activator_rail"));
		inputs.add(n++, new Input(false, "andesite"));
		inputs.add(n++, new Input(false, "anvil"));
		inputs.add(n++, new Input(false, "armor_stand"));
		inputs.add(n++, new Input(false, "arrow"));
		inputs.add(n++, new Input(false, "beacon"));
		inputs.add(n++, new Input(false, "beetroot_soup"));
		inputs.add(n++, new Input(false, "birch_boat"));
		inputs.add(n++, new Input(false, "birch_button"));
		inputs.add(n++, new Input(false, "birch_door"));
		inputs.add(n++, new Input(false, "birch_fence"));
		inputs.add(n++, new Input(false, "birch_fence_gate"));
		inputs.add(n++, new Input(false, "birch_planks"));
		inputs.add(n++, new Input(false, "birch_pressure_plate"));
		inputs.add(n++, new Input(false, "birch_slab"));
		inputs.add(n++, new Input(false, "birch_stairs"));
		inputs.add(n++, new Input(false, "birch_trapdoor"));
		inputs.add(n++, new Input(false, "birch_wood"));
		inputs.add(n++, new Input(false, "black_bed"));
		inputs.add(n++, new Input(false, "black_wool"));
		inputs.add(n++, new Input(false, "blaze_powder"));
		inputs.add(n++, new Input(false, "blue_bed"));
		inputs.add(n++, new Input(false, "blue_ice"));
		inputs.add(n++, new Input(false, "blue_wool"));
		inputs.add(n++, new Input(false, "bone_block"));
		inputs.add(n++, new Input(false, "bone_meal"));
		inputs.add(n++, new Input(false, "bone_meal_from_bone_block"));
		inputs.add(n++, new Input(false, "book"));
		inputs.add(n++, new Input(false, "bookshelf"));
		inputs.add(n++, new Input(false, "bow"));
		inputs.add(n++, new Input(false, "bowl"));
		inputs.add(n++, new Input(false, "bread"));
		inputs.add(n++, new Input(false, "brewing_stand"));
		inputs.add(n++, new Input(false, "brick_slab"));
		inputs.add(n++, new Input(false, "brick_stairs"));
		inputs.add(n++, new Input(false, "bricks"));
		inputs.add(n++, new Input(false, "brown_bed"));
		inputs.add(n++, new Input(false, "brown_wool"));
		inputs.add(n++, new Input(false, "bucket"));
		inputs.add(n++, new Input(false, "cake"));
		inputs.add(n++, new Input(false, "carrot_on_a_stick"));
		inputs.add(n++, new Input(false, "cauldron"));
		inputs.add(n++, new Input(false, "chest"));
		inputs.add(n++, new Input(false, "chest_minecart"));
		inputs.add(n++, new Input(false, "chiseled_quartz_block"));
		inputs.add(n++, new Input(false, "chiseled_red_sandstone"));
		inputs.add(n++, new Input(false, "chiseled_stone_bricks"));
		inputs.add(n++, new Input(false, "clay"));
		inputs.add(n++, new Input(false, "clock"));
		inputs.add(n++, new Input(false, "coal"));
		inputs.add(n++, new Input(false, "coal_block"));
		inputs.add(n++, new Input(false, "coarse_dirt"));
		inputs.add(n++, new Input(false, "cobblestone_slab"));
		inputs.add(n++, new Input(false, "cobblestone_stairs"));
		inputs.add(n++, new Input(false, "cobblestone_wall"));
		inputs.add(n++, new Input(false, "comparator"));
		inputs.add(n++, new Input(false, "compass"));
		inputs.add(n++, new Input(false, "conduit"));
		inputs.add(n++, new Input(false, "cookie"));
		inputs.add(n++, new Input(false, "cracked_stone_bricks"));
		inputs.add(n++, new Input(false, "crafting_table"));
		inputs.add(n++, new Input(false, "cut_red_sandstone"));
		inputs.add(n++, new Input(false, "cut_sandstone"));
		inputs.add(n++, new Input(false, "cyan_bed"));
		inputs.add(n++, new Input(false, "cyan_dye"));
		inputs.add(n++, new Input(false, "cyan_wool"));
		inputs.add(n++, new Input(false, "dark_oak_boat"));
		inputs.add(n++, new Input(false, "dark_oak_button"));
		inputs.add(n++, new Input(false, "dark_oak_door"));
		inputs.add(n++, new Input(false, "dark_oak_fence"));
		inputs.add(n++, new Input(false, "dark_oak_fence_gate"));
		inputs.add(n++, new Input(false, "dark_oak_planks"));
		inputs.add(n++, new Input(false, "dark_oak_pressure_plate"));
		inputs.add(n++, new Input(false, "dark_oak_slab"));
		inputs.add(n++, new Input(false, "dark_oak_stairs"));
		inputs.add(n++, new Input(false, "dark_oak_trapdoor"));
		inputs.add(n++, new Input(false, "dark_oak_wood"));
		inputs.add(n++, new Input(false, "dark_prismarine"));
		inputs.add(n++, new Input(false, "dark_prismarine_slab"));
		inputs.add(n++, new Input(false, "dark_prismarine_stairs"));
		inputs.add(n++, new Input(false, "daylight_detector"));
		inputs.add(n++, new Input(false, "detector_rail"));
		inputs.add(n++, new Input(false, "diamond"));
		inputs.add(n++, new Input(false, "diamond_axe"));
		inputs.add(n++, new Input(false, "diamond_block"));
		inputs.add(n++, new Input(false, "diamond_boots"));
		inputs.add(n++, new Input(false, "diamond_chestplate"));
		inputs.add(n++, new Input(false, "diamond_helmet"));
		inputs.add(n++, new Input(false, "diamond_hoe"));
		inputs.add(n++, new Input(false, "diamond_leggings"));
		inputs.add(n++, new Input(false, "diamond_pickaxe"));
		inputs.add(n++, new Input(false, "diamond_shovel"));
		inputs.add(n++, new Input(false, "diamond_sword"));
		inputs.add(n++, new Input(false, "diorite"));
		inputs.add(n++, new Input(false, "dispenser"));
		inputs.add(n++, new Input(false, "dried_kelp"));
		inputs.add(n++, new Input(false, "dried_kelp_block"));
		inputs.add(n++, new Input(false, "dropper"));
		inputs.add(n++, new Input(false, "emerald"));
		inputs.add(n++, new Input(false, "emerald_block"));
		inputs.add(n++, new Input(false, "enchanting_table"));
		inputs.add(n++, new Input(false, "end_crystal"));
		inputs.add(n++, new Input(false, "end_rod"));
		inputs.add(n++, new Input(false, "end_stone_bricks"));
		inputs.add(n++, new Input(false, "ender_chest"));
		inputs.add(n++, new Input(false, "ender_eye"));
		inputs.add(n++, new Input(false, "fermented_spider_eye"));
		inputs.add(n++, new Input(false, "fire_charge"));
		inputs.add(n++, new Input(false, "fishing_rod"));
		inputs.add(n++, new Input(false, "flint_and_steel"));
		inputs.add(n++, new Input(false, "flower_pot"));
		inputs.add(n++, new Input(false, "furnace"));
		inputs.add(n++, new Input(false, "furnace_minecart"));
		inputs.add(n++, new Input(false, "glass_bottle"));
		inputs.add(n++, new Input(false, "glass_pane"));
		inputs.add(n++, new Input(false, "glistering_melon_slice"));
		inputs.add(n++, new Input(false, "glowstone"));
		inputs.add(n++, new Input(false, "gold_block"));
		inputs.add(n++, new Input(false, "gold_ingot_from_gold_block"));
		inputs.add(n++, new Input(false, "gold_ingot_from_nuggets"));
		inputs.add(n++, new Input(false, "gold_nugget"));
		inputs.add(n++, new Input(false, "golden_apple"));
		inputs.add(n++, new Input(false, "golden_axe"));
		inputs.add(n++, new Input(false, "golden_boots"));
		inputs.add(n++, new Input(false, "golden_carrot"));
		inputs.add(n++, new Input(false, "golden_chestplate"));
		inputs.add(n++, new Input(false, "golden_helmet"));
		inputs.add(n++, new Input(false, "golden_hoe"));
		inputs.add(n++, new Input(false, "golden_leggings"));
		inputs.add(n++, new Input(false, "golden_pickaxe"));
		inputs.add(n++, new Input(false, "golden_shovel"));
		inputs.add(n++, new Input(false, "golden_sword"));
		inputs.add(n++, new Input(false, "granite"));
		inputs.add(n++, new Input(false, "gray_bed"));
		inputs.add(n++, new Input(false, "gray_dye"));
		inputs.add(n++, new Input(false, "gray_wool"));
		inputs.add(n++, new Input(false, "green_bed"));
		inputs.add(n++, new Input(false, "green_wool"));
		inputs.add(n++, new Input(false, "hay_block"));
		inputs.add(n++, new Input(false, "heavy_weighted_pressure_plate"));
		inputs.add(n++, new Input(false, "hopper"));
		inputs.add(n++, new Input(false, "hopper_minecart"));
		inputs.add(n++, new Input(false, "iron_axe"));
		inputs.add(n++, new Input(false, "iron_bars"));
		inputs.add(n++, new Input(false, "iron_block"));
		inputs.add(n++, new Input(false, "iron_boots"));
		inputs.add(n++, new Input(false, "iron_chestplate"));
		inputs.add(n++, new Input(false, "iron_door"));
		inputs.add(n++, new Input(false, "iron_helmet"));
		inputs.add(n++, new Input(false, "iron_hoe"));
		inputs.add(n++, new Input(false, "iron_ingot_from_iron_block"));
		inputs.add(n++, new Input(false, "iron_ingot_from_nuggets"));
		inputs.add(n++, new Input(false, "iron_leggings"));
		inputs.add(n++, new Input(false, "iron_nugget"));
		inputs.add(n++, new Input(false, "iron_pickaxe"));
		inputs.add(n++, new Input(false, "iron_shovel"));
		inputs.add(n++, new Input(false, "iron_sword"));
		inputs.add(n++, new Input(false, "iron_trapdoor"));
		inputs.add(n++, new Input(false, "item_frame"));
		inputs.add(n++, new Input(false, "jack_o_lantern"));
		inputs.add(n++, new Input(false, "jukebox"));
		inputs.add(n++, new Input(false, "jungle_boat"));
		inputs.add(n++, new Input(false, "jungle_button"));
		inputs.add(n++, new Input(false, "jungle_door"));
		inputs.add(n++, new Input(false, "jungle_fence"));
		inputs.add(n++, new Input(false, "jungle_fence_gate"));
		inputs.add(n++, new Input(false, "jungle_planks"));
		inputs.add(n++, new Input(false, "jungle_pressure_plate"));
		inputs.add(n++, new Input(false, "jungle_slab"));
		inputs.add(n++, new Input(false, "jungle_stairs"));
		inputs.add(n++, new Input(false, "jungle_trapdoor"));
		inputs.add(n++, new Input(false, "jungle_wood"));
		inputs.add(n++, new Input(false, "ladder"));
		inputs.add(n++, new Input(false, "lapis_block"));
		inputs.add(n++, new Input(false, "lapis_lazuli"));
		inputs.add(n++, new Input(false, "lead"));
		inputs.add(n++, new Input(false, "leather"));
		inputs.add(n++, new Input(false, "leather_boots"));
		inputs.add(n++, new Input(false, "leather_chestplate"));
		inputs.add(n++, new Input(false, "leather_helmet"));
		inputs.add(n++, new Input(false, "leather_leggings"));
		inputs.add(n++, new Input(false, "lever"));
		inputs.add(n++, new Input(false, "light_blue_bed"));
		inputs.add(n++, new Input(false, "light_blue_dye_from_blue_orchid"));
		inputs.add(n++, new Input(false, "light_blue_dye_from_lapis_bonemeal"));
		inputs.add(n++, new Input(false, "light_blue_wool"));
		inputs.add(n++, new Input(false, "light_gray_bed"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_azure_bluet"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_gray_bonemeal"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_ink_bonemeal"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_oxeye_daisy"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_white_tulip"));
		inputs.add(n++, new Input(false, "light_gray_wool"));
		inputs.add(n++, new Input(false, "light_weighted_pressure_plate"));
		inputs.add(n++, new Input(false, "lime_bed"));
		inputs.add(n++, new Input(false, "lime_dye"));
		inputs.add(n++, new Input(false, "lime_wool"));
		inputs.add(n++, new Input(false, "magenta_bed"));
		inputs.add(n++, new Input(false, "magenta_dye_from_allium"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lapis_ink_bonemeal"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lapis_red_pink"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lilac"));
		inputs.add(n++, new Input(false, "magenta_dye_from_purple_and_pink"));
		inputs.add(n++, new Input(false, "magenta_wool"));
		inputs.add(n++, new Input(false, "magma_block"));
		inputs.add(n++, new Input(false, "magma_cream"));
		inputs.add(n++, new Input(false, "map"));
		inputs.add(n++, new Input(false, "melon"));
		inputs.add(n++, new Input(false, "melon_seeds"));
		inputs.add(n++, new Input(false, "minecart"));
		inputs.add(n++, new Input(false, "mossy_cobblestone"));
		inputs.add(n++, new Input(false, "mossy_cobblestone_wall"));
		inputs.add(n++, new Input(false, "mushroom_stew"));
		inputs.add(n++, new Input(false, "nether_brick_fence"));
		inputs.add(n++, new Input(false, "nether_brick_slab"));
		inputs.add(n++, new Input(false, "nether_brick_stairs"));
		inputs.add(n++, new Input(false, "nether_bricks"));
		inputs.add(n++, new Input(false, "nether_wart_block"));
		inputs.add(n++, new Input(false, "note_block"));
		inputs.add(n++, new Input(false, "oak_boat"));
		inputs.add(n++, new Input(false, "oak_button"));
		inputs.add(n++, new Input(false, "oak_door"));
		inputs.add(n++, new Input(false, "oak_fence"));
		inputs.add(n++, new Input(false, "oak_fence_gate"));
		inputs.add(n++, new Input(false, "oak_planks"));
		inputs.add(n++, new Input(false, "oak_pressure_plate"));
		inputs.add(n++, new Input(false, "oak_slab"));
		inputs.add(n++, new Input(false, "oak_stairs"));
		inputs.add(n++, new Input(false, "oak_trapdoor"));
		inputs.add(n++, new Input(false, "oak_wood"));
		inputs.add(n++, new Input(false, "observer"));
		inputs.add(n++, new Input(false, "orange_bed"));
		inputs.add(n++, new Input(false, "orange_dye_from_orange_tulip"));
		inputs.add(n++, new Input(false, "orange_dye_from_red_yellow"));
		inputs.add(n++, new Input(false, "orange_wool"));
		inputs.add(n++, new Input(false, "packed_ice"));
		inputs.add(n++, new Input(false, "painting"));
		inputs.add(n++, new Input(false, "paper"));
		inputs.add(n++, new Input(false, "pink_bed"));
		inputs.add(n++, new Input(false, "pink_dye_from_peony"));
		inputs.add(n++, new Input(false, "pink_dye_from_pink_tulip"));
		inputs.add(n++, new Input(false, "pink_dye_from_red_bonemeal"));
		inputs.add(n++, new Input(false, "pink_wool"));
		inputs.add(n++, new Input(false, "piston"));
		inputs.add(n++, new Input(false, "polished_andesite"));
		inputs.add(n++, new Input(false, "polished_diorite"));
		inputs.add(n++, new Input(false, "polished_granite"));
		inputs.add(n++, new Input(false, "powered_rail"));
		inputs.add(n++, new Input(false, "prismarine"));
		inputs.add(n++, new Input(false, "prismarine_brick_slab"));
		inputs.add(n++, new Input(false, "prismarine_brick_stairs"));
		inputs.add(n++, new Input(false, "prismarine_bricks"));
		inputs.add(n++, new Input(false, "prismarine_slab"));
		inputs.add(n++, new Input(false, "prismarine_stairs"));
		inputs.add(n++, new Input(false, "pumpkin_pie"));
		inputs.add(n++, new Input(false, "pumpkin_seeds"));
		inputs.add(n++, new Input(false, "purple_bed"));
		inputs.add(n++, new Input(false, "purple_dye"));
		inputs.add(n++, new Input(false, "purple_wool"));
		inputs.add(n++, new Input(false, "purpur_block"));
		inputs.add(n++, new Input(false, "purpur_pillar"));
		inputs.add(n++, new Input(false, "purpur_slab"));
		inputs.add(n++, new Input(false, "purpur_stairs"));
		inputs.add(n++, new Input(false, "quartz"));
		inputs.add(n++, new Input(false, "quartz_block"));
		inputs.add(n++, new Input(false, "quartz_pillar"));
		inputs.add(n++, new Input(false, "quartz_slab"));
		inputs.add(n++, new Input(false, "quartz_stairs"));
		inputs.add(n++, new Input(false, "rabbit_stew_from_brown_mushroom"));
		inputs.add(n++, new Input(false, "rabbit_stew_from_red_mushroom"));
		inputs.add(n++, new Input(false, "rail"));
		inputs.add(n++, new Input(false, "red_bed"));
		inputs.add(n++, new Input(false, "red_dye_from_beetroot"));
		inputs.add(n++, new Input(false, "red_dye_from_poppy"));
		inputs.add(n++, new Input(false, "red_dye_from_rose_bush"));
		inputs.add(n++, new Input(false, "red_dye_from_tulip"));
		inputs.add(n++, new Input(false, "red_nether_bricks"));
		inputs.add(n++, new Input(false, "red_sandstone"));
		inputs.add(n++, new Input(false, "red_sandstone_slab"));
		inputs.add(n++, new Input(false, "red_sandstone_stairs"));
		inputs.add(n++, new Input(false, "red_wool"));
		inputs.add(n++, new Input(false, "redstone"));
		inputs.add(n++, new Input(false, "redstone_block"));
		inputs.add(n++, new Input(false, "redstone_lamp"));
		inputs.add(n++, new Input(false, "redstone_torch"));
		inputs.add(n++, new Input(false, "repeater"));
		inputs.add(n++, new Input(false, "sandstone"));
		inputs.add(n++, new Input(false, "sandstone_slab"));
		inputs.add(n++, new Input(false, "sandstone_stairs"));
		inputs.add(n++, new Input(false, "sea_lantern"));
		inputs.add(n++, new Input(false, "shears"));
		inputs.add(n++, new Input(false, "shield"));
		inputs.add(n++, new Input(false, "shulker_box"));
		inputs.add(n++, new Input(false, "sign"));
		inputs.add(n++, new Input(false, "slime_ball"));
		inputs.add(n++, new Input(false, "slime_block"));
		inputs.add(n++, new Input(false, "snow"));
		inputs.add(n++, new Input(false, "snow_block"));
		inputs.add(n++, new Input(false, "spectral_arrow"));
		inputs.add(n++, new Input(false, "spruce_boat"));
		inputs.add(n++, new Input(false, "spruce_button"));
		inputs.add(n++, new Input(false, "spruce_door"));
		inputs.add(n++, new Input(false, "spruce_fence"));
		inputs.add(n++, new Input(false, "spruce_fence_gate"));
		inputs.add(n++, new Input(false, "spruce_planks"));
		inputs.add(n++, new Input(false, "spruce_pressure_plate"));
		inputs.add(n++, new Input(false, "spruce_slab"));
		inputs.add(n++, new Input(false, "spruce_stairs"));
		inputs.add(n++, new Input(false, "spruce_trapdoor"));
		inputs.add(n++, new Input(false, "spruce_wood"));
		inputs.add(n++, new Input(false, "stick"));
		inputs.add(n++, new Input(false, "sticky_piston"));
		inputs.add(n++, new Input(false, "stone_axe"));
		inputs.add(n++, new Input(false, "stone_brick_slab"));
		inputs.add(n++, new Input(false, "stone_brick_stairs"));
		inputs.add(n++, new Input(false, "stone_bricks"));
		inputs.add(n++, new Input(false, "stone_button"));
		inputs.add(n++, new Input(false, "stone_hoe"));
		inputs.add(n++, new Input(false, "stone_pickaxe"));
		inputs.add(n++, new Input(false, "stone_pressure_plate"));
		inputs.add(n++, new Input(false, "stone_shovel"));
		inputs.add(n++, new Input(false, "stone_slab"));
		inputs.add(n++, new Input(false, "stone_sword"));
		inputs.add(n++, new Input(false, "sugar"));
		inputs.add(n++, new Input(false, "tnt"));
		inputs.add(n++, new Input(false, "tnt_minecart"));
		inputs.add(n++, new Input(false, "torch"));
		inputs.add(n++, new Input(false, "trapped_chest"));
		inputs.add(n++, new Input(false, "tripwire_hook"));
		inputs.add(n++, new Input(false, "turtle_helmet"));
		inputs.add(n++, new Input(false, "wheat"));
		inputs.add(n++, new Input(false, "white_bed"));
		inputs.add(n++, new Input(false, "white_wool_from_string"));
		inputs.add(n++, new Input(false, "wooden_axe"));
		inputs.add(n++, new Input(false, "wooden_hoe"));
		inputs.add(n++, new Input(false, "wooden_pickaxe"));
		inputs.add(n++, new Input(false, "wooden_shovel"));
		inputs.add(n++, new Input(false, "wooden_sword"));
		inputs.add(n++, new Input(false, "writable_book"));
		inputs.add(n++, new Input(false, "yellow_bed"));
		inputs.add(n++, new Input(false, "yellow_dye_from_dandelion"));
		inputs.add(n++, new Input(false, "yellow_dye_from_sunflower"));
		inputs.add(n++, new Input(false, "yellow_wool"));
		
		//Smelting Recipes
		inputs.add(n++, new Input(true, "baked_potato"));
		inputs.add(n++, new Input(true, "brick"));
		inputs.add(n++, new Input(true, "cactus_green"));
		inputs.add(n++, new Input(true, "charcoal"));
		inputs.add(n++, new Input(true, "coal_from_smelting"));
		inputs.add(n++, new Input(true, "cooked_beef"));
		inputs.add(n++, new Input(true, "cooked_chicken"));
		inputs.add(n++, new Input(true, "cooked_cod"));
		inputs.add(n++, new Input(true, "cooked_mutton"));
		inputs.add(n++, new Input(true, "cooked_porkchop"));
		inputs.add(n++, new Input(true, "cooked_rabbit"));
		inputs.add(n++, new Input(true, "cooked_salmon"));
		inputs.add(n++, new Input(true, "diamond_from_smelting"));
		inputs.add(n++, new Input(true, "dried_kelp_from_smelting"));
		inputs.add(n++, new Input(true, "emerald_from_smelting"));
		inputs.add(n++, new Input(true, "glass"));
		inputs.add(n++, new Input(true, "gold_ingot"));
		inputs.add(n++, new Input(true, "gold_nugget_from_smelting"));
		inputs.add(n++, new Input(true, "iron_ingot"));
		inputs.add(n++, new Input(true, "iron_nugget_from_smelting"));
		inputs.add(n++, new Input(true, "lapis_from_smelting"));
		inputs.add(n++, new Input(true, "lime_dye_from_smelting"));
		inputs.add(n++, new Input(true, "nether_brick"));
		inputs.add(n++, new Input(true, "popped_chorus_fruit"));
		inputs.add(n++, new Input(true, "redstone_from_smelting"));
		inputs.add(n++, new Input(true, "sponge"));
		inputs.add(n++, new Input(true, "stone"));
		inputs.add(n++, new Input(true, "terracotta"));
		
		System.out.println(" DONE!");
		
		//Take list of outputs
		System.out.print("Adding results to table...");
		int x = inputs.size()+0;
		int[] outputs = new int[x];
		for(int i=0; i<x; i++) {
			outputs[i] = i;
		}
		System.out.println(" DONE!");
		
		//Ceate File Pathing
		try{
		System.out.print("Creating file system...");
		String filepath = "./Rand_"+Mversion+"_s"+seed+"/data/minecraft/recipes";
		File tempfile = new File(filepath);
		tempfile.mkdirs();
		tempfile = new File("./Rand_"+Mversion+"_s"+seed+"/pack.mcmeta");
		tempfile.createNewFile();
		FileWriter writer = new FileWriter(tempfile);
		String mcmetawords = "{\n\t\"pack\": {\n\t\t\"pack_format\": 1,\n\t\t\"description\": \"Random recipes. Seed "+seed
							+"\"\n\t}\n}";
		writer.write(mcmetawords);
		writer.flush();
		writer.close();
		System.out.println(" DONE!");
		
		//Randomize
		System.out.print("Randomizing and creating files...");
		
		//Also Spoiler Log File
		String spath = "./Rand_"+Mversion+"_s"+seed+"/spoiler.txt";
		File spoiler = new File(spath);
		writer = new FileWriter(spoiler);
		String spoilLine = "Spoiler Log for seed: "+seed+"\n";
		
		Random generator = new Random(seed);
		int length = x+0;
		//System.out.println("length is "+length);
		//System.out.println("length is "+inputs.size());
		for(Input in : inputs) {
			int chosen = generator.nextInt(length);
			Input out = inputs.get(outputs[chosen]);
			//System.out.println("chosen ("+chosen+") is "+out.getName()+". length is "+length);
			outputfile(in, out, filepath);
			spoilLine = spoilLine+"\n"+in.getName()+"\t\t--->  "+out.getName();
			
			if (chosen < (length-1) && length > 1){
				outputs[chosen] = 0+outputs[length-1];
			}
			length--;
		}
		
		//finalize
		writer.write(spoilLine);
		writer.flush();
		writer.close();
		System.out.println("DONE!\nPack complete.");
		}
		catch(IOException ex){
			System.out.println("An exception in file writing occured.");
		}
	}
	
	public static void outputfile(Input in, Input out, String filepath) throws IOException{
		//Output to files
		File file = new File(filepath+"/"+out.getFilename());
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		String words = "";
		
		if(in.isSmelt() == out.isSmelt()) {
			words = words+getFront(in)+"\n"+getResult(out);
		} else {
			if(in.isSmelt()) {
				words = words+getFront(in)+"\n"+getResultCraft2Smelt(out)+"\n"+getResultSmeltXP(in);
			} else {
				words = words+getFront(in)+"\n"+getResultSmelt2Craft(out);
			}
		}
			
		writer.write(words);
		writer.flush();
		writer.close();
	}
	
	public static String getFront(Input in) throws IOException{
		//find vanilla file
		File file = new File(VANILLA+"/"+in.getFilename());
		Scanner sc = new Scanner(file);
		String front = sc.nextLine();
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && !(line.contains("result"))) {
			front = front+"\n"+line;
			line = sc.nextLine();
		}
		
		sc.close();
		return front;
	}
	
	public static String getResult(Input out) throws IOException{
		//find vanilla file
		File file = new File(VANILLA+"/"+out.getFilename());
		Scanner sc = new Scanner(file);
		String result = "";
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && !(line.contains("result"))) {
			line = sc.nextLine();
		}
		result = ""+line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			result = result+"\n"+line;
		}
		
		sc.close();
		return result;
	}
	
	public static String getResultSmelt2Craft(Input out) throws IOException{
		//find vanilla file
		File file = new File(VANILLA+"/"+out.getFilename());
		Scanner sc = new Scanner(file);
		String result = "";
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && !(line.contains("result"))) {
			line = sc.nextLine();
		}
		result = line.substring(0,12)+"{\n    \"item\": "+line.substring(12,line.length()-1)+"\n  }\n}";
		
		sc.close();
		return result;
	}
	
	public static String getResultCraft2Smelt(Input out) throws IOException{
		//find vanilla file
		File file = new File(VANILLA+"/"+out.getFilename());
		Scanner sc = new Scanner(file);
		String result = "";
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && !(line.contains("result"))) {
			line = sc.nextLine();
		}
		
		result = line.substring(0,12);
		line = sc.nextLine();
		result = result + line.substring(12);
		
		if(!(result.contains(","))) {
			result = result + ",";
		}
		
		sc.close();
		return result;
	}
	
	public static String getResultSmeltXP(Input in) throws IOException{
		//find vanilla file
		File file = new File(VANILLA+"/"+in.getFilename());
		Scanner sc = new Scanner(file);
		String result = "";
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && !(line.contains("result"))) {
			line = sc.nextLine();
		}
		line = sc.nextLine();
		result = result + line;
		
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			result = result+"\n"+line;
		}
		
		sc.close();
		return result;
	}
}