package br.com.dio.desafio.service.impl;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.service.ConteudoService;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

public class CursoServiceImpl extends ConteudoService {
    Curso curso = new Curso();
    @Override
    public double calcularXp() {
        int cargaHoraria = curso.getCargaHoraria();
        return XP_PADRAO * cargaHoraria;
    }
}
