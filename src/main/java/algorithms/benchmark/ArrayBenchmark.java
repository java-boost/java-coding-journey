package algorithms.benchmark;

import algorithms.TwoSum;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Setup;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime) // Measure average time per execution
@OutputTimeUnit(TimeUnit.MICROSECONDS) // Output in microseconds
@State(Scope.Thread) // Each thread has its own copy of variables
@Warmup(iterations = 3, time = 1) // 3 warm-up rounds to let JIT optimize
@Measurement(iterations = 5, time = 1) // 5 real rounds for measurement
@Fork(1) // Run in a separate JVM process
public class ArrayBenchmark {

    @Param({"10","100","1000","10000", "100000"}) // Run the test for two different sizes
    private int N;

    private int[] primitiveArray;

    @Setup // Runs once before the benchmarks
    public void setup() {
        primitiveArray = new int[N];
        for (int i = 0; i < N; i++) {
            primitiveArray[i] = i;
        }
    }

    @Benchmark
    public int[] testTwoSum() {
        TwoSum twoSum = new TwoSum();
        return twoSum.twoSum(primitiveArray,10000); // Returning the sum prevents "Dead Code Elimination"
    }

    @Benchmark
    public int[] testTwoSumMap() {
        TwoSum twoSum = new TwoSum();
        return twoSum.twoSumWithMap(primitiveArray,10000); // Returning the sum prevents "Dead Code Elimination"
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}