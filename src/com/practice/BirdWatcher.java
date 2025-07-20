package com.practice;

import java.util.Arrays;

public class BirdWatcher {
    public int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = Arrays.copyOf(birdsPerDay, birdsPerDay.length);
    }

    public int[] getLastWeek() {
        int[] lastWeekCounts = Arrays.copyOf(birdsPerDay, birdsPerDay.length + 1);
        lastWeekCounts[lastWeekCounts.length - 1] = 0;
        return lastWeekCounts;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int days) {
        int count = 0;
        for (int i = 0; i < days && i < birdsPerDay.length; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println("Last Week's Counts: " + Arrays.toString(birdCount.getLastWeek()));
        System.out.println("Today's Count: " + birdCount.getToday());

        birdCount.incrementTodaysCount();
        System.out.println("Updated Today's Count: " + birdCount.getToday());

        System.out.println("Has Day Without Birds: " + birdCount.hasDayWithoutBirds());

        int days = 4;
        System.out.println("Count for First " + days + " Days: " + birdCount.getCountForFirstDays(days));

        System.out.println("Busy Days: " + birdCount.getBusyDays());
    }

    /*public int getCountForFirstDays() {
    }*/
}

