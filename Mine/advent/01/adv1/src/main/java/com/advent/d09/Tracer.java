package com.advent.d09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Tracer {
//    private Map<Integer, TreeSet<Integer>> tailsFootPrints = new HashMap<Integer, TreeSet<Integer>>();
      private Map<Integer,TreeSet<Integer>> tailsFootPrints = new HashMap<>();
      public static final Logger logger = LoggerFactory.getLogger(Tracer.class);
      int count = 0;
      TreeSet <Integer> tempList;

        public void addTo(int x, int y) {

        if (tailsFootPrints.containsKey(x)) {
            tempList = tailsFootPrints.get(x);
        } else{
            tempList = new TreeSet<>();
        }
        tempList.add(y);
        tailsFootPrints.put(x, tempList);

//           logger.info("Tracer ({}:{}) kartas {}, dydis {}", x,y,count++, count());

    }

    public int count() {
        int total = 0;
        Set<Integer> keys = tailsFootPrints.keySet();
        for (Integer key : keys) {
            total += tailsFootPrints.get(key).size();
        }
        return total;
    }

}



