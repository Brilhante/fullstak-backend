package br.ufg.inf.backend.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.inf.backend.spring.model.Produto;
import br.ufg.inf.backend.spring.repository.ProdutoRepository;

@Service
public class ProdutoService {

   @Autowired
   private ProdutoRepository produtoRepository;

   public List<Produto> listarProdutos() {
       return produtoRepository.findAll();
   }

   public Produto salvarProduto(Produto produto) {
       return produtoRepository.save(produto);
   }

   public Produto obterProdutos(Long id) {
       return produtoRepository.findById(id).orElse(null);
   }
}
