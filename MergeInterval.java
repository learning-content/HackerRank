import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeInterval {
	
	static class Interval implements Comparable<Interval>
    {
        public int start;
        public int end;

        public Interval(final int start, final int end)
        {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Interval to)
        {
            return this.start - to.start;
        }
    }

    public static List<Interval> mergeIntervals(final List<Interval> inputIntervals)
    {
        if(inputIntervals == null || inputIntervals.size() == 0)
            return null;

        Collections.sort(inputIntervals);
        final List<Interval> result = new ArrayList<Interval>();

        result.add(inputIntervals.get(0));
        int resultIndex = 1;

        for(int i = 1; i < inputIntervals.size(); i++)
        {
            final Interval currInt = inputIntervals.get(i);
            final Interval resLast = result.get(resultIndex - 1);

            // overlap detected
            if(resLast.end >= currInt.start)
            {
                // extend current interval
                if (currInt.end > resLast.end)
                {
                    resLast.end = currInt.end;
                }
                // else do nothing
            }
            else
            {
                final Interval newInterval = new Interval(currInt.start, currInt.end);
                result.add(resultIndex, newInterval);
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(final String[] args)
    {
        final List<Interval> intervals1 = new ArrayList<Interval>();
        intervals1.add(new Interval(6,8));
        intervals1.add(new Interval(1,9));
        intervals1.add(new Interval(2,4));
        intervals1.add(new Interval(4,7));

        final List<Interval> result1 = mergeIntervals(intervals1);
        for(final Interval i : result1)
            System.out.print(String.format("%d-%d", i.start, i.end));

        System.out.println();

        final List<Interval> intervals2 = new ArrayList<Interval>();
        intervals2.add(new Interval(6,8));
        intervals2.add(new Interval(1,3));
        intervals2.add(new Interval(2,4));
        intervals2.add(new Interval(4,7));

        final List<Interval> result2 = mergeIntervals(intervals2);
        for(final Interval i : result2)
            System.out.print(String.format("%d-%d\t", i.start, i.end));

        System.out.println();

        final List<Interval> intervals3 = new ArrayList<Interval>();
        intervals3.add(new Interval(1,3));
        intervals3.add(new Interval(7,9));
        intervals3.add(new Interval(4,6));
        intervals3.add(new Interval(10,13));

        final List<Interval> result3 = mergeIntervals(intervals3);
        for(final Interval i : result3)
            System.out.print(String.format("%d-%d\t", i.start, i.end));

        System.out.println();
    }

}
