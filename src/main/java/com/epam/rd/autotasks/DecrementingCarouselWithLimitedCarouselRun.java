package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedCarouselRun extends CarouselRun {
    int actionLimit = DecrementingCarouselWithLimitedRun.actionLimit;
    boolean flag = false;
    int actions = 0;
    @Override
    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        actions++;
        if (actions == actionLimit) {
            flag = true;
        }
        return array[position++]--;
    }
    @Override
    public boolean isFinished() {
        if (!flag) {
            for (int var : array) {
                if (var > 0) return false;
            }
            return true;
        }
        else {
            return actions == actionLimit;
        }
    }
}

