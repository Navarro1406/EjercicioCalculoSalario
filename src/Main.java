import java.util.Scanner;/*Importo la biblioteca para usar el Scanner*/

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); /*Defino clase para capturar valores por teclado*/
    String NombreEmpledo = "";
    String DocumentoEmpleado = "";
    double SalarioBruto = 0;
    double SalarioNeto = 0;
    double ValorHora = 0;
    double CantidadHoras = 0;
    double DeduccionSalud = 0;
    double DeduccionPension = 0;
    double HorasExtras = 0;
    double ValorHorasExtras = 0;
    double Bonificacion = 0;
    double FondoSolidaridadPensional = 0;
    double ValorRetencionFuente = 0;
    double AuxilioTransporte = 0;
    double SalarioMinimo = 0;

    System.out.println("Ingrese el nombre del empleado");
    NombreEmpledo = sc.nextLine();
    System.out.println("Ingrese el documento del empleado");
    DocumentoEmpleado = sc.nextLine();
    System.out.println("Ingrese el valor de la hora");
    ValorHora = sc.nextDouble();
    System.out.println("Ingrese la cantidad de horas");
    CantidadHoras = sc.nextDouble();
    System.out.println("Ingrese el valor del salaro minimo actual");
    SalarioMinimo = sc.nextDouble();


    if (CantidadHoras >= 24){
        System.out.println("Se le puede pagar al empleado");
        SalarioBruto = ValorHora * CantidadHoras;
        DeduccionPension = SalarioBruto * 0.04;
        DeduccionSalud = SalarioBruto * 0.04;
        if ( SalarioBruto <= (SalarioMinimo*2)){
            AuxilioTransporte = 200000;
            Bonificacion = SalarioBruto * 0.1;
        }else {
            AuxilioTransporte = 0;
            Bonificacion = 0;
        }
        if (CantidadHoras > 96){
            HorasExtras = CantidadHoras - 96;
            ValorHorasExtras = (ValorHora * 0.25) * HorasExtras;
        }
        System.out.println("Detalle de pago " + NombreEmpledo);
        System.out.println("El salario bruto del empleado: " + NombreEmpledo + " es " + SalarioBruto);
        System.out.println("La deduccion por pension es: " + DeduccionPension);
        System.out.println("La deduccion por salud es: " + DeduccionSalud);
        System.out.println("El auxilio de transporte es: " + AuxilioTransporte);
        System.out.println("La bonificacion es: " + Bonificacion);
        System.out.println("El pago de las horas extras es: " + HorasExtras);
        System.out.println("El salario neto es: " + (SalarioBruto - DeduccionPension - DeduccionSalud + AuxilioTransporte + Bonificacion + ValorHorasExtras));
    } else {
        System.out.println("Le faltan " + (24 - CantidadHoras) + "horas de trabajo");

    }

    }

}