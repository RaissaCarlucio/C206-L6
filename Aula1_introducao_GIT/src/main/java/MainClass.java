import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO ALMOXERIFADO");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("FACA A SUA REQUISICAO:");

        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente) {
            case "RESISTOR":

                System.out.println("Requisitou um resistor");
                break;

            case "CAPACITOR":

                System.out.println("Requisitou um capacitor");
                break;

            case "PROTOBOARD":

                System.out.println("Requisitou um protoboard");
                break;

            default:
                System.out.println("INVALIDO");
                break;
        }
    }
}
