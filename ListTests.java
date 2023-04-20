import java.lang.reflect.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;
public class ListTests {
    @Test
    public void mergeTest() {
        String[] a = {"a", "c", "e", "g"};
        String[] b = {"b", "d", "f"};
        String[] c = {"a", "b", "c", "d", "e", "f", "g"};
        List<String> sorted1 = new ArrayList<>();
        sorted1 = Arrays.asList(a);
        List<String> sorted2 = new ArrayList<>();
        sorted2 = Arrays.asList(b);
        List<String> output =  new ArrayList<>();
        output = Arrays.asList(c);
        

        assertEquals(output, ListExamples.merge(sorted1,sorted2));
    }
    @Test
    public void check() {
        String[] a = {"a1", "c", "a0", "g"};
        String[] c = {"a1", "a0"};
        
        List<String> sorted1 = new ArrayList<>();
        sorted1 = Arrays.asList(a);
        List<String> output =  new ArrayList<>();
        output = Arrays.asList(c);

        assertEquals(output, ListExamples.filter(sorted1, new SC()));
    }
}
