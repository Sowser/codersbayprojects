import java.util.Scanner;

public class basicsInputOutput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName;
        String lastname;
        int age;
        String gender;
        String birthday;
        double gradePointAverage;
        boolean married;

        System.out.println("Hallo. Dieses Programm fragt deine persönlichen Daten ab.");
        System.out.println("Fangen wir mit deinem Namen an. Gib bitte im ersten Feld deinen Vor und im zweiten Feld deinen Nachnamen ein.");
        firstName=sc.next();
        lastname=sc.next();

    }
}
