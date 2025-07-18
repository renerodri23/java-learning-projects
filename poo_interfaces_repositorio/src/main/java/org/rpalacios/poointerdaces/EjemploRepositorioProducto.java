package org.rpalacios.poointerdaces;

import org.rpalacios.poointerdaces.modelo.Cliente;
import org.rpalacios.poointerdaces.modelo.Producto;
import org.rpalacios.poointerdaces.repositorio.Direccion;
import org.rpalacios.poointerdaces.repositorio.FinalInterface;
import org.rpalacios.poointerdaces.repositorio.excepciones.AccessDataException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DataWriteAccessException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DuplicateException;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;
import org.rpalacios.poointerdaces.repositorio.list.ClienteListRepositorio;
import org.rpalacios.poointerdaces.repositorio.list.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        try {
            FinalInterface<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("Mesa", 50.52));
            repo.crear(new Producto("Silla", 18.));
            repo.crear(new Producto("Lampara", 15.5));
            repo.crear(new Producto("Notebook", 400.59));
           
            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);
            System.out.println("=============== Paginsble ===========");
            List<Producto> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);
            System.out.println("=============== Ordenadable ===========");
            List<Producto> ordenAsc = repo.listar("descripcion", Direccion.ASC);
            for (Producto p : ordenAsc) {
                System.out.println(p);
            }
            System.out.println("============= Ordenable DESC ============");
            List<Producto> ordenDesc = repo.listar("precio", Direccion.DESC);
            for (Producto p : ordenDesc) {
                System.out.println(p);
            }
            System.out.println("==== editar ===");
            Producto andresUpdate = new Producto("Andres", 69.69);
            andresUpdate.setId(1);
            repo.editar(andresUpdate);
            Producto andres = repo.porId(1);
            System.out.println(andres);
            repo.listar("descripcion", Direccion.ASC).forEach(System.out::println);


            System.out.println("========== Eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);


        }catch(DuplicateException d){
            System.out.println("Duplicado: "+ d.getMessage());
            d.printStackTrace();

        }
        catch(DataWriteAccessException e){
            System.out.println("Escritura: "+e.getMessage());
            e.printStackTrace();
        }
        catch (ReadDataAccessException e){
            System.out.println("Lectura: "+e.getMessage());
            e.printStackTrace();
        }catch (AccessDataException e){
            System.out.println("Generic: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
