// can you remember how to set up your main function?
public class JavaBuzz {
  public static void main(String[] args) {
    for(int i=1; i<101; i++){
      // "JavaBuzz" if divisible by 15
      if(i % 5 == 0 && i % 3 == 0){
        System.out.println("JavaBuzz");
      // "Java" if divisible by 3
      }else if(i % 3 == 0){
        System.out.println("Java");
      // "Buzz" if divisible by 5
      }else if(i % 5 == 0){
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }
}
