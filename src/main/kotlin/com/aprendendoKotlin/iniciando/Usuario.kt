package com.aprendendoKotlin.iniciando

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("usuario")
class Usuario{

    @GetMapping("listAll")
    fun listAll(): String{
        return "Listando All";
    }

    @PostMapping("listSingle")
    fun listSingle(@RequestBody corpo: User): String{
        return "Listando Single ${corpo}";
    }

    @PostMapping("updateSingle")
    fun alterarUm(@RequestBody corpo: User): String{
        return "Alterando ${corpo}"
    }

    @ApiOperation(value = "doc header...", notes = "detailed doc...")
    @GetMapping("testing")
    fun testeServerOnline(): String{
        return "Online..."
    }



}

data class User(val nome: String, val id: Int)
