package com.examplespring.tarefaspring.Controllers;


import com.examplespring.tarefaspring.Models.TarefaModel;
import com.examplespring.tarefaspring.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController //class rest
@RequestMapping("/tarefas")//end point do controller
public class TarefaController {
    @Autowired // auto gerenciavel pelo jpa
    private TarefaRepository tarefaRepository;



    //método
    @GetMapping //tudo que venha via get entre em list
    public List<TarefaModel> list(){
        return tarefaRepository.findAll();
    }

    @GetMapping("/{id}")
    public TarefaModel detalhe(@PathVariable Long id){
       Optional<TarefaModel> tarefaDetalhe = tarefaRepository.findById(id);
       if(tarefaDetalhe.isPresent()){
           return tarefaDetalhe.get();
       }
       return null;
    }


    @PostMapping
    public TarefaModel adicionar(@RequestBody TarefaModel tarefaModel){
        return tarefaRepository.save(tarefaModel);
    }

}
