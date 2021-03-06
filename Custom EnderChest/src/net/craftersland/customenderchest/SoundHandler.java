package net.craftersland.customenderchest;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundHandler {
	
	@SuppressWarnings("unused")
	private EnderChest pl;
	
	public SoundHandler(EnderChest pl) {
		this.pl = pl;
	}
	
	public void sendAnvilLandSound(Player p) {
		if (EnderChest.is19Server == true) {
			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_LAND, 1F, 1F);
		} else {
			p.playSound(p.getLocation(), Sound.valueOf("ANVIL_LAND"), 1F, 1F);
		}
	}
	
	public void sendCompleteSound(Player p) {
		if (EnderChest.is19Server == true) {
			p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1F, 1F);
		} else {
			p.playSound(p.getLocation(), Sound.valueOf("LEVEL_UP"), 1F, 1F);
		}
	}
	
	public void sendEnderchestCloseSound(Player p) {
		if (EnderChest.is19Server == true) {
			p.playSound(p.getLocation(), Sound.BLOCK_ENDERCHEST_CLOSE, 1F, 1F);
		} else {
			p.playSound(p.getLocation(), Sound.valueOf("CHEST_CLOSE"), 1F, 1F);
		}
	}
	
	public void sendEnderchestOpenSound(Player p) {
		if (EnderChest.is19Server == true) {
			p.playSound(p.getLocation(), Sound.BLOCK_ENDERCHEST_OPEN, 1F, 1F);
		} else {
			p.playSound(p.getLocation(), Sound.valueOf("CHEST_OPEN"), 1F, 1F);
		}
	}
	
	public void sendFailedSound(Player p) {
		if (EnderChest.is19Server == true) {
			p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 3F, 3F);
		} else {
			p.playSound(p.getLocation(), Sound.valueOf("NOTE_PLING"), 3F, 3F);
		}
	}

}
