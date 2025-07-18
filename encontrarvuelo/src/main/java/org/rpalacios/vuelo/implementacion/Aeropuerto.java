package org.rpalacios.vuelo.implementacion;

import org.rpalacios.vuelo.modelos.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Aeropuerto {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat ff = new SimpleDateFormat("E MMM dd HH:mm:ss yyyy", new Locale("es","ES"));

        List<Vuelo> v = new ArrayList<>();

        v.add(new Vuelo("AAL 93","New York","Santiago", sdf.parse("2021-08-29 05:39"),62));
        v.add(new Vuelo("LAT 755","Sao Paulo","Santiago", sdf.parse("2021-08-31 4:45"),47));
        v.add(new Vuelo("SKU 621","Rio De Janeiro","Santiago",sdf.parse("2021-08-30 16:00"),52));
        v.add(new Vuelo("DAL 147","Atlanta","Santiago", sdf.parse("2021-08-29 13:22"),59));
        v.add(new Vuelo("AVA 241","Bogota","Santiago", sdf.parse("2021-08-31 14:05"),25));
        v.add(new Vuelo("AMX 10","Mexico City","Santiago", sdf.parse("2021-08-31 05:20"),29));
        v.add(new Vuelo("IBE 6833","Londres","Santiago", sdf.parse("2021-08-30 08:45"),55));
        v.add(new Vuelo("LAT 2479","Frankfurt","Santiago", sdf.parse("2021-08-29 07:41"),51));
        v.add(new Vuelo("SKU 803","Lima","Santiago",sdf.parse("2021-08-30 10:35"),48));
        v.add(new Vuelo("LAT 533","Los Angeles","Santiago", sdf.parse("2021-08-29 09:14"),59));
        v.add(new Vuelo("LAT 1447","Guayaquil","Santiago", sdf.parse("2021-08-31 08:33"),31));
        v.add(new Vuelo("CMP 111","Panama City","Santiago", sdf.parse("2021-08-31 15:15"),29));
        v.add(new Vuelo("LAT 705","Madrid","Santiago", sdf.parse("2021-08-30 08:14"),47));
        v.add(new Vuelo("AAL 957","Miami","Santiago", sdf.parse("2021-08-29 22:53"),60));
        v.add(new Vuelo("ARG 5091","Buenos Aires","Santiago", sdf.parse("2021-08-31 09:57"),32));
        v.add(new Vuelo("LAT 1283","Cancún","Santiago", sdf.parse("2021-08-31 04:00"),35));
        v.add(new Vuelo("LAT 579","Barcelona","Santiago", sdf.parse("2021-08-29 07:45"),61));
        v.add(new Vuelo("AAL 945","Dallas-Fort-Worth","Santiago", sdf.parse("2021-08-30 07:12"),58));
        v.add(new Vuelo("LAT 501","Paris","Santiago", sdf.parse("2021-08-29 18:29"),49));
        v.add(new Vuelo("LAT 405","Montevideo","Santiago", sdf.parse("2021-08-30 15:45"),39));


        v.sort((a,b)-> a.getFechaLlegada().compareTo(b.getFechaLlegada()));
        System.out.println("========== Vuelos de Forma Ascendete ==========");
        for(Vuelo vuelo: v){
            System.out.println(vuelo);
            System.out.println();
        }
        System.out.println("==============================================");
        StringBuilder sb = new StringBuilder("El ultimo vuelo en llegar es ").append(v.getLast().getNombreVuelo())
                .append(" : ").append(v.getLast().getOrigen()).append(" , aterriza el ").append(ff.format(v.getLast().getFechaLlegada()));
        System.out.println();
        System.out.println(sb);

        v.sort((a, b) -> Integer.compare(a.getCantidadPasajeros(), b.getCantidadPasajeros()));
        StringBuilder sb2 = new StringBuilder("El vuelo con menor numero de pasajero es ").append(v.getFirst().getNombreVuelo());
        sb2.append(" : ").append(v.getFirst().getOrigen()).append(", con ").append(v.getFirst().getCantidadPasajeros()).append(" pasajeros");
        System.out.println();
        System.out.println(sb2);

    }
}
