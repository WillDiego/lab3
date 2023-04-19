import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed1() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
  }
  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  }
  @Test
  public void testReversed3() {
    int[] input1 = {1, 2, 3, 4};
    int [] output = {4, 3, 2, 1};
    assertArrayEquals(output, ArrayExamples.reversed(input1));
  }
  @Test
  public void testAverage1() {
    double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
    double output = 14.0/4;
    assertEquals((Double) output, (Double) ArrayExamples.averageWithoutLowest(input));
  }
  @Test
  public void testAverage2() {
    double[] input = {1.0, 1.0, 1.0, 1.0, 5.0};
    double output = 8.0/4;
    assertEquals((Double) output, (Double) ArrayExamples.averageWithoutLowest(input));
  }
}
