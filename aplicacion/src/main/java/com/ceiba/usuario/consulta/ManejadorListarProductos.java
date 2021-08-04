package com.ceiba.usuario.consulta;

import com.ceiba.usuario.modelo.dto.DtoUsuario;
import com.ceiba.usuario.puerto.dao.DaoUsuario;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ManejadorListarProductos {
    private final DaoUsuario daoProducto;

    public ManejadorListarProducto(DaoProducto daoProducto){
        this.daoProducto = daoProducto;
    }

    public List<DtoProducto> ejecutar(){ return this.daoProducto.listar(); }
}
