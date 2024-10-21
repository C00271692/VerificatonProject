import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cm.KrakowiakKacperTestTask1;

import static org.junit.jupiter.api.Assertions.*;



public class Period {
    private int start;
    private int end;

    public Period(int start, int end) {
        if (start < 0 || start >= 24 || end <= 0 || end > 24 || start >= end) {
            throw new IllegalArgumentException("Invalid period hours");
        }
        this.start = start;
        this.end = end;
    }

    public boolean overlapos(Period period){
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
