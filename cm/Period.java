package cm;

import cm.KrakowiakKacperTestTask1;


public class Period {
    int start;
    int end;

    public Period(int start, int end) {
        if (start < 0 || start >= 24 || end <= 0 || end > 24 || start >= end) {
            throw new IllegalArgumentException("Invalid period hours");
        }
        this.start = start;
        this.end = end;
    }

    public boolean overlaps(Period period){
        return this.start < period.end && this.end > period.start;
    }

    public int duration(){
        return this.end - this.start;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }



}
