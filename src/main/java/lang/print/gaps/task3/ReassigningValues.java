package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        // ^.+(System\.out\.println\D+\d+\D+); // RAW_NUMBER_SOUT
//        1
//        10
//        100
//        15
//        6
//        4
//        1
//        10
//        100
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
