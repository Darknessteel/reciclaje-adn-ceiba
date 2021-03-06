package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Producto;
import com.ceiba.usuario.modelo.entidad.Producto;

public interface RepositorioProducto {
    /**
     * Permite crear un usuario
     * @param producto
     * @return el id generado
     */
    Long crear(Producto producto);

    /**
     * Permite actualizar un producto
     * @param producto
     */
    void actualizar(Producto producto);

    /**
     * Permite eliminar un producto
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un producto con un nombre
     * @param nombre
     * @return si existe o no
     */
    boolean existe(String nombre);

    /**
     * Permite validar si existe un usuario con un nombre excluyendo un id
     * @param nombre
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id,String nombre);
}
