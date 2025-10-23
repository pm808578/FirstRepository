package IQOct_19;

public class FibonacciSeriesTillTENNo {

    static void main(String[] args) {// previous 2 nos sum is equal to 3rd no is fibonaci

        int firstNo=0;
        int secondNo=1;
        int ThirdNo = 0;
        System.out.print(firstNo+"  ");
        System.out.print(secondNo+" ");
                for (int i=1; i<=10; i++)
                {
                    ThirdNo= firstNo+secondNo;
                    System.out.print(ThirdNo+ " ");
                    firstNo=secondNo;
                    secondNo=ThirdNo;

                }
    }
}
