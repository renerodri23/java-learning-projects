package org.rpalacios.poointerfaces.imprenta.modelo;
import java.util.ArrayList;
import java.util.List;
public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private Persona autor;
    private String tiutlo;
    private Genero genero;

    public Libro(Persona autor, String tiutlo, Genero genero) {
        this.autor = autor;
        this.tiutlo = tiutlo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible h){
        paginas.add(h);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.tiutlo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genero).append("\n");
        for (Imprimible pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
