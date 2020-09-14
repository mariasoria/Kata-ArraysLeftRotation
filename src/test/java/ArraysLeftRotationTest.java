import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysLeftRotationTest {

    @Test
    public void arrayLeftRotation_test01 (){
        assertArrayEquals(new int[]{5, 1, 2, 3, 4,}, ArraysLeftRotation.arraysLeftRotation(new int[] {1,2,3,4,5}, 4));
    }

    @Test
    public void arrayLeftRotation_test02 (){
        assertArrayEquals(new int[] {5,4,3,2,1}, ArraysLeftRotation.arraysLeftRotation(new int[] {5,4,3,2,1}, 5));
    }

    @Test
    public void arrayLeftRotation_test03 (){
        assertArrayEquals(new int[] {3,2, 1, 5, 4}, ArraysLeftRotation.arraysLeftRotation(new int[] {5,4,3,2,1}, 2));
    }
}
