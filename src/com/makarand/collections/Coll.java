package com.makarand.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Coll {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        //hashSet.a
        
        Vector<String> vector = new Stack<>();
        
        List<String> list = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        
        Map<String, Integer> map = new HashMap<>();
        
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();
        
        NavigableSet<Character> navigableSet = new TreeSet<>();
        
        Stack<String> stack = new Stack<>();
        
        Deque<Long> deque = new ArrayDeque<>();
        
        Collection<Byte> collection = Collections.emptyList();
        
       /* System.out.println(""+hashSet+vector+list+queue+map+navigableMap+
                        navigableSet+stack+deque+collection);*/
        
       // doublyLinked();
        
        //sets();
        
        Comparator<String> byValue =  Coll::compareByValue;
        
        Comparator<Integer> byValue2 =  Coll::compareByValue;
        
        Coll col = new Coll();
        
        Comparator<Integer> byValue3 = col::compareByInstance;
        
        Comparator<String> byValue4 = col::compareByInstance;
        
       Consumer<List<Integer>> methodref1 = Collections::sort;
    }
    
    public static void doublyLinked(){
        
        ArrayDeque<String> strings = new ArrayDeque<>();
        
        strings.add("1");
        strings.addFirst("0");
        strings.addLast("Last");
        strings.offer("2");
        strings.offerFirst("offerFirst");
        strings.offerLast("offerLast");
        strings.push("push1");
        strings.addAll(Arrays.asList("1st","2nd","3rd","4th","5th"));
        String pop = strings.pop();
        String poll = strings.poll();
        String pollFirst = strings.pollFirst();
        String pollLast = strings.pollLast();
        String remove = strings.remove();
        String removeFirst = strings.removeFirst();
        String removeLast = strings.removeLast();
        
        System.out.println("pop "+pop);
        System.out.println("poll "+poll);
        System.out.println("pollFirst "+pollFirst);
        System.out.println("pollLast "+pollLast);
        System.out.println("remove "+remove);
        System.out.println("removeFirst "+removeFirst);
        System.out.println("removeLast "+removeLast);
        
        System.out.println(strings);
        
        Predicate<String> methodRef3 = String::isEmpty;
        
        Predicate<String> methodRef4 = pop::startsWith;
        
        if(methodRef4.test("p")){
            System.out.println(methodRef4.getClass().getSimpleName());
        }
    }
    
    public static void sets(){
        
        Map<String, Integer> map = new TreeMap<>();
        map.put("Makarand", 27);
        
        Set<String> keySet = map.keySet();
        
        System.out.println(keySet.getClass().getSimpleName());
        
        
        Set<String> set = Collections.unmodifiableSet(keySet);
        
        System.out.println(set.getClass().getSimpleName());
        
        
    }
    
    public static <T> int compareByValue(T s1, T s2){
        
        return 1;
        
    }
    
 public <T> int compareByInstance(T s1, T s2){
        
        return 1;
        
    }

}
