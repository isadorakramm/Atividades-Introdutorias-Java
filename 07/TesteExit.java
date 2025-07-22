import java.util.Random;

class TesteExit {
  public static void main(String[] args) {
    System.out.println("program will be terminated when values are 2, 3, or 7");
    int i;
    Random number=new Random();
    while(true){
      i = number.nextInt(11);
      System.out.println("Random Number is "+i);
      if(i==2||i==3||i==7){
        System.out.println("Value is "+ i + " your program will be terminated now");
        System.exit(i);
      }
    }
  }
}