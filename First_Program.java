package Assignment1;

public class First_Program {
	public static void main(String[] args) {
        MathsOperation m = new MathsOperation();
        System.out.println(m.addTwo(5,6));;
        System.out.println(m.subTwo(9,6));;
        System.out.println(m.divide(90,9));;
        System.out.println(m.divide(9,0));;
        System.out.println(m.multiplyTwo(4,5));;
        System.out.println(m.square(6));;
        System.out.println(m.cube(9));;
        System.out.println(m.absolute(-67));;
        System.out.println(m.absolute(45));;

    }
}
class MathsOperation{
    public int addTwo(int a,int b){
        return a+b;
    }
    public int subTwo(int a,int b){
        return a-b;
    }
    public int multiplyTwo(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            System.out.println("not possible");
            return 0;
        }
        return a/b;
    }
    public int square(int a){
        return a*a;
    }
    public int cube(int a){
        return a*a*a;
    }
    public int findRemainder(int a,int b){
        return a%b;
    }
    public int absolute(int a){
        if(a<0) return -a;
        return a;
    }
}
