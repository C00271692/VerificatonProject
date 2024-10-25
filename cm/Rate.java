package cm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Rate {
    CarParkKind kind;
    ArrayList<Period> reducedPeriods;
    ArrayList<Period> normalPeriods;
    BigDecimal normalRate;
    BigDecimal reducedRate;

    public BigDecimal calculate(Period periodStay) {
        return null;
        }



    public Rate(CarParkKind kind, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods, BigDecimal normalRate, BigDecimal reducedRate) {

        }



    private boolean hasOverlappingPeriods(ArrayList<Period> periods) {

        return false;
    }

    private boolean hasOverlappingPeriods(ArrayList<Period> periods1, ArrayList<Period> periods2) {

        return false;
    }
}