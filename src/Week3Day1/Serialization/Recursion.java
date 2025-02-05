package Week3Day1;

public  class Recursion {

    public static int fibo(int n){
       if(n<=1){
           return 0;
       }
       if(n==2){
           return 1;
       }

        return fibo(n-1)+fibo(n-2);
    }

    public static int fiboByIteration(int n){
        int a=0;
        int b=1;
        int ans =0;
        if(n<=1){
          return 0;
        }
        for(int i =3; i<=n;i++){
            ans = a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
    public static void main(String[] args){
        int result = fibo(10);
        System.out.println(result);
        int ans = fiboByIteration(10);
        System.out.println(ans);
    }
}

