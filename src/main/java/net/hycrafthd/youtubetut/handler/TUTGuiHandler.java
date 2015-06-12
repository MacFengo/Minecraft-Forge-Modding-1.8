package net.hycrafthd.youtubetut.handler;

import net.hycrafthd.youtubetut.TUTMain;
import net.hycrafthd.youtubetut.gui.TUTGuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class TUTGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		if(ID == TUTMain.tutguiid) {
			return new TUTGuiScreen();
		}
		return null;
	}

}
