import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ProyectoTecnicaProgramacion{
  
  // En esta clas se captura la fecha y hora en la que se recoge la información
    static class DateItem {
        String datetime;
       

        DateItem(String date) {
            this.datetime = date;
        }
        
        
    }
    
    // Esta clase captura el nombre de la persona que suministra la información
    static class NombresItem {
       
        String nombre;
        

        NombresItem(String nombre) {
            this.nombre = nombre;
        }
        
        
    }
    // Esta clase permite recabar un estimativo de los ingresos mensuales de la familia
    static class SalariosItem {
       
        int salario;
        

        SalariosItem(int salario) {
            this.salario = salario;
        }
        
        
    }
    // Esta clase permite recabar información del númer ode comidad día en la familia
     static class ComidasItem {
       
        int comida;
        

        ComidasItem(int comida) {
            this.comida = comida;
        }
        
        
    }
    
     static class FamiliaItem {
       
        String familia;
        

        FamiliaItem(String familia) {
            this.familia = familia;
        }
     }
        

    static class SortByDate implements Comparator<DateItem> {
        @Override
        public int compare(DateItem a, DateItem b) {
            return a.datetime.compareTo(b.datetime);
        }
    }
    
    List nombresApellidos = new LinkedList<>();


    public static void main(String args[]) {
       List<DateItem> fechaEncuesta = new ArrayList<>();
fechaEncuesta.add(new DateItem("9/13/2023 6:44:40"));
fechaEncuesta.add(new DateItem("9/13/2023 6:45:03"));
fechaEncuesta.add(new DateItem("9/13/2023 6:44:40"));
fechaEncuesta.add(new DateItem("9/13/2023 6:45:03"));
fechaEncuesta.add(new DateItem("9/13/2023 6:45:08"));
fechaEncuesta.add(new DateItem("9/13/2023 6:45:12"));
fechaEncuesta.add(new DateItem("9/13/2023 6:45:59"));
fechaEncuesta.add(new DateItem("9/13/2023 6:47:17"));
fechaEncuesta.add(new DateItem("9/13/2023 6:47:23"));
fechaEncuesta.add(new DateItem("9/13/2023 6:47:45"));
fechaEncuesta.add(new DateItem("9/13/2023 6:48:23"));
fechaEncuesta.add(new DateItem("9/13/2023 6:48:47"));
fechaEncuesta.add(new DateItem("9/13/2023 6:49:13"));
fechaEncuesta.add(new DateItem("9/13/2023 6:49:27"));
fechaEncuesta.add(new DateItem("9/13/2023 6:49:42"));
fechaEncuesta.add(new DateItem("9/13/2023 6:50:02"));
fechaEncuesta.add(new DateItem("9/13/2023 6:51:16"));
fechaEncuesta.add(new DateItem("9/13/2023 6:53:41"));
fechaEncuesta.add(new DateItem("9/13/2023 6:54:22"));
fechaEncuesta.add(new DateItem("9/13/2023 7:06:01"));
fechaEncuesta.add(new DateItem("9/13/2023 7:30:54"));
fechaEncuesta.add(new DateItem("9/13/2023 7:35:09"));
fechaEncuesta.add(new DateItem("9/13/2023 7:40:12"));
fechaEncuesta.add(new DateItem("9/13/2023 9:25:10"));
fechaEncuesta.add(new DateItem("9/13/2023 9:25:31"));
fechaEncuesta.add(new DateItem("9/13/2023 9:33:54"));
fechaEncuesta.add(new DateItem("9/13/2023 9:36:43"));
fechaEncuesta.add(new DateItem("9/13/2023 9:59:58"));
fechaEncuesta.add(new DateItem("9/13/2023 10:58:05"));
fechaEncuesta.add(new DateItem("9/13/2023 11:00:01"));
fechaEncuesta.add(new DateItem("9/13/2023 11:01:19"));
fechaEncuesta.add(new DateItem("9/13/2023 11:01:22"));
fechaEncuesta.add(new DateItem("9/13/2023 11:01:51"));
fechaEncuesta.add(new DateItem("9/13/2023 11:02:06"));
fechaEncuesta.add(new DateItem("9/13/2023 13:08:23"));
List<String> nombresApellidos = new ArrayList<>();
nombresApellidos.add(new String("Isabella Escobar "));
nombresApellidos.add(new String("karol betancourt"));
nombresApellidos.add(new String("Daian Estefany Vernaza Sachica "));
nombresApellidos.add(new String("Natalia Camacho Burbano"));
nombresApellidos.add(new String("Nathaly Mora Lopez"));
nombresApellidos.add(new String("Karen Rodríguez"));
nombresApellidos.add(new String("Anny Karolay Gomez Olave"));
nombresApellidos.add(new String("Sarahy Sofia España Trujillo"));
nombresApellidos.add(new String("Manuela Gómez"));
nombresApellidos.add(new String("Laura Daniela Cuyate"));
nombresApellidos.add(new String("Pilar Tatiana Sinisterra Angulo"));
nombresApellidos.add(new String("Brenda giseth valencia"));
nombresApellidos.add(new String("katherin yuliana mosquera fajardo"));
nombresApellidos.add(new String("Laura Nicole Velez londoño"));
nombresApellidos.add(new String("Melissa García blandón"));
nombresApellidos.add(new String("Nicol camila velasquez"));
nombresApellidos.add(new String("Ely jhajanna Girón Díaz "));
nombresApellidos.add(new String("Ana Sofia Bueno Torres"));
nombresApellidos.add(new String("Alexandra Santana Medina"));
nombresApellidos.add(new String("Laura Vanessa Gómez Tangarife"));
nombresApellidos.add(new String("Yeraldin Ríos Montánchez"));
nombresApellidos.add(new String("Silvia Escorcia"));
nombresApellidos.add(new String("Vianca Diaz Ordoñez"));
nombresApellidos.add(new String("Luis Ángel Serna Obando"));
nombresApellidos.add(new String("Brenda Loaiza Rojas"));
nombresApellidos.add(new String("Sofia Gonzalez Cuartas"));
nombresApellidos.add(new String("Erika Cruz"));
nombresApellidos.add(new String("Nicoll Dayana Aponte Tofiño"));
nombresApellidos.add(new String("Valeria Bedoya"));
nombresApellidos.add(new String("Ana Sofía Muñoz Gaitán "));
nombresApellidos.add(new String("Julitza Rendón Grajales"));
nombresApellidos.add(new String("Wendy cuéllar"));
nombresApellidos.add(new String("Kiara Yuliana Kuri Pedreros"));
nombresApellidos.add(new String("Valery Nicol Cuero"));
nombresApellidos.add(new String("María Victoria Mensucue"));

List<Integer> salario = new ArrayList<>();
salario.add(1100000);
salario.add(2000000);
salario.add(5000000);
salario.add(1700000);
salario.add(1200000);
salario.add(1800000);
salario.add(1300000);
salario.add(1500000);
salario.add(2400000);
salario.add(1800000);
salario.add(1000000);
salario.add(800000);
salario.add(1800000);
salario.add(1200000);
salario.add(600000);
salario.add(100000);
salario.add(1300000);
salario.add(2000000);
salario.add(1600000);
salario.add(750000);
salario.add(1200000);
salario.add(1200000);
salario.add(1160000);
salario.add(1500000);
salario.add(2300000);
salario.add(1350000);
salario.add(1700000);
salario.add(1500000);
salario.add(900000);
salario.add(1000000);
salario.add(800000);
salario.add(1200000);
salario.add(1000000);
List<Integer> comida = new ArrayList<>();
comida.add(3);
comida.add(1);
comida.add(4);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(4);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(2);
comida.add(3);
comida.add(2);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(4);
comida.add(5);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(3);
comida.add(2);
comida.add(2);

List<String> familia = new ArrayList<>();
familia.add(new String("madre"));
familia.add(new String("madre"));
familia.add(new String("padre y madre"));
familia.add(new String("padre y madre"));
familia.add(new String("madre"));
familia.add(new String("padre y madre"));
familia.add(new String("padre y madre"));
familia.add(new String("padre"));
familia.add(new String("madre"));
familia.add(new String("padre"));
familia.add(new String("padre y madre"));
familia.add(new String("madre"));
familia.add(new String("Otros parientes"));
familia.add(new String("madre"));
familia.add(new String("padre y madre"));
familia.add(new String("abuelos"));
familia.add(new String("Otros parientes"));
familia.add(new String("padre y madre"));
familia.add(new String("madre"));
familia.add(new String("padre y madre"));
familia.add(new String("padre"));
familia.add(new String("madre"));
familia.add(new String("independiente"));
familia.add(new String("padre y madre"));
familia.add(new String("madre"));
familia.add(new String("padre y madre"));
familia.add(new String("Otros parientes"));
familia.add(new String("padre y madre"));
familia.add(new String("madre"));
familia.add(new String("madre"));
familia.add(new String("madre"));
familia.add(new String("Otros parientes"));
familia.add(new String("Otros parientes"));
Collections.sort(fechaEncuesta, new SortByDate());
Collections.sort(salario); 
Collections.sort(comida); 
Collections.sort(familia); 

System.out.println("    ");
System.out.println("FECHA DE RECOGIDA DE LOS DATOS    ");
  
System.out.println("    ");

        fechaEncuesta.forEach(date -> {
            System.out.println(date.datetime);
        });
      

// Ordenamos la lista.
        Collections.sort(nombresApellidos); 
        
        // Imprimimos
        
       System.out.println("    ");
System.out.println("NOMBRES Y APELLIDOS DE LOS ENCUENTADOS");
  
System.out.println("    ");
       
       nombresApellidos.forEach(nombre -> {
            System.out.println(nombre);
        });
        
        
         System.out.println("    ");
System.out.println("INGRESOS MENSUALES DE LA FAMILIA");
  
System.out.println("    ");
       /*
       salario.forEach(salarios -> {
            System.out.println(salario);
        });
        */
        
           for (int i=0;i<salario.size();i++) {
      
      System.out.println(salario.get(i));
    } 
         System.out.println("    ");
System.out.println("NÚMERO DE COMIDAS AL DÍA POR FAMILIA");
  
System.out.println("    ");
     /*  
       comida.forEach(comidas -> {
            System.out.println(comida);
        });
    
    */
       for (int i=0;i<comida.size();i++) {
      
      System.out.println(comida.get(i));
    } 
    
    System.out.println("    ");
System.out.println("MENTORES");
  
System.out.println("    ");
     /*  
       familia.forEach(familias -> {
            System.out.println(familia);
        });
    */
    
          for (int i=0;i<familia.size();i++) {
      
      System.out.println(familia.get(i));
    } 
     System.out.println("    ");
System.out.println("ESTADÍSTICA BÁSICA");

    // Comenzamos con el mínimo ingreso
    
  

        System.out.println("Salario Mínimo Percibido");
        System.out.println("-------------------------");
        double max = 0;
        for (int i = 0; i < salario.size(); i++) {
            if (salario.get(i) > max) {
                max = salario.get(i);
            }
        }
        double min = max;
        for (int i = 0; i < comida.size(); i++) {
            if (comida.get(i) < min) {
                min = comida.get(i);
            }
        }
        System.out.println("Máximo Salario Percibido: " + max);
        System.out.println("Cantidad Mínima de comidas: " + min);
        
        
    
       
        
     // Comenzamos con el promedio de ingresos
        int sumatoria = 0;
        for (int x = 0; x < salario.size(); x++) {
            sumatoria += salario.get(x);
        }
        double promedio = sumatoria / salario.size();
        
    // mediana
     

        double mediana;
        int mitad = salario.size() / 2;
        // Si la longitud es par, se deben promediar los del centro
        if (salario.size() % 2 == 0) {
            mediana = (salario.get(mitad - 1) + salario.get(mitad)) / 2;
        } else {
            mediana = salario.get(mitad);
        }
        
        // System.out.printf("\nEn esta muestra, el salario minimo es $ %.2f", max);
        
        System.out.printf("\nEn esta muestra, el salario promedio es $ %.2f y el cincuenta por ciento recibe un salio menor que (mediana) $ %.2f", promedio, mediana);
    }
}  
