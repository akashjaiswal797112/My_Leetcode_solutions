class Solution {

    static int subtractProductAndSum(int n) {

        int number=n;
        int a=0,prod=1,sum=0;

        while(number!=0){
            a=number%10;
            sum+=a;
            prod*=a;
            number/=10;
        }
    
        return prod-sum;



    }



    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.print(subtractProductAndSum(num));
    }

}
