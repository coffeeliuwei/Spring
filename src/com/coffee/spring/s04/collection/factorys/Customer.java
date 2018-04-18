package com.coffee.spring.s04.collection.factorys;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {

	private List<?> lists;
	private Set<?> sets;
	private Map<?, ?> maps;
	
	public Map<?, ?> getMaps() {
		return maps;
	}

	public void setMaps(Map<?, ?> maps) {
		this.maps = maps;
	}
	public Set<?> getSets() {
		return sets;
	}

	public void setSets(Set<?> sets) {
		this.sets = sets;
	}

	public List<?> getLists() {
		return lists;
	}

	public void setLists(List<?> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Customer [lists=" + lists + ", sets=" + sets + ", maps=" + maps
				+ "]";
	}

}