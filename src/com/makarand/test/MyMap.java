package com.makarand.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K, V> {
	
	private HashMap<K, V> myMap = new HashMap<K, V>();

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return myMap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return myMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return myMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return myMap.containsValue(value);
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return myMap.get(key);
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return myMap.put(key, value);
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return myMap.remove(key);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		myMap.putAll(m);
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		myMap.clear();
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return myMap.keySet();
		
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return myMap.values();
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return myMap.entrySet();
	}
}
