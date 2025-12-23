class Calculation{
    // achieved by changing the arguments(not jus the return type)
    // the compiler needs different signatures
    public int add(int a, int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public int add(int[] num){
        var result=0;
        for(int i=0;i<num.length;i++){
            result+=num[i];
        }
        return result;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
         Calculation c=new Calculation();
         System.out.println(c.add(1,2));
         System.out.println(c.add(new int[]{1,2,3,4}));
         System.out.println(c.add(2.303F,2332.709F));
    }
}
