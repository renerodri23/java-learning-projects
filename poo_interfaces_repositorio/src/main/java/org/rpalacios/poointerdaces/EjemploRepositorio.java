package org.rpalacios.poointerdaces;

import org.rpalacios.poointerdaces.modelo.Cliente;
import org.rpalacios.poointerdaces.repositorio.*;
import org.rpalacios.poointerdaces.repositorio.excepciones.AccessDataException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DataWriteAccessException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DuplicateException;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;
import org.rpalacios.poointerdaces.repositorio.list.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            FinalInterface<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Andres", "McRae"));
            repo.crear(new Cliente("Bea", "Gonzales"));
            repo.crear(new Cliente("Luci", "Martinez"));
            repo.crear(new Cliente("Juno", "Obrero"));

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("=============== Paginsble ===========");
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);
            System.out.println("=============== Ordenadable ===========");
            List<Cliente> ordenAsc = repo.listar("nombre", Direccion.ASC);
            for (Cliente c : ordenAsc) {
                System.out.println(c);
            }
            System.out.println("============= Ordenable DESC ============");
            List<Cliente> ordenDesc = repo.listar("apellido", Direccion.DESC);
            for (Cliente c : ordenDesc) {
                System.out.println(c);
            }
            System.out.println("==== editar ===");
            Cliente andresUpdate = new Cliente("Andres", "Galan");
            andresUpdate.setId(2);
            repo.editar(andresUpdate);
            Cliente andres = repo.porId(2);
            System.out.println(andres);
            repo.listar("apellido", Direccion.ASC).forEach(System.out::println);


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
