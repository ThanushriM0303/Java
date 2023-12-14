public class Factorial{
  public static void main(String[] arg){
        Scanner reader=new Scanner(Sysstem.in);
        System.out.println("Enter a number");
        int n=reader.nextInt();
        int fact=1;
        if(n==0){
          System.out.println("The factorial of the number" + num + "is" + fact);
        }else if(n>0){
          for(int i=1;i<=n;i++){
                fact=fact*i;
          }System.out.println("Factorial is" + fact);
        }
    else{
      System.out.println("wrong number is been entered");
    }
  }
}

          
