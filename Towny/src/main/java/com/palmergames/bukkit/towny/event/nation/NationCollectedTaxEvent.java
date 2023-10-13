package com.palmergames.bukkit.towny.event.nation;

import com.palmergames.bukkit.towny.object.Nation;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class NationCollectedTaxEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Nation nation;
	
	private final double taxCollected;
	
	public NationCollectedTaxEvent(Nation nation, double taxCollected) {
		this.nation = nation;
		this.taxCollected = taxCollected;
	}

	public Nation getNation() {
		return nation;
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
