import java.util.Scanner;
//eso eso 
class Main {
String tempSTR;
int tempINT;
Ctrl ctrl = new Ctrl();

public static void main(String[] args) {
 menu();
 }
public static void menu() {
 int seleccion = -1;
 do {
   System.out.println("1. Inicializar programa");
   System.out.println("2. Registrar laboratorio");
   System.out.println("3. Listar laboratorios");
   System.out.println("4. Registrar Estudiante");
   System.out.println("5. Listar Estudiantes");
   System.out.println("0. Salir");
   seleccion = seleccionINT();
   switch (seleccion) {
     case 1:
     break;
     case 2:
     pedirDatosLab();
     dl.CL.registrarEstudiante();
     break;
     case 3:
     break;
     case 4:
     break;
     case 5:
     break;
     case 0:
     break;
     default:
     System.out.println("Opcion Invalida, intente denuevo");
     break;
     } // switch case END
   } while (seleccion != 0);
 } // menu() END
public static int seleccionINT() {
 Scanner in = new Scanner(System.in);
 int seleccion = in.nextInt();
 return seleccion;
 }
public static String selecccionSTR() {
 Scanner in = new Scanner(System.in);
 String seleccion = in.next();
 return seleccion;
 }
public static void p(String x) {
 System.out.println(x);
 }
public static void inicializar() {
 p("Digite la cantidad de laboratorios");      
 CL.initArrays(seleccionINT()); 
 }
public static void pedirDatosLab() {
 String tempSTR;
 p("Codigo del laboratorio");
 tempSTR = selecccionSTR();
 p("Nombre del laboratorio");
 tempSTR += "," + selecccionSTR();
 p("Capacidad del laboratorio");
 tempSTR += "," + selecccionSTR();
 p("Curso del laboratorio");
 tempSTR += "," + selecccionSTR();
 CL.registrarLab(tempSTR);
 }
public static void listaLabs() {
 String[] data = CL.bulkLab();
 for (int i = 0; i < data.length; i++) { 
 p(" - " + data[i]) ;}
 }
public static void pedirDatosEstudiante() {
 String tempSTR;
 p("Codigo del estudiante");
 tempSTR = selecccionSTR();
 p("Nombre del estudiante");
 tempSTR += "," + selecccionSTR();
 p("Capacidad del estudiante");
 tempSTR += "," + selecccionSTR();
 p("Curso del estudiante");
 tempSTR += "," + selecccionSTR();
 CL.registrarEstudiante(tempSTR);
 }
public static void listaStu() {
 for (int i = 0; i < CL.stu.length; i++) { 
 p(" - " + CL.stu[i]) ;}
 }
//
}