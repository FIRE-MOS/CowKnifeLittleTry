Class NUM{
 public int a;//miss int
 public int b;
}
Public Class SwapTest{
  public static swaptest(Num num){//miss static ,because it is used in static method
     int temp;
     temp=num.a;
     num.a=num.b;
     num.b=temp;
   
  }
  public static void main(String[] args){
    Num num=new Num();
    num.a=6;
    num.b=9;
    SwapTest st=new SwapTest();//dont need to generate a object ,because it is inside class SwapTest
    st.swaptest(num);
    System.out.println(num.a);
    System.out.println(num.b);
  }
}
