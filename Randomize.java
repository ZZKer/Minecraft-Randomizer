import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import rando.*;

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
		System.out.println("Welcome to the craft-o-mizer Version Beta for Mincraft 1.13!");
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
		inputs.add(n++, new Input(false, "acacia_boat"));			//  -000
		inputs.add(n++, new Input(false, "acacia_button"));
		inputs.add(n++, new Input(false, "acacia_door"));
		inputs.add(n++, new Input(false, "acacia_fence"));
		inputs.add(n++, new Input(false, "acacia_fence_gate"));
		inputs.add(n++, new Input(false, "acacia_planks", "Ap"));	//Ap
		inputs.add(n++, new Input(false, "acacia_pressure_plate"));
		inputs.add(n++, new Input(false, "acacia_slab", "A6"));
		inputs.add(n++, new Input(false, "acacia_stairs"));
		inputs.add(n++, new Input(false, "acacia_trapdoor"));
		inputs.add(n++, new Input(false, "acacia_wood"));			//  -010
		inputs.add(n++, new Input(false, "activator_rail", "R9"));	//R9
		inputs.add(n++, new Input(false, "andesite", "An"));		//An
		inputs.add(n++, new Input(false, "anvil"));
		inputs.add(n++, new Input(false, "armor_stand"));
		inputs.add(n++, new Input(false, "arrow", "Ar"));			//Ar
		inputs.add(n++, new Input(false, "beacon"));
		inputs.add(n++, new Input(false, "beetroot_soup"));
		inputs.add(n++, new Input(false, "birch_boat"));
		inputs.add(n++, new Input(false, "birch_button"));
		inputs.add(n++, new Input(false, "birch_door"));			//  -020
		inputs.add(n++, new Input(false, "birch_fence"));
		inputs.add(n++, new Input(false, "birch_fence_gate"));
		inputs.add(n++, new Input(false, "birch_planks", "Bp"));	//Bp
		inputs.add(n++, new Input(false, "birch_pressure_plate"));
		inputs.add(n++, new Input(false, "birch_slab", "B6"));
		inputs.add(n++, new Input(false, "birch_stairs"));
		inputs.add(n++, new Input(false, "birch_trapdoor"));
		inputs.add(n++, new Input(false, "birch_wood"));
		inputs.add(n++, new Input(false, "black_banner"));
		inputs.add(n++, new Input(false, "black_bed"));				//  -030
		inputs.add(n++, new Input(false, "black_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "black_carpet"));
		inputs.add(n++, new Input(false, "black_concrete_powder"));
		inputs.add(n++, new Input(false, "black_stained_glass", "Bg"));	//Bg
		inputs.add(n++, new Input(false, "black_stained_glass_pane"));
		inputs.add(n++, new Input(false, "black_terracotta", "Bt"));	//Bt
		inputs.add(n++, new Input(false, "black_wool", "Bw"));			//Bw
		inputs.add(n++, new Input(false, "blaze_powder", "Bz"));		//Bz
		inputs.add(n++, new Input(false, "blue_banner"));
		inputs.add(n++, new Input(false, "blue_bed"));				//  -040
		inputs.add(n++, new Input(false, "blue_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "blue_carpet"));
		inputs.add(n++, new Input(false, "blue_concrete_powder"));
		inputs.add(n++, new Input(false, "blue_ice"));
		inputs.add(n++, new Input(false, "blue_stained_glass", "Ug"));	//Ug
		inputs.add(n++, new Input(false, "blue_stained_glass_pane"));
		inputs.add(n++, new Input(false, "blue_terracotta", "Ut"));		//Ut
		inputs.add(n++, new Input(false, "blue_wool", "Uw"));			//Uw
		inputs.add(n++, new Input(false, "bone_block", "Bb"));		//Bb
		inputs.add(n++, new Input(false, "bone_meal", "Bm"));		//Bm-050
		inputs.add(n++, new Input(false, "bone_meal_from_bone_block", "Bm"));	//Bm
		inputs.add(n++, new Input(false, "book", "Bk"));			//Bk
		inputs.add(n++, new Input(false, "bookshelf", "Bf"));		//Bf
		inputs.add(n++, new Input(false, "bow", "Bo"));				//Bo
		inputs.add(n++, new Input(false, "bowl", "Bl"));			//Bl
		inputs.add(n++, new Input(false, "bread"));
		inputs.add(n++, new Input(false, "brewing_stand", "Bs"));	//Bs
		inputs.add(n++, new Input(false, "brick_slab"));
		inputs.add(n++, new Input(false, "brick_stairs"));
		inputs.add(n++, new Input(false, "bricks", "Br"));			//Br-060
		inputs.add(n++, new Input(false, "brown_banner"));
		inputs.add(n++, new Input(false, "brown_bed"));
		inputs.add(n++, new Input(false, "brown_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "brown_carpet"));
		inputs.add(n++, new Input(false, "brown_concrete_powder"));
		inputs.add(n++, new Input(false, "brown_stained_glass", "Ng"));	//Ng
		inputs.add(n++, new Input(false, "brown_stained_glass_pane"));
		inputs.add(n++, new Input(false, "brown_terracotta", "Nt"));	//Nt
		inputs.add(n++, new Input(false, "brown_wool", "Nw"));		//Nw
		inputs.add(n++, new Input(false, "bucket", "Bu"));			//Bu-070
		inputs.add(n++, new Input(false, "cake"));
		inputs.add(n++, new Input(false, "carrot_on_a_stick"));
		inputs.add(n++, new Input(false, "cauldron"));
		inputs.add(n++, new Input(false, "chest", "Ch"));			//Ch
		inputs.add(n++, new Input(false, "chest_minecart", "Cm"));	//Cm
		inputs.add(n++, new Input(false, "chiseled_quartz_block"));
		inputs.add(n++, new Input(false, "chiseled_red_sandstone"));
		inputs.add(n++, new Input(false, "chiseled_sandstone"));
		inputs.add(n++, new Input(false, "chiseled_stone_bricks"));
		inputs.add(n++, new Input(false, "clay", "Cy"));			//Cy-080
		inputs.add(n++, new Input(false, "clock"));
		inputs.add(n++, new Input(false, "coal", "Co"));			//Co
		inputs.add(n++, new Input(false, "coal_block", "Cb"));		//Cb
		inputs.add(n++, new Input(false, "coarse_dirt"));
		inputs.add(n++, new Input(false, "cobblestone_slab"));
		inputs.add(n++, new Input(false, "cobblestone_stairs"));
		inputs.add(n++, new Input(false, "cobblestone_wall"));
		inputs.add(n++, new Input(false, "comparator"));
		inputs.add(n++, new Input(false, "compass", "Cp"));			//Cp
		inputs.add(n++, new Input(false, "conduit"));				//  -090
		inputs.add(n++, new Input(false, "cookie"));
		inputs.add(n++, new Input(false, "crafting_table", "Ct"));	//Ct
		inputs.add(n++, new Input(false, "cut_red_sandstone"));
		inputs.add(n++, new Input(false, "cut_sandstone"));
		inputs.add(n++, new Input(false, "cyan_banner"));
		inputs.add(n++, new Input(false, "cyan_bed"));
		inputs.add(n++, new Input(false, "cyan_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "cyan_carpet"));
		inputs.add(n++, new Input(false, "cyan_concrete_powder"));
		inputs.add(n++, new Input(false, "cyan_dye", "Cd"));		//Cd-100
		inputs.add(n++, new Input(false, "cyan_stained_glass", "Cg"));	//Cg
		inputs.add(n++, new Input(false, "cyan_stained_glass_pane"));
		inputs.add(n++, new Input(false, "cyan_terracotta", "Cr"));		//Cr
		inputs.add(n++, new Input(false, "cyan_wool", "Cw"));			//Cw
		inputs.add(n++, new Input(false, "dark_oak_boat"));
		inputs.add(n++, new Input(false, "dark_oak_button"));
		inputs.add(n++, new Input(false, "dark_oak_door"));
		inputs.add(n++, new Input(false, "dark_oak_fence"));
		inputs.add(n++, new Input(false, "dark_oak_fence_gate"));
		inputs.add(n++, new Input(false, "dark_oak_planks", "Dp"));		//Dp
		inputs.add(n++, new Input(false, "dark_oak_pressure_plate"));
		inputs.add(n++, new Input(false, "dark_oak_slab", "D6"));
		inputs.add(n++, new Input(false, "dark_oak_stairs"));
		inputs.add(n++, new Input(false, "dark_oak_trapdoor"));
		inputs.add(n++, new Input(false, "dark_oak_wood"));
		inputs.add(n++, new Input(false, "dark_prismarine", "Da"));		//Da
		inputs.add(n++, new Input(false, "dark_prismarine_slab"));
		inputs.add(n++, new Input(false, "dark_prismarine_stairs"));
		inputs.add(n++, new Input(false, "daylight_detector"));
		inputs.add(n++, new Input(false, "detector_rail", "R9"));	//R9-120
		inputs.add(n++, new Input(false, "diamond", "Di"));			//Di
		inputs.add(n++, new Input(false, "diamond_axe"));
		inputs.add(n++, new Input(false, "diamond_block", "Db"));	//Db
		inputs.add(n++, new Input(false, "diamond_boots"));
		inputs.add(n++, new Input(false, "diamond_chestplate"));
		inputs.add(n++, new Input(false, "diamond_helmet"));
		inputs.add(n++, new Input(false, "diamond_hoe"));
		inputs.add(n++, new Input(false, "diamond_leggings"));
		inputs.add(n++, new Input(false, "diamond_pickaxe", "Dx"));	//Dx
		inputs.add(n++, new Input(false, "diamond_shovel"));
		inputs.add(n++, new Input(false, "diamond_sword", "Ds"));	//Ds
		inputs.add(n++, new Input(false, "diorite", "Do"));			//Do
		inputs.add(n++, new Input(false, "dispenser", "D3"));		//D3
		inputs.add(n++, new Input(false, "dried_kelp", "Kd"));		//Kd
		inputs.add(n++, new Input(false, "dried_kelp_block", "Kb"));//Kb
		inputs.add(n++, new Input(false, "dropper"));
		inputs.add(n++, new Input(false, "emerald", "Em"));			//Em
		inputs.add(n++, new Input(false, "emerald_block", "Eb"));	//Eb
		inputs.add(n++, new Input(false, "enchanting_table", "Et"));//Et
		inputs.add(n++, new Input(false, "end_crystal"));			//  -140
		inputs.add(n++, new Input(false, "end_rod"));
		inputs.add(n++, new Input(false, "end_stone_bricks"));
		inputs.add(n++, new Input(false, "ender_chest", "Ec"));		//Ec
		inputs.add(n++, new Input(false, "ender_eye", "Ee"));		//Ee
		inputs.add(n++, new Input(false, "fermented_spider_eye"));
		inputs.add(n++, new Input(false, "fire_charge", "Fc"));		//Fc
		inputs.add(n++, new Input(false, "fishing_rod", "Fr"));		//Fr
		inputs.add(n++, new Input(false, "flint_and_steel", "Fs"));	//Fs
		inputs.add(n++, new Input(false, "flower_pot"));
		inputs.add(n++, new Input(false, "furnace", "Fu"));			//Fu
		inputs.add(n++, new Input(false, "furnace_minecart", "Fm"));//Fm
		inputs.add(n++, new Input(false, "glass_bottle", "Gl"));
		inputs.add(n++, new Input(false, "glass_pane"));
		inputs.add(n++, new Input(false, "glistering_melon_slice"));
		inputs.add(n++, new Input(false, "glowstone", "Gt"));	//Gt
		inputs.add(n++, new Input(false, "gold_block", "Gb"));	//Gb
		inputs.add(n++, new Input(false, "gold_ingot_from_gold_block", "Gi"));	//Gi
		inputs.add(n++, new Input(false, "gold_ingot_from_nuggets", "Gi"));		//Gi
		inputs.add(n++, new Input(false, "gold_nugget", "Gn"));		//Gn
		inputs.add(n++, new Input(false, "golden_apple"));			//  -160
		inputs.add(n++, new Input(false, "golden_axe", "G9"));
		inputs.add(n++, new Input(false, "golden_boots", "G9"));
		inputs.add(n++, new Input(false, "golden_carrot"));
		inputs.add(n++, new Input(false, "golden_chestplate", "G9"));
		inputs.add(n++, new Input(false, "golden_helmet", "G9"));
		inputs.add(n++, new Input(false, "golden_hoe", "G9"));
		inputs.add(n++, new Input(false, "golden_leggings", "G9"));
		inputs.add(n++, new Input(false, "golden_pickaxe", "G9"));
		inputs.add(n++, new Input(false, "golden_shovel", "G9"));
		inputs.add(n++, new Input(false, "golden_sword", "G9"));
		inputs.add(n++, new Input(false, "granite", "Ga"));
		inputs.add(n++, new Input(false, "gray_banner"));
		inputs.add(n++, new Input(false, "gray_bed"));
		inputs.add(n++, new Input(false, "gray_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "gray_carpet"));
		inputs.add(n++, new Input(false, "gray_concrete_powder"));
		inputs.add(n++, new Input(false, "gray_dye", "Ad"));
		inputs.add(n++, new Input(false, "gray_stained_glass", "Ag"));
		inputs.add(n++, new Input(false, "gray_stained_glass_pane"));
		inputs.add(n++, new Input(false, "gray_terracotta", "At"));		//At-180
		inputs.add(n++, new Input(false, "gray_wool", "Aw"));
		inputs.add(n++, new Input(false, "green_banner"));
		inputs.add(n++, new Input(false, "green_bed"));
		inputs.add(n++, new Input(false, "green_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "green_carpet"));
		inputs.add(n++, new Input(false, "green_concrete_powder"));
		inputs.add(n++, new Input(false, "green_stained_glass", "Eg"));
		inputs.add(n++, new Input(false, "green_stained_glass_pane"));
		inputs.add(n++, new Input(false, "green_terracotta", "Er"));
		inputs.add(n++, new Input(false, "green_wool", "Ew"));
		inputs.add(n++, new Input(false, "hay_block", "Hb"));
		inputs.add(n++, new Input(false, "heavy_weighted_pressure_plate"));
		inputs.add(n++, new Input(false, "hopper", "Hp"));
		inputs.add(n++, new Input(false, "hopper_minecart", "Hm"));
		inputs.add(n++, new Input(false, "iron_axe", "I9"));
		inputs.add(n++, new Input(false, "iron_bars"));
		inputs.add(n++, new Input(false, "iron_block", "Ib"));
		inputs.add(n++, new Input(false, "iron_boots", "I8"));
		inputs.add(n++, new Input(false, "iron_chestplate", "I7"));	//I7
		inputs.add(n++, new Input(false, "iron_door"));				//  -200
		inputs.add(n++, new Input(false, "iron_helmet", "I6"));
		inputs.add(n++, new Input(false, "iron_hoe", "I9"));
		inputs.add(n++, new Input(false, "iron_ingot_from_iron_block", "Ii"));
		inputs.add(n++, new Input(false, "iron_ingot_from_nuggets", "Ii"));
		inputs.add(n++, new Input(false, "iron_leggings", "I5"));
		inputs.add(n++, new Input(false, "iron_nugget", "In"));
		inputs.add(n++, new Input(false, "iron_pickaxe", "Ix"));
		inputs.add(n++, new Input(false, "iron_shovel", "I9"));
		inputs.add(n++, new Input(false, "iron_sword", "Is"));
		inputs.add(n++, new Input(false, "iron_trapdoor"));
		inputs.add(n++, new Input(false, "item_frame"));
		inputs.add(n++, new Input(false, "jack_o_lantern", "Jo"));
		inputs.add(n++, new Input(false, "jukebox"));
		inputs.add(n++, new Input(false, "jungle_boat"));
		inputs.add(n++, new Input(false, "jungle_button"));
		inputs.add(n++, new Input(false, "jungle_door"));
		inputs.add(n++, new Input(false, "jungle_fence"));
		inputs.add(n++, new Input(false, "jungle_fence_gate"));
		inputs.add(n++, new Input(false, "jungle_planks", "Jp"));	//Jp
		inputs.add(n++, new Input(false, "jungle_pressure_plate"));	//  -220
		inputs.add(n++, new Input(false, "jungle_slab", "J6"));
		inputs.add(n++, new Input(false, "jungle_stairs"));
		inputs.add(n++, new Input(false, "jungle_trapdoor"));
		inputs.add(n++, new Input(false, "jungle_wood"));
		inputs.add(n++, new Input(false, "ladder"));
		inputs.add(n++, new Input(false, "lapis_block", "Lb"));
		inputs.add(n++, new Input(false, "lapis_lazuli", "Ll"));
		inputs.add(n++, new Input(false, "lead"));
		inputs.add(n++, new Input(false, "leather", "Lr"));
		inputs.add(n++, new Input(false, "leather_boots", "L9"));
		inputs.add(n++, new Input(false, "leather_chestplate", "L9"));
		inputs.add(n++, new Input(false, "leather_helmet", "L6"));
		inputs.add(n++, new Input(false, "leather_leggings", "L9"));
		inputs.add(n++, new Input(false, "lever"));
		inputs.add(n++, new Input(false, "light_blue_banner"));
		inputs.add(n++, new Input(false, "light_blue_bed"));
		inputs.add(n++, new Input(false, "light_blue_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "light_blue_carpet"));
		inputs.add(n++, new Input(false, "light_blue_concrete_powder"));
		inputs.add(n++, new Input(false, "light_blue_dye_from_blue_orchid", "Ud"));		//Ud-240
		inputs.add(n++, new Input(false, "light_blue_dye_from_lapis_bonemeal", "Ud"));
		inputs.add(n++, new Input(false, "light_blue_stained_glass", "Us"));
		inputs.add(n++, new Input(false, "light_blue_stained_glass_pane"));
		inputs.add(n++, new Input(false, "light_blue_terracotta", "Ur"));
		inputs.add(n++, new Input(false, "light_blue_wool", "Uo"));
		inputs.add(n++, new Input(false, "light_gray_banner"));
		inputs.add(n++, new Input(false, "light_gray_bed"));
		inputs.add(n++, new Input(false, "light_gray_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "light_gray_carpet"));
		inputs.add(n++, new Input(false, "light_gray_concrete_powder"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_azure_bluet", "Zd"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_gray_bonemeal", "Zd"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_ink_bonemeal", "Zd"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_oxeye_daisy", "Zd"));
		inputs.add(n++, new Input(false, "light_gray_dye_from_white_tulip", "Zd"));
		inputs.add(n++, new Input(false, "light_gray_stained_glass", "Zg"));
		inputs.add(n++, new Input(false, "light_gray_stained_glass_pane"));
		inputs.add(n++, new Input(false, "light_gray_terracotta", "Zt"));
		inputs.add(n++, new Input(false, "light_gray_wool", "Zw"));		//Zw
		inputs.add(n++, new Input(false, "light_weighted_pressure_plate"));	//  -260
		inputs.add(n++, new Input(false, "lime_banner"));
		inputs.add(n++, new Input(false, "lime_bed"));
		inputs.add(n++, new Input(false, "lime_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "lime_carpet"));
		inputs.add(n++, new Input(false, "lime_concrete_powder"));
		inputs.add(n++, new Input(false, "lime_dye", "Ld"));
		inputs.add(n++, new Input(false, "lime_stained_glass", "Lg"));
		inputs.add(n++, new Input(false, "lime_stained_glass_pane"));
		inputs.add(n++, new Input(false, "lime_terracotta", "Lt"));
		inputs.add(n++, new Input(false, "lime_wool", "Lw"));
		inputs.add(n++, new Input(false, "magenta_banner"));
		inputs.add(n++, new Input(false, "magenta_bed"));
		inputs.add(n++, new Input(false, "magenta_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "magenta_carpet"));
		inputs.add(n++, new Input(false, "magenta_concrete_powder"));
		inputs.add(n++, new Input(false, "magenta_dye_from_allium", "Md"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lapis_ink_bonemeal", "Md"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lapis_red_pink", "Md"));
		inputs.add(n++, new Input(false, "magenta_dye_from_lilac", "Md"));	//Md
		inputs.add(n++, new Input(false, "magenta_dye_from_purple_and_pink", "Md"));	//Md-280
		inputs.add(n++, new Input(false, "magenta_stained_glass", "Mg"));
		inputs.add(n++, new Input(false, "magenta_stained_glass_pane"));
		inputs.add(n++, new Input(false, "magenta_terracotta", "Mt"));
		inputs.add(n++, new Input(false, "magenta_wool", "Mw"));
		inputs.add(n++, new Input(false, "magma_block"));
		inputs.add(n++, new Input(false, "magma_cream", "Ma"));
		inputs.add(n++, new Input(false, "map", "Mp"));
		inputs.add(n++, new Input(false, "melon", "Ml"));
		inputs.add(n++, new Input(false, "melon_seeds"));
		inputs.add(n++, new Input(false, "minecart", "Mc"));
		inputs.add(n++, new Input(false, "mossy_cobblestone", "Mb"));
		inputs.add(n++, new Input(false, "mossy_cobblestone_wall"));
		inputs.add(n++, new Input(false, "mossy_stone_bricks"));
		inputs.add(n++, new Input(false, "mushroom_stew"));
		inputs.add(n++, new Input(false, "nether_brick_fence"));
		inputs.add(n++, new Input(false, "nether_brick_slab"));
		inputs.add(n++, new Input(false, "nether_brick_stairs"));
		inputs.add(n++, new Input(false, "nether_bricks", "Ns"));
		inputs.add(n++, new Input(false, "nether_wart_block"));
		inputs.add(n++, new Input(false, "note_block"));			//  -300
		inputs.add(n++, new Input(false, "oak_boat"));
		inputs.add(n++, new Input(false, "oak_button"));
		inputs.add(n++, new Input(false, "oak_door"));
		inputs.add(n++, new Input(false, "oak_fence"));
		inputs.add(n++, new Input(false, "oak_fence_gate"));
		inputs.add(n++, new Input(false, "oak_planks", "Op"));
		inputs.add(n++, new Input(false, "oak_pressure_plate"));
		inputs.add(n++, new Input(false, "oak_slab", "O6"));
		inputs.add(n++, new Input(false, "oak_stairs"));
		inputs.add(n++, new Input(false, "oak_trapdoor"));
		inputs.add(n++, new Input(false, "oak_wood"));
		inputs.add(n++, new Input(false, "observer"));
		inputs.add(n++, new Input(false, "orange_banner"));
		inputs.add(n++, new Input(false, "orange_bed"));
		inputs.add(n++, new Input(false, "orange_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "orange_carpet"));
		inputs.add(n++, new Input(false, "orange_concrete_powder"));
		inputs.add(n++, new Input(false, "orange_dye_from_orange_tulip", "Od"));
		inputs.add(n++, new Input(false, "orange_dye_from_red_yellow", "Od"));	//Od
		inputs.add(n++, new Input(false, "orange_stained_glass", "Og"));		//Og-320
		inputs.add(n++, new Input(false, "orange_stained_glass_pane"));
		inputs.add(n++, new Input(false, "orange_terracotta", "Ot"));
		inputs.add(n++, new Input(false, "orange_wool", "Ow"));
		inputs.add(n++, new Input(false, "packed_ice", "Pc"));
		inputs.add(n++, new Input(false, "painting"));
		inputs.add(n++, new Input(false, "paper", "Pp"));
		inputs.add(n++, new Input(false, "pink_banner"));
		inputs.add(n++, new Input(false, "pink_bed"));
		inputs.add(n++, new Input(false, "pink_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "pink_carpet"));
		inputs.add(n++, new Input(false, "pink_concrete_powder"));
		inputs.add(n++, new Input(false, "pink_dye_from_peony", "Ky"));
		inputs.add(n++, new Input(false, "pink_dye_from_pink_tulip", "Ky"));
		inputs.add(n++, new Input(false, "pink_dye_from_red_bonemeal", "Ky"));
		inputs.add(n++, new Input(false, "pink_stained_glass", "Kg"));
		inputs.add(n++, new Input(false, "pink_stained_glass_pane"));
		inputs.add(n++, new Input(false, "pink_terracotta", "Kt"));
		inputs.add(n++, new Input(false, "pink_wool", "Kw"));
		inputs.add(n++, new Input(false, "piston", "Pi"));			//Pi
		inputs.add(n++, new Input(false, "polished_andesite"));		//  -340
		inputs.add(n++, new Input(false, "polished_diorite"));
		inputs.add(n++, new Input(false, "polished_granite"));
		inputs.add(n++, new Input(false, "powered_rail", "R9"));
		inputs.add(n++, new Input(false, "prismarine", "Pr"));
		inputs.add(n++, new Input(false, "prismarine_brick_slab"));
		inputs.add(n++, new Input(false, "prismarine_brick_stairs"));
		inputs.add(n++, new Input(false, "prismarine_bricks", "Pb"));
		inputs.add(n++, new Input(false, "prismarine_slab"));
		inputs.add(n++, new Input(false, "prismarine_stairs"));
		inputs.add(n++, new Input(false, "pumpkin_pie"));
		inputs.add(n++, new Input(false, "pumpkin_seeds"));
		inputs.add(n++, new Input(false, "purple_bed"));
		inputs.add(n++, new Input(false, "purple_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "purple_carpet"));
		inputs.add(n++, new Input(false, "purple_concrete_powder"));
		inputs.add(n++, new Input(false, "purple_dye", "Pd"));
		inputs.add(n++, new Input(false, "purple_stained_glass", "Pg"));
		inputs.add(n++, new Input(false, "purple_stained_glass_pane"));
		inputs.add(n++, new Input(false, "purple_terracotta", "Pt"));	//Pt
		inputs.add(n++, new Input(false, "purple_wool", "Pw"));			//Pw-360
		inputs.add(n++, new Input(false, "purpur_block", "Pu"));
		inputs.add(n++, new Input(false, "purpur_pillar"));
		inputs.add(n++, new Input(false, "purpur_slab", "Ps"));
		inputs.add(n++, new Input(false, "purpur_stairs"));
		inputs.add(n++, new Input(false, "quartz_block", "Qb"));
		inputs.add(n++, new Input(false, "quartz_pillar"));
		inputs.add(n++, new Input(false, "quartz_slab"));
		inputs.add(n++, new Input(false, "quartz_stairs"));
		inputs.add(n++, new Input(false, "rabbit_stew_from_brown_mushroom"));
		inputs.add(n++, new Input(false, "rabbit_stew_from_red_mushroom"));
		inputs.add(n++, new Input(false, "rail", "R9"));
		inputs.add(n++, new Input(false, "red_banner"));
		inputs.add(n++, new Input(false, "red_bed"));
		inputs.add(n++, new Input(false, "red_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "red_carpet"));
		inputs.add(n++, new Input(false, "red_concrete_powder"));
		inputs.add(n++, new Input(false, "red_dye_from_beetroot", "Rd"));
		inputs.add(n++, new Input(false, "red_dye_from_poppy", "Rd"));
		inputs.add(n++, new Input(false, "red_dye_from_rose_bush", "Rd"));	//Rd
		inputs.add(n++, new Input(false, "red_dye_from_tulip", "Rd"));		//Rd-380
		inputs.add(n++, new Input(false, "red_nether_bricks"));
		inputs.add(n++, new Input(false, "red_sandstone", "Rs"));
		inputs.add(n++, new Input(false, "red_sandstone_slab", "Ra"));
		inputs.add(n++, new Input(false, "red_sandstone_stairs"));
		inputs.add(n++, new Input(false, "red_stained_glass", "Rg"));
		inputs.add(n++, new Input(false, "red_stained_glass_pane"));
		inputs.add(n++, new Input(false, "red_terracotta", "Rt"));
		inputs.add(n++, new Input(false, "red_wool", "Rw"));
		inputs.add(n++, new Input(false, "redstone", "Re"));
		inputs.add(n++, new Input(false, "redstone_block", "Rk"));
		inputs.add(n++, new Input(false, "redstone_lamp"));
		inputs.add(n++, new Input(false, "redstone_torch", "Rr"));
		inputs.add(n++, new Input(false, "repeater", "Rp"));
		inputs.add(n++, new Input(false, "sandstone", "Ss"));
		inputs.add(n++, new Input(false, "sandstone_slab", "Sn"));
		inputs.add(n++, new Input(false, "sandstone_stairs"));
		inputs.add(n++, new Input(false, "sea_lantern"));
		inputs.add(n++, new Input(false, "shears", "Sh"));
		inputs.add(n++, new Input(false, "shield"));
		inputs.add(n++, new Input(false, "shulker_box", "Xs"));	//Xs-400
		inputs.add(n++, new Input(false, "sign"));
		inputs.add(n++, new Input(false, "slime_ball", "Sl"));
		inputs.add(n++, new Input(false, "slime_block", "Sm"));
		inputs.add(n++, new Input(false, "snow"));
		inputs.add(n++, new Input(false, "snow_block", "Sw"));
		inputs.add(n++, new Input(false, "spectral_arrow", "Sa"));
		inputs.add(n++, new Input(false, "spruce_boat"));
		inputs.add(n++, new Input(false, "spruce_button"));
		inputs.add(n++, new Input(false, "spruce_door"));
		inputs.add(n++, new Input(false, "spruce_fence"));
		inputs.add(n++, new Input(false, "spruce_fence_gate"));
		inputs.add(n++, new Input(false, "spruce_planks", "Sp"));
		inputs.add(n++, new Input(false, "spruce_pressure_plate"));
		inputs.add(n++, new Input(false, "spruce_slab", "S6"));
		inputs.add(n++, new Input(false, "spruce_stairs"));
		inputs.add(n++, new Input(false, "spruce_trapdoor"));
		inputs.add(n++, new Input(false, "spruce_wood"));
		inputs.add(n++, new Input(false, "stick", "Sk"));
		inputs.add(n++, new Input(false, "sticky_piston"));
		inputs.add(n++, new Input(false, "stone_axe"));			//  -420
		inputs.add(n++, new Input(false, "stone_brick_slab", "Sr"));
		inputs.add(n++, new Input(false, "stone_brick_stairs"));
		inputs.add(n++, new Input(false, "stone_bricks", "Sb"));
		inputs.add(n++, new Input(false, "stone_button"));
		inputs.add(n++, new Input(false, "stone_hoe"));
		inputs.add(n++, new Input(false, "stone_pickaxe", "Sx"));
		inputs.add(n++, new Input(false, "stone_pressure_plate", "Su"));
		inputs.add(n++, new Input(false, "stone_shovel"));
		inputs.add(n++, new Input(false, "stone_slab", "So"));
		inputs.add(n++, new Input(false, "stone_sword", "Sd"));
		inputs.add(n++, new Input(false, "sugar", "Sg"));
		inputs.add(n++, new Input(false, "tnt", "Tt"));
		inputs.add(n++, new Input(false, "tnt_minecart", "Tm"));
		inputs.add(n++, new Input(false, "torch", "To"));
		inputs.add(n++, new Input(false, "trapped_chest"));
		inputs.add(n++, new Input(false, "tripwire_hook", "Th"));
		inputs.add(n++, new Input(false, "turtle_helmet"));
		inputs.add(n++, new Input(false, "wheat", "Wh"));
		inputs.add(n++, new Input(false, "white_banner"));
		inputs.add(n++, new Input(false, "white_bed", "Wb"));	//Wb-440
		inputs.add(n++, new Input(false, "white_carpet"));
		inputs.add(n++, new Input(false, "white_concrete_powder"));
		inputs.add(n++, new Input(false, "white_stained_glass", "Wg"));
		inputs.add(n++, new Input(false, "white_stained_glass_pane"));
		inputs.add(n++, new Input(false, "white_terracotta", "Wt"));
		inputs.add(n++, new Input(false, "white_wool_from_string", "Ww"));
		inputs.add(n++, new Input(false, "wooden_axe", "Ax"));
		inputs.add(n++, new Input(false, "wooden_hoe", "Ho"));
		inputs.add(n++, new Input(false, "wooden_pickaxe", "Wx"));
		inputs.add(n++, new Input(false, "wooden_shovel", "Ws"));
		inputs.add(n++, new Input(false, "wooden_sword", "Wd"));
		inputs.add(n++, new Input(false, "writable_book"));
		inputs.add(n++, new Input(false, "yellow_banner"));
		inputs.add(n++, new Input(false, "yellow_bed"));
		inputs.add(n++, new Input(false, "yellow_bed_from_white_bed"));
		inputs.add(n++, new Input(false, "yellow_carpet"));
		inputs.add(n++, new Input(false, "yellow_concrete_powder"));
		inputs.add(n++, new Input(false, "yellow_dye_from_dandelion", "Yd"));
		inputs.add(n++, new Input(false, "yellow_dye_from_sunflower", "Yd"));	//Yd
		inputs.add(n++, new Input(false, "yellow_stained_glass", "Yg"));	//Yg-460
		inputs.add(n++, new Input(false, "yellow_stained_glass_pane"));
		inputs.add(n++, new Input(false, "yellow_terracotta", "Yt"));
		inputs.add(n++, new Input(false, "yellow_wool", "Yw"));
		
		//Smelting Recipes
		inputs.add(n++, new Input(true, "baked_potato", "Ba"));			//Ba-464
		inputs.add(n++, new Input(true, "black_glazed_terracotta"));
		inputs.add(n++, new Input(true, "blue_glazed_terracotta"));
		inputs.add(n++, new Input(true, "brick", "B0"));
		inputs.add(n++, new Input(true, "brown_glazed_terracotta"));
		inputs.add(n++, new Input(true, "cactus_green", "Cc"));			//Cc
		inputs.add(n++, new Input(true, "charcoal", "Ca"));				//Ca-470
		inputs.add(n++, new Input(true, "coal_from_smelting", "Co"));
		inputs.add(n++, new Input(true, "cooked_beef"));
		inputs.add(n++, new Input(true, "cooked_chicken"));
		inputs.add(n++, new Input(true, "cooked_cod"));
		inputs.add(n++, new Input(true, "cooked_mutton"));
		inputs.add(n++, new Input(true, "cooked_porkchop"));
		inputs.add(n++, new Input(true, "cooked_rabbit", "Rc"));
		inputs.add(n++, new Input(true, "cooked_salmon"));
		inputs.add(n++, new Input(true, "cracked_stone_bricks"));
		inputs.add(n++, new Input(true, "cyan_glazed_terracotta"));		//  -480
		inputs.add(n++, new Input(true, "diamond_from_smelting", "Di"));
		inputs.add(n++, new Input(true, "dried_kelp_from_smelting", "Kd"));
		inputs.add(n++, new Input(true, "emerald_from_smelting", "Em"));
		inputs.add(n++, new Input(true, "glass", "Gs"));
		inputs.add(n++, new Input(true, "gold_ingot", "Gi"));
		inputs.add(n++, new Input(true, "gold_nugget_from_smelting", "Gn"));
		inputs.add(n++, new Input(true, "gray_glazed_terracotta"));
		inputs.add(n++, new Input(true, "green_glazed_terracotta"));
		inputs.add(n++, new Input(true, "iron_ingot", "Ii"));			//Ii
		inputs.add(n++, new Input(true, "iron_nugget_from_smelting", "In"));	//In-490
		inputs.add(n++, new Input(true, "lapis_from_smelting", "Ll"));
		inputs.add(n++, new Input(true, "light_blue_glazed_terracotta"));
		inputs.add(n++, new Input(true, "light_gray_glazed_terracotta"));
		inputs.add(n++, new Input(true, "lime_dye_from_smelting", "Ld"));
		inputs.add(n++, new Input(true, "lime_glazed_terracotta"));
		inputs.add(n++, new Input(true, "magenta_glazed_terracotta"));
		inputs.add(n++, new Input(true, "nether_brick", "Nb"));
		inputs.add(n++, new Input(true, "orange_glazed_terracotta"));
		inputs.add(n++, new Input(true, "pink_glazed_terracotta"));
		inputs.add(n++, new Input(true, "popped_chorus_fruit", "Pf"));	//Pf-500
		inputs.add(n++, new Input(true, "purple_glazed_terracotta"));
		inputs.add(n++, new Input(true, "quartz", "Qz"));
		inputs.add(n++, new Input(true, "red_glazed_terracotta"));
		inputs.add(n++, new Input(true, "redstone_from_smelting", "Re"));
		inputs.add(n++, new Input(true, "sponge", "Np"));
		inputs.add(n++, new Input(true, "stone", "St"));
		inputs.add(n++, new Input(true, "terracotta", "Tc"));
		inputs.add(n++, new Input(true, "white_glazed_terracotta"));
		inputs.add(n++, new Input(true, "yellow_glazed_terracotta"));	//  -509
		
		System.out.println(" DONE!");
		
		//Take list of outputs
		System.out.print("Adding results to table...");
		
		//Complete Random
		int x = inputs.size()+0;
		int[] outputs = new int[x];
		for(int i=0; i<x; i++) {
			outputs[i] = i;
		}
		
		/*
		//Prioritize progression
		int x = inputs.size()+0;
		List<Integer> progression = new ArrayList<Integer>();
		List<Integer> junk = new ArrayList<Integer>();
		for(int i=0; i<x; i++) {
			if(inputs.get(x).getExpression().equals("")){
				junk.add(junk.size()+0,i+0);
			} else {
				progression.add(progression.size()+0,i+0);
			}
		}
		//all sphere 0 checks
		List<Integer> recipes = new ArrayList<Integer>();
		recipes.add( 0,  5);
		recipes.add( 1, 10);
		recipes.add( 2, 23);
		recipes.add( 3, 28);
		recipes.add( 4, 37);
		recipes.add( 5, 69);
		recipes.add( 6, 80);
		recipes.add( 7, 84);
		recipes.add( 8,100);
		recipes.add( 9,110);
		recipes.add(10,115);
		recipes.add(11,219);
		recipes.add(12,224);
		recipes.add(13,229);
		recipes.add(14,240);
		recipes.add(15,251);
		recipes.add(16,254);
		recipes.add(17,255);
		recipes.add(18,276);
		recipes.add(19,279);
		recipes.add(20,306);
		recipes.add(21,311);
		recipes.add(22,318);
		recipes.add(23,332);
		recipes.add(24,333);
		recipes.add(25,351);
		recipes.add(26,377);
		recipes.add(27,378);
		recipes.add(28,379);
		recipes.add(29,380);
		recipes.add(30,382);
		recipes.add(31,394);
		recipes.add(32,412);
		recipes.add(33,417);
		recipes.add(34,431);
		recipes.add(35,441);
		recipes.add(36,458);
		recipes.add(37,459);
		//all remaining checks
		n = 0;
		List<Check> checks = new ArrayList<Check>();
		checks.add(n++, new Check([],""));
		
		checks.add(n++, new Check([1,6],"Ap"));
		checks.add(n++, new Check([0,2,7,8,9],"ApCt"));
		checks.add(n++, new Check([3,4],"ApCtSk"));
		checks.add(n++, new Check([17],"BlCt"));
		checks.add(n++, new Check([19,24],"Bp"));
		checks.add(n++, new Check([18,20,25,26,27],"BpCt"));
		checks.add(n++, new Check([21,22],"BpCtSk"));
		checks.add(n++, new Check([32],"Bw|Sh"));
		checks.add(n++, new Check([33,65,288,326],"Ct"));
		checks.add(n++, new Check([35],"CtBg"));
		checks.add(n++, new Check([34,66,153,154],"CtGs"));
		checks.add(n++, new Check([13],"CtIbIi"));
		checks.add(n++, new Check([11],"CtIiRrSk"));
		checks.add(n++, new Check([15,211,225,325,439],"CtSk"));
		checks.add(n++, new Check([14],"CtSkSo"));
		checks.add(n++, new Check([29],"CtSk(Bw|Sh)"));
		checks.add(n++, new Check([30],"Ct(Ap|Bp|Dp|Op|Jp|Sp)(Bw|Sh)"));
		checks.add(n++, new Check([36],"Tc"));
		checks.add(n++, new Check([31,63],"Wb"));
		checks.add(n++, new Check([12],"Wx"));
		//complex checks
		checks.add(n++, new Check([16],"BoCtEtGsIs(Ll|IxTo)(Ar|Sa)(Dx|EcWx)(Fs|Fc)(I5I6I7I8|BsBlBz(I5(I6|I7|I8)|I6(I7|I8)|I7I8))"));	//beacon
		checks.add(n++, new Check([38],"(Bu|Dx|EcWx)(Fs|Fc)(Is|Bo(Ar|Sa))"));	//blaze powder
		*/
		
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
		
		//Complete Random
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
		
		/*
		//Prioritize progression
		
		*/
		
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