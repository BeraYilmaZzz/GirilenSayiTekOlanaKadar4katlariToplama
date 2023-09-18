import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Değer giriniz :");
            n = inp.nextInt();
            if(n%4==0 && n%2== 0){
                count = count + n;
            }
        }while (n%2==0) ;
        System.out.println("Değer ="+ count);
    }
}
