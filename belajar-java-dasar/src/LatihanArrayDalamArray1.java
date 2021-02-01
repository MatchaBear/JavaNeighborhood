import java.util.Arrays;

public class LatihanArrayDalamArray1 {
    public static void main(String[] args){
        String[][] merekMobil = new String[2][3]; // array[2][3] itu artinya indexnya maks = [1][2]
        merekMobil[0][0]="Kijang";
        merekMobil[0][1]="Innova";
        merekMobil[0][2]="Ertiga";
        merekMobil[1][0]="Corolla";
        merekMobil[1][1]="Camry";
        merekMobil[1][2]="Corona";
        // merekMobil[1][3]="Crown";

        System.out.println(merekMobil[1][2]);

        String[][] merekLaptop = new String[][]{
                {"Thinkpad","Ideapad"},
                {"ProCurve","ProLiant"}
        };

        System.out.println(merekLaptop[0][1]);
        System.out.println(merekLaptop[1][0]);

        String[][] merekHeadset = {
                {"Klipsch","Sennheiser"},
                {"JBL","Bose"},
                {"Pioneer","Altec"}
        };

        System.out.print(merekHeadset[1][0]+" ");
        System.out.print(merekHeadset[0][0]+" ");
        System.out.println(merekHeadset[2][1]);

        merekLaptop[0][1] = null;
        System.out.println(merekLaptop[0][1] + " <-- tadinya Ideapad");
        System.out.println(merekLaptop[1][0]);

        // test array offstring:
        System.out.println(merekLaptop[0]); // ngeprint data yg tidak enak dibaca.

        String[][] merekSusu = new String[2][2];
        merekSusu[0][0]="Prenagen";
        merekSusu[0][1]="Dancow";
        merekSusu[1][0]="Sustagen";
        merekSusu[1][1]="Marigold";
    }

}
