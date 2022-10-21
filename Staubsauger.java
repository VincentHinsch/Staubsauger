package staubsauger;

import java.util.Scanner;

public class Staubsauger {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Wie viele Krümmel möchtest du einsaugen? : ");

        int krümmelAnzahl = scanner.nextInt();



        try {
            BeutekKapazität bk = createBeutekKapazität(krümmelAnzahl);
            System.out.println("Der Beutel hat genug platz, du kannst weiter saugen.");
        }
        catch (BeutelVoll e) {
            System.out.println("Der Beutel ist voll!");
        }
    
    }


    private static BeutekKapazität createBeutekKapazität(int a) {
        if(a >= 100)
            throw new BeutelVoll();



        return new BeutekKapazität();
    }
}

class BeutekKapazität {
}

class BeutelVoll extends RuntimeException {
}



