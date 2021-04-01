package com.sriparnach.practicewebbackend.service;

import com.sriparnach.practicewebbackend.data.Tariff;
import com.sriparnach.practicewebbackend.exception.EntityNotFoundException;
import com.sriparnach.practicewebbackend.repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffService {

    @Autowired
    private TariffRepository tariffRepository;

    public List<Tariff> findAll(){
        return tariffRepository.findAll();
    }

    public Tariff findById(String id){
        return tariffRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Tariff save(Tariff toDo){
        return tariffRepository.save(toDo);
    }

    public void deleteById(String id){
        tariffRepository.deleteById(id);
    }

}