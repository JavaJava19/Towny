package com.palmergames.bukkit.towny.event.resident;

import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ResidentCollectedTaxEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Town town;
	
	private final double taxCollected;
	
	public ResidentCollectedTaxEvent(Town town, double taxCollected) {
		this.town = town;
		this.taxCollected = taxCollected;
	}

	public Town getTown() {
		return town;
	}

	public double getTaxCollected() {
		return taxCollected;
	}

	@NotNull
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
