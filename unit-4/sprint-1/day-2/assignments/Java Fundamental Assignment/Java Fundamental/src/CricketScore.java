public class CricketScore {
    private static void cricket(  int one,int two, int three, int fours, int sixes) {
        int a=sixes*6;
        int b=one*1;
        int c=two*2;
        int d=three*3;
        int e=fours*4;
        int sum=a+b+c+d+e;
        System.out.println("Batsman Total Score ="+sum);

    }

    public static void main(String[] args) {
        int sixes = 7;
        int fours = 14;
        int three = 0;
        int two = 5;
        int one = 24;
        cricket(one,two, three, fours, sixes);

    }
}


