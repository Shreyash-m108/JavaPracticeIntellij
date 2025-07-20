package com.practice;

import java.util.*;

    class StaticHashing {
        private static final int NUM_BUCKETS = 8;
        private HashMap<Integer, List<String>> hashTable;

        public StaticHashing() {
            hashTable = new HashMap<>();
            for (int i = 0; i < NUM_BUCKETS; i++) {
                hashTable.put(i, new ArrayList<>());
            }
        }private int calculateHash(String deptName) {
            int hash = 0;
            if (deptName.equals("Music")) {
                hash = 1;
            } else if (deptName.equals("History")) {
                hash = 2;
            } else if (deptName.equals("Physics")) {
                hash = 3;
            } else if (deptName.equals("Finance")) {
                hash = 4;
            } else {
                for (char c : deptName.toCharArray()) {
                    String binary = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
                    hash += Integer.parseInt(binary, 2);
                }
                hash %= NUM_BUCKETS;
            }
            return hash - 1;
        }

        public void insert(String deptName) {
            int bucket = calculateHash(deptName);
            List<String> bucketList = hashTable.get(bucket);
            bucketList.add(deptName);
            hashTable.put(bucket, bucketList);
        }

        public void displayHashTable() {
            System.out.println("Bucket 1: Music");
            System.out.println("Bucket 2: History");
            System.out.println("Bucket 3: Physics");
            System.out.println("Bucket 4: Finance");

            for (int i = 0; i < NUM_BUCKETS; i++) {
                if (i >= 4) {
                    System.out.print("Bucket " + (i + 1) + ": ");
                } else {
                    continue;
                }
                List<String> bucketList = hashTable.get(i);
                for (String deptName : bucketList) {
                    System.out.print(deptName + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            StaticHashing staticHashing = new StaticHashing();

            staticHashing.insert("Music");
            staticHashing.insert("History");
            staticHashing.insert("Physics");
            staticHashing.insert("Finance");
            // Insert more departments as needed

            staticHashing.displayHashTable();
        }
    }

