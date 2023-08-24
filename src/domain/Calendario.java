package domain;
import java.util.Scanner;


public class Calendario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int año, mes, dia;
        boolean bisiesto = false;

        System.out.println("Ingresa año: (1900 - 2099)");
        año = entrada.nextInt();

        while (!(año >= 1900 && año <= 2099)) {
            System.out.println("Año incorrecto, ingresa nuevamente: (1900 - 2099)");
            año = entrada.nextInt();
        }
        if (((año % 4 ==0) && (año % 100 != 0) || (año % 400 == 0))) {
            bisiesto = true;
        }

        System.out.println("Ingresa mes: ");
        mes = entrada.nextInt();

        while (mes < 1 && mes > 12) {
            System.out.println("Mes incorrecto, ingresa mes: (01-12");
            mes = entrada.nextInt();
        }

        switch (mes) {
            case 2:
                if (bisiesto) {
                    System.out.println("Ingresa dia: ");
                    dia = entrada.nextInt();
                    while (!(dia >= 1 && dia <= 28)) {
                        System.out.println("Ingresa dia valido ( 01 - 28)");
                        dia = entrada.nextInt();
                    }
                    {

                    }
                } else {
                    System.out.println("Ingresa dia: ");
                    dia = entrada.nextInt();
                    while (!(dia >= 1 && dia <= 29)) {
                        System.out.println("Ingresa dia valido ( 01 - 29)");
                        dia = entrada.nextInt();
                    }
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Ingresa dia: ");
                dia = entrada.nextInt();
                while (!(dia >= 1 && dia <= 31)) {
                    System.out.println("Ingresa dia valido ( 01 - 31)");
                    dia = entrada.nextInt();
                }
                break;

            case 4, 6, 9, 11:
                System.out.println("Ingresa dia: ");
                dia = entrada.nextInt();
                while (!(dia >= 1 && dia <= 31)) {
                    System.out.println("Ingresa dia valido ( 01 - 30)");
                    dia = entrada.nextInt();
                }
                break;

            default:
                System.out.println("Dato incorrecto...");
        }
        
        if(bisiesto) {
            System.out.printf("El año %d es bisiesto\n", año);
        }else {
            System.out.printf("El año %d, no es bisiesto\n", año);
        }

    }

}
