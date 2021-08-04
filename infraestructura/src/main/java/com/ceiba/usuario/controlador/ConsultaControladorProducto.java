package com.ceiba.usuario.controlador;

import com.ceiba.usuario.consulta.ManejadorListarUsuarios;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Productos")
@Api(tags={"Controlador consulta Producto"})
public class ConsultaControladorProducto {

    private final ManejadorListarProductos manejadorListarProductos;

    public ConsultaControladorProductos(ManejadorListarProductos manejadorListarProductos) {
        this.manejadorListarProductos = manejadorListarProductos;
    }

    @GetMapping
    @ApiOperation("Listar Productos")
    public List<DtoProducto> listar() {
        return this.manejadorListarProductos.ejecutar();
    }
}
