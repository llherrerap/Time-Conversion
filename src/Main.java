//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hora = scanner.next();
        System.out.println(conversorHoras(hora));
    }
    public static String conversorHoras(String s){
        String[] division = s.split(":");
        String hora = division[0];
        String format =division[division.length-1].substring(2);
        if (format.equals("AM") || format.equals("am")){
            if (hora.equals("12")){
                hora="00";
            }
            return concatenarHoras(hora,division);
        } else if (format.equals("PM") || format.equals("pm")){
            if (!hora.equals("12")){
                hora = String.valueOf(Integer.parseInt(hora)+12);
            }
            return concatenarHoras(hora ,division);
        }
        return "Hora no valida";
    }
    public static String concatenarHoras(String h, String[] cadena){
        String resultado = "";
        for (int i = 1; i < cadena.length; i++) {
            resultado = resultado + ":" + cadena[i];
        }
        resultado = h.concat(resultado);
        return(resultado.substring(0,resultado.length()-2));
    }
}