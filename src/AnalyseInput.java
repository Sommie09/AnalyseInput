
import java.io.Console;
import java.util.*;

public class AnalyseInput {

    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        Console cons;
        String line = "";
        while (!line.equals("*")
                && (cons = System.console()) != null
                && (line = cons.readLine()) != null) {
            List<String> lineList = new ArrayList<String>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }
        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());

        Set textSet = new HashSet<String>();

        textSet.addAll(text);
        Iterator iterator = textSet.iterator();
        List<DataPoint> frequencies = new ArrayList<DataPoint>();
        while (iterator.hasNext()) {
            // point to next element
            String s = (String) iterator.next();
            // get the amount of times this word shows up in the text
            int freq = Collections.frequency(text, s);
            // print out the result
            System.out.println(s + " appears " + freq + " times");
            // create the object to be stored
            DataPoint datapoint = new DataPoint(s, freq);
            // add datapoints to the list
            frequencies.add(datapoint);
        }

        Collections.sort(frequencies, Collections.reverseOrder(new SortByValue()));
        System.out.println("Results sorted");
        for (int i=0; i<frequencies.size(); i++)
            System.out.println(frequencies.get(i).value + " times for word " + frequencies.get(i).key);

    }


    }


