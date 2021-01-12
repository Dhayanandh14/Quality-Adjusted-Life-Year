import java.util.*;
class qaly {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    double tot=0;
    int N = kbd.nextInt();
    for (int i=0;i<N;i++){
      double q = kbd.nextDouble();
      double l = kbd.nextDouble();
      tot = q*l+tot;
    }
    System.out.format("%.3f", tot);
   }
}
