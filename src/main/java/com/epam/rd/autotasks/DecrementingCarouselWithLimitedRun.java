package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    static int actionLimit;
    private int carouselRunCounter = 0;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit =actionLimit;
    }
    @Override
    public CarouselRun run(){
        if (carouselRunCounter == 0) {
            isRun = true;
            carouselRunCounter++;
            return new DecrementingCarouselWithLimitedCarouselRun();
        }
        return null;
    }
}

