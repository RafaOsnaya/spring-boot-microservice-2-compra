package com.ro.springbootmicroservice2compra.service;

import com.ro.springbootmicroservice2compra.model.Compra;
import com.ro.springbootmicroservice2compra.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private CompraRepository compraRepository;


    @Override
    public Compra saveCompra(Compra compra){
        compra.setFechaCompra(LocalDateTime.now());
        return compraRepository.save(compra);
    }

    @Override
    public List<Compra> findAllComprasOfUser(Long userId){
        return compraRepository.findAllByUserId(userId);
    }



}
