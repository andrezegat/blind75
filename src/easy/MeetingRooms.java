package easy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {

        System.out.println(new MeetingRooms().canAttendMeetings());

    }

    public boolean canAttendMeetings() {
        Range[] ranges = new Range[]{new Range(0, 30), new Range(5, 10), new Range(15, 20)};
        //Range[] ranges2 = new Range[]{new Range(7, 10), new Range(2, 4)};

        Arrays.sort(ranges, (o1, o2) -> o1.start - o2.start);

        for (int i = 1; i < ranges.length; i++) {

            if( ranges[i].start < ranges[i - 1].end ) {
                return false;
            }
        }

        return true;
    }

    class Range {

        public int start, end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
