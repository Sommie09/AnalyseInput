import java.util.Comparator;

public class SortByValue implements Comparator <DataPoint> {

    // Used for sorting in ascending order
    public int compare(DataPoint a, DataPoint b)
    {
        return a.value - b.value;
    }
}
