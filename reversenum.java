public class reversenum{
    public static void main(String []args){
        int num=345;
        reversenum(num);
    }
    public static void reversenum(int num){
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reversed number="+rev);
    }
    
    
}