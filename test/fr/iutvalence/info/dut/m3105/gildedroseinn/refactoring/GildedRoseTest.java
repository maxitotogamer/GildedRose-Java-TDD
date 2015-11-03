package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void decrementSellInAndQualityAllDay()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		GildedRose.updateItem(item);
		Assert.assertEquals(item.getQuality(), 19);
		Assert.assertEquals(item.getSellIn(), 9);
	}
	


}