package com.ro.springbootmicroservice2compra.service;

import com.ro.springbootmicroservice2compra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
