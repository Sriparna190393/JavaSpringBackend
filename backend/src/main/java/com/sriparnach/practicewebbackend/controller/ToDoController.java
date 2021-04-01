package com.sriparnach.practicewebbackend.controller;

import com.sriparnach.practicewebbackend.data.Tariff;
import com.sriparnach.practicewebbackend.service.TariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/tariff")    //this maps all the endpoints to "/api/tariff"
public class ToDoController{

    @Autowired
    private TariffService tariffService;

    @GetMapping
    public List<Tariff> findAll(){
        return tariffService.findAll();
    }

    @GetMapping("/{id}")
    public Tariff findById(@PathVariable String id){
        return tariffService.findById(id);
    }

    @PostMapping
    public String create(@RequestBody Tariff tariff){
        tariffService.save(tariff);
        return "Record Saved Successfully in Database";
    }

    @PutMapping("/{id}")
    public Tariff update(@RequestBody Tariff tariff){
        return tariffService.save(tariff);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        tariffService.deleteById(id);
    }

}
//60664d2e60fe4b25b16205fb