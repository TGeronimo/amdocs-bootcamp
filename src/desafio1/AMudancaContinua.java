package desafio1;

import java.util.Scanner;

public class AMudancaContinua {

    public static void main(String[] args) {
        double degress;
        double hour;
        double minutes;
        double seconds;
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            double degrees = leitor.nextDouble();
            if (degrees >= 90 && degrees < 180) {
                System.out.println("Boa Tarde!!");
                hour = 6.0;

            } else if (degrees >= 180 && degrees < 270) {
                System.out.println("Boa Noite!!");
                hour = 6.0;

            } else if (degrees >= 270 && degrees < 360) {
                System.out.println("De Madrugada!!");
                hour = 6.0;

            } else {
                System.out.println("Bom Dia!!");
                hour = 6.0;
            }

            minutes = degrees * 4;

            if (minutes > 60) {
                hour += (minutes / 60);
                minutes = (minutes % 60);
            }

            seconds = (minutes * 60) % 60;
            if (seconds > 59) {
                seconds = 0.0;
                minutes += 1.0;
            }

            if (hour == 24) {
                hour = 0.0;
            } else if (hour > 24) {
                hour -= 24;
            }

            System.out.printf("%02d:%02d:%02d%n", (int) hour, (int) minutes, (int) seconds);
        }

    }
}

// código que passou no teste fechado
//import java.io.IOException;
//        import java.util.Scanner;
//
//public class AMudancaContinua {
//
//    public static void main(String[] args) throws IOException {
//        Scanner leitor = new Scanner(System.in);
//        while (leitor.hasNext()) {
//            double graus = leitor.nextDouble();
//
//            if (graus <= 360) {
//                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
//                else if (    graus < 180     ) System.out.println("Boa Tarde!!");
//                else if (     graus < 270   ) System.out.println("Boa Noite!!");
//                else if (     graus < 360    ) System.out.println("De Madrugada!!");
//                else System.out.println("Bom Dia!!");
//
//                Double horas;
//                if (graus >= 270) {
//                    horas = ((graus - 270.0) * 4.0) / 60.0;
//                } else {
//                    horas = ((graus * 4.0) / 60.0) + 6.0;
//                }
//
//                Double minutos = (horas * 60.0) % 60.0;
//                Double segundos = (minutos * 60.0) % 60.0;
//
//                if (segundos > 59) {
//                    segundos = 0.0;
//                    minutos += 1.0;
//                }
//
//                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
//            }
//        }
//    }
//
//}

