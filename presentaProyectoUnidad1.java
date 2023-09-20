import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.BigDecimal;//Importamos la clase BigDecimal



public class HambreCero {

    public static void main(String[] args) {
        record InformacionHogar(
          String date,
          String nombre,
          int gradoEscolaridad,
          //byte gradoEscolaridad,
          String jefeFamilia,
          BigDecimal salario,
          int miembros,
          int comidas,
          int habitaciones){
        }

List<InformacionHogar> lista = new ArrayList<>();


//date,nombe,gradoEscolaridad,jefeFamilia,salario,miembros,comidas,habitaciones));
//date,nombe,gradoEscolaridad,jefeFamilia,salario,miembros,comidas,habitaciones));
lista.add(new InformacionHogar("9/13/2023 6:44:40","Isabella Escobar" ,11,"madre",new BigDecimal("1100000.50"),2,1,3));
lista.add(new InformacionHogar("9/13/2023 6:45:03","karol betancourt" ,11,"madre",new BigDecimal("2000000.50"),7,1,4));
lista.add(new InformacionHogar("9/13/2023 6:45:08","Daian Estefany Vernaza Sachica" ,11,"padre y madre",new BigDecimal("5000000.50"),4,4,3));
lista.add(new InformacionHogar("9/13/2023 6:45:12","Natalia Camacho Burbano" ,11,"padre y madre",new BigDecimal("1700000.50"),4,3,2));
lista.add(new InformacionHogar("9/13/2023 6:45:59","Nathaly Mora Lopez",11,"madre",new BigDecimal("1200000.50"),4,3,3));
lista.add(new InformacionHogar("9/13/2023 6:47:17","Karen Rodríguez" ,11,"padre y madre",new BigDecimal("1800000.50"),7,3,5));
lista.add(new InformacionHogar("9/13/2023 6:47:23","Anny Karolay Gomez Olave" ,11,"padre y madre",new BigDecimal("1300000.50"),7,3,5));
lista.add(new InformacionHogar("9/13/2023 6:47:45","Sarahy Sofia España Trujillo",11,"padre",new BigDecimal("1500000.50"),6,3,5));
lista.add(new InformacionHogar("9/13/2023 6:48:23","Manuela Gómez",11,"madre",new BigDecimal("2400000.50"),5,3,3));
lista.add(new InformacionHogar("9/13/2023 6:48:47","Laura Daniela cuyate" ,11,"padre",new BigDecimal("1800000.50"),2,4,2));
lista.add(new InformacionHogar("9/13/2023 6:49:13","Pilar Tatiana Sinisterra Angulo" ,11,"padre y madre",new BigDecimal("1000000.50"),7,3,5));
lista.add(new InformacionHogar("9/13/2023 6:49:27","Brenda giseth valencia" ,11,"madre",new BigDecimal("800000.50"),3,3,2));
lista.add(new InformacionHogar("9/13/2023 6:49:42","katherin yuliana mosquera fajardo",11,"Otros parientes",new BigDecimal("1800000.50"),5,3,4));
lista.add(new InformacionHogar("9/13/2023 6:50:02","Laura Nicole Velez londoño" ,11,"madre",new BigDecimal("1200000.50"),4,3,2));
lista.add(new InformacionHogar("9/13/2023 6:51:16","Melissa García blandón" ,11,"padre y madre",new BigDecimal("600000.50"),3,3,2));
lista.add(new InformacionHogar("9/13/2023 6:53:41","Nicol camila velasquez" ,11,"abuelos",new BigDecimal("1000000.50"),8,3,4));
lista.add(new InformacionHogar("9/13/2023 6:54:22","Ely jhajanna Girón Díaz" ,11,"Otros parientes",new BigDecimal("1300000.50"),5,2,3));
lista.add(new InformacionHogar("9/13/2023 7:06:01","Ana Sofia Bueno Torres",11,"padre y madre",new BigDecimal("2000000.50"),4,3,5));
lista.add(new InformacionHogar("9/13/2023 7:30:54","Alexandra Santana Medina",8,"madre",new BigDecimal("1600000.50"),3,2,3));
lista.add(new InformacionHogar("9/13/2023 7:35:09","Laura Vanessa Gómez Tangarife" ,8,"padre y madre",new BigDecimal("750000.50"),3,3,5));
lista.add(new InformacionHogar("9/13/2023 7:40:12","Yeraldin Ríos Montánchez" ,8,"padre",new BigDecimal("1200000.50"),4,3,2));
lista.add(new InformacionHogar("9/13/2023 9:25:10","Silvia Escorcia" ,11,"madre",new BigDecimal("1200000.50"),4,3,4));
lista.add(new InformacionHogar("9/13/2023 9:25:31","Vianca Diaz Ordoñez" ,11,"independiente",new BigDecimal("1160000.50"),1,3,2));
lista.add(new InformacionHogar("9/13/2023 9:33:54","Luis Ángel Serna Obando" ,11,"padre y madre",new BigDecimal("1500000.50"),4,3,3));
lista.add(new InformacionHogar("9/13/2023 9:36:43","Brenda Loaiza Rojas" ,11,"madre",new BigDecimal("2300000.50"),3,4,3));
lista.add(new InformacionHogar("9/13/2023 9:59:58","Sofia Gonzalez Cuartas" ,10,"padre y madre",new BigDecimal("1350000.50"),3,5,2));
lista.add(new InformacionHogar("9/13/2023 10:58:05","Erika Cruz" ,11,"Otros parientes",new BigDecimal("1700000.50"),5,3,3));
lista.add(new InformacionHogar("9/13/2023 11:00:01","Nicoll Dayana Aponte Tofiño" ,11,"padre y madre",new BigDecimal("1500000.50"),4,3,4));
lista.add(new InformacionHogar("9/13/2023 11:01:19","Valeria Bedoya" ,11,"madre",new BigDecimal("900000.50"),2,3,2));
lista.add(new InformacionHogar("9/13/2023 11:01:22","Ana Sofía Muñoz Gaitán" ,11,"madre",new BigDecimal("1000000.50"),4,3,3));
lista.add(new InformacionHogar("9/13/2023 11:01:51","Julitza Rendón Grajales" ,11,"madre",new BigDecimal("800000.50"),2,3,2));
lista.add(new InformacionHogar("9/13/2023 11:02:06","Wendy cuéllar" ,11,"Otros parientes",new BigDecimal("1200000.50"),3,2,2));
lista.add(new InformacionHogar("9/13/2023 13:08:23","Kiara Yuliana Kuri Pedreros",11,"Otros parientes",new BigDecimal("1000000.50"),3,2,3));
lista.add(new InformacionHogar("9/13/2023 15:32:32","Angelina Galviz Dorado",10,"padre y madre",new BigDecimal("3000000.50"),4,3,3));
lista.add(new InformacionHogar("9/14/2023 19:26:50","Evelyn Dayanna Caicedo España" ,10,"padre y madre",new BigDecimal("1160000.50"),3,3,3));
lista.add(new InformacionHogar("9/17/2023 20:06:57","Natalia Florián González" ,11,"madre",new BigDecimal("1160000.50"),2,3,3));
/*
record InformacionHogar(Date date, String nombre, String gradoEscolaridad, String jefeFamilia, BigDecimal salario, byte miembros, character comidas, character habitaciones){
        }
*/
     System.out.println("INFORMACIÓN RECABADA");
        System.out.println("  ");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X " + "Fecha " + "Nombres compeltos "+ "Escolaridad "+ "Cabeza de Hogar "+ "Ingresos Familiares "+ "Comidas al día "+ "# de Habitaciones "+"  X");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("  ");
        int numTotalHogares=0;
        for(InformacionHogar informacionHogar : lista) {
            System.out.println("| " +informacionHogar.date +" \t "+ informacionHogar.nombre+" \t "+informacionHogar.gradoEscolaridad
                    +" \t " + informacionHogar.jefeFamilia+" \t "+informacionHogar.salario+" \t "+informacionHogar.miembros
                    +" \t  "+informacionHogar.comidas+" \t  "+informacionHogar.habitaciones+" | ");
            numTotalHogares += 1;
        }
        System.out.println();
        
        
        //GENERACION DE DATOS ESTADISTICOS
        
        // PROMEDIO DE EDAD, ESTRATO, NUMERO DE HIJOS Y SALARIO DE LAS PERSONAS
      
        BigDecimal promedioSalario = BigDecimal.ZERO;
        BigDecimal promedioComidas = BigDecimal.ZERO;
        BigDecimal promedioHabitaciones = BigDecimal.ZERO;
        
        
        for(InformacionHogar informacionHogar : lista) {
            promedioSalario = promedioSalario.add(informacionHogar.salario);
            promedioComidas = promedioComidas.add(new BigDecimal(informacionHogar.comidas));
            promedioHabitaciones = promedioHabitaciones.add(new BigDecimal(informacionHogar.habitaciones));
            }
        
        promedioSalario = promedioSalario.divide(BigDecimal.valueOf(numTotalHogares));
        promedioComidas = promedioComidas.divide(BigDecimal.valueOf(numTotalHogares));
        promedioHabitaciones = promedioHabitaciones.divide(BigDecimal.valueOf(numTotalHogares));
        
        
        System.out.println("Del total de personas que equivale a "+numTotalHogares+" personas, el promedio de edad es de "
                + ""+promedioSalario.setScale(0, RoundingMode.HALF_UP)+" pesos");
        System.out.println("Del total de personas que equivale a "+numTotalHogares+" personas, el promedio de estrato es de "
                + ""+promedioComidas.setScale(0, RoundingMode.HALF_UP));
        System.out.println("Del total de personas que equivale a "+numTotalHogares+" personas, el promedio de numero de hijos es de "
                + ""+promedioHabitaciones.setScale(0, RoundingMode.HALF_UP));
        
        
        
        //MODA DEL NIVEL DE ESTUDIO
        int contarSalario=0;
        int contarComidas=0;
        int contarHabitaciones=0;
        int contarEscolaridad=0;
        int contarOnce=0;
        int contarDecimo=0;
        int contarOctavo=0;
        int contarComidasUna=0;
        int contarComidasDos=0;
        int contarComidasTres=0;
        int contarHabitacionesUna=0;
        int contarHabitacionesDos=0;
        int contarHabitacionesTres=0;
        
        for(InformacionHogar informacionHogar : lista) {
            if (informacionHogar.gradoEscolaridad==11){
                contarOnce +=1;
            } else if (informacionHogar.gradoEscolaridad==10) {
                contarDecimo +=1;
            } else if (informacionHogar.gradoEscolaridad==8) {
                contarOctavo +=1;
            } else {
                contarEscolaridad += 1;
            }
        }
        

       for(InformacionHogar informacionHogar : lista) {
            if (informacionHogar.comidas==1){
                contarComidasUna +=1;
            } else if (informacionHogar.comidas==2) {
                contarComidasDos +=1;
            } else if (informacionHogar.comidas==3) {
                contarComidasTres +=1;
            } else {
                contarComidas += 1;
            }
        }

      for(InformacionHogar informacionHogar : lista) {
            if (informacionHogar.habitaciones==1){
                contarHabitacionesUna +=1;
            } else if (informacionHogar.habitaciones==2) {
                contarHabitacionesDos +=1;
            } else if (informacionHogar.habitaciones==3) {
                contarHabitacionesTres +=1;
            } else {
                contarHabitaciones += 1;
            }
        }

        String modaGradoEscolaridad="";
        int mayorModa=0;
        if (contarOnce>contarDecimo && contarOnce>contarOctavo){
            modaGradoEscolaridad="Once";
            mayorModa = contarOnce;
        } else if (contarDecimo>contarOnce && contarDecimo>contarOctavo) {
            modaGradoEscolaridad="Decimo";
            mayorModa = contarDecimo;
        } else if (contarOctavo>contarOnce && contarOctavo>contarDecimo) {
            modaGradoEscolaridad="Octavo";
            mayorModa = contarOctavo;
        } else {
            modaGradoEscolaridad="Once";
            mayorModa = contarOnce;
        }
        System.out.println("Se puede concluir que del total de personas que equivalen a "+numTotalHogares+", "
                + "la moda en cuando el nivel Educativo es "
                + ""+modaGradoEscolaridad+" que equivale a "+mayorModa+" personas");
        
        
       

  }
}
