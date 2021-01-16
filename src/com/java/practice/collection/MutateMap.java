package com.java.practice.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MutateMap<K, V> {
	private final Map<K,V> mutateMap;
	
	@SuppressWarnings("unchecked")
	public MutateMap(HashMap<K,V> requestmap){
		mutateMap = Collections.unmodifiableMap((Map<K, V>) requestmap.clone());
	}

	public Map<K, V> getMutateMap() {
		return mutateMap;
	}

}
