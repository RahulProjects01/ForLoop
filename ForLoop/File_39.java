//-------------------------------------- 123---- 432 revarce number --------------------------------------------------------------------------

// Program:-

public class File_39 {
    public static void main(String[] args) {
        int num=123,rem,sum1=0,sum = 0;
        for(;num>0;)
        {
            rem = num%10;
            sum = sum * 10 + rem+1;
            num = num/10;
        }
        for(;sum>0;)
        {
            rem = sum%10;
            sum1=sum1*10+rem;
            sum = sum/10;
        }
        System.out.println(sum1);
    }
}

