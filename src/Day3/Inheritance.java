package Day3;
class MultiLevelInheritance{
    class TwoMultiple{
        protected int num1;
        protected int num2;

        TwoMultiple(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }

        public int mul(){
            return num1*num2;
        }

    }
    class ThreeMultiple extends TwoMultiple {
        protected int num3;

        int m2;

        ThreeMultiple(int num1, int num2,int num3) {
            super(num1, num2);
            m2=super.mul();
            this.num3 = num3;
        }



        public int mul3(){
            return m2*num3;
        }

    }
    class FourMultiple extends ThreeMultiple {
        protected int num4;
        int mul3Res;
        FourMultiple(int num1, int num2, int num3, int num4){
            super(num1,num2, num3);
            this.num4 =num4;
            mul3Res = super.mul3();
        }

        public int mul4(){
            return mul3Res*num4;
        }
    }
}
public class Inheritance {


    public static void main (String[] args){
        MultiLevelInheritance objM2 = new MultiLevelInheritance();
        MultiLevelInheritance.FourMultiple objM = objM2.new FourMultiple(2,2,2,2);
        int ans =  objM.mul4();
        System.out.println(ans);
    }
}
