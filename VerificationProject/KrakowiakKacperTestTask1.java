// Student Name:
// Student Id:
// Description: Junit Black box test case for Rate and Period
package cm;
import java.util.stream.DoubleStream;

public class KrakowiakKacperTestTask1 {

    public static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    public static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

}