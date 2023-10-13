package test;

import junit.framework.TestCase;
import org.junit.Test;

public class MatrixTest extends TestCase {

    @Test
    public void determinantTest1(){

        double[][] forMatrix = {{1,2,3},
                                {4,5,6},
                                {1,2,3}};

        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    @Test
    public void determinantTest2(){

        double[][] forMatrix = {{-1,-2,-3},
                                {-4,-5,-6},
                                {-1,-2,-3}};

        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }
}
