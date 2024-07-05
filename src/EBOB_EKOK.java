import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int num1 = input.nextInt();
        System.out.print("2.Sayı: ");
        int num2 = input.nextInt();
        int minNum, maxNum, ebob = 1, ekok = 1;
        if (num1 > num2) {
            minNum = num2;
            maxNum = num1;
        } else {
            minNum = num1;
            maxNum = num2;
        }
        //ebob
        for (int i = 1; i <= minNum; i++) {
            if (maxNum % i == 0 && minNum % i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB: " + ebob);

        //eğer kuçük sayıyı azaltarak ebob bulursak program genelde daha az işlem yapmış olur
        for (int i=minNum;i>=1;i--){
            if(maxNum%i==0&&minNum%i==0){
                ebob=i;
                break;
            }
        }
        System.out.println("Pratik EBOB: "+ebob);


        //ekok
        for(int i=maxNum;i<=maxNum*minNum;i++){
            if (i%maxNum==0 && i%minNum==0){
                ekok=i;
                break;
            }
        }
        System.out.println("EKOK: "+ekok);

        //pratik ekok --- EKOK=(num1*num2)/EBOB
        System.out.println("Pratik EKOK: "+(num1*num2)/ebob);

    }
}