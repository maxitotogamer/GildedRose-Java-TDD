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
		Assert.assertEquals(item.getQuality(), 20-1);
		Assert.assertEquals(item.getSellIn(), 10-1);
	}
	
	@Test
	public void sellInNotPositiveDecrementSellInAndQualityBy2()
	{
		Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 20);
		GildedRose.updateItem(item);
		Assert.assertEquals(item.getQuality(), 20-2);
		Assert.assertEquals(item.getSellIn(), -1-1);
	}
	
	@Test
	public void qualityIsAlwaysPositive()
	{
		Item item = new Item("Conjured Mana Cake", -1, 1);
		GildedRose.updateItem(item);
		Assert.assertEquals(item.getQuality(), 0);
		Assert.assertEquals(item.getSellIn(), -1-1);
	}
	
	@Test
	public void agedBrieCase()
	{
		Item item = new Item("Aged Brie", 2, 0);
		GildedRose.updateItem(item);
		Assert.assertEquals(item.getQuality(), 0+1);
		Assert.assertEquals(item.getSellIn(), 2-1);
	}
}