/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.projeto_produtos.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Dennys Alves
 */
public class MensagensUtil {
    
    public static final Locale LOCALE_PT_BR = new Locale("pt", "BR");
    public static final Locale LOCALE_EN_US = new Locale("en", "US");
    public static final Locale LOCALE_ES_ES = new Locale("es", "ES");
    
    private static ResourceBundle bundle = ResourceBundle.getBundle("mensagens", LOCALE_PT_BR);
    
    
    public static final String MSG_VALIDACAO_NOME = "msg.validacao.nome";
    public static final String MSG_VALIDACAO_PRECO = "msg.validacao.preco";
    public static final String MSG_ERRO_SELECIONAR = "msg.erro.selecionar";
    public static final String MSG_ERRO_CONSULTAR = "msg.erro.consultar ";
    public static final String MSG_LABEL_NOME  = "msg.label.nome";
    public static final String MSG_LABEL_PRECO  = "msg.label.preco";
    public static final String MSG_LABEL_BUSCAR  = "msg.label.buscar";
    public static final String MSG_LABEL_TITULO  = "msg.label.titulo";
    public static final String MSG_LABEL_NOVO_TITULO  = "msg.label.novo.titulo";
    public static final String MSG_LABEL_EDITAR_TITULO  = "msg.label.editar.titulo";
    public static final String MSG_BUTTON_SALVAR = "msg.button.salvar";
    public static final String MSG_BUTTON_CANCELAR = "msg.button.cancelar";
    public static final String MSG_BUTTON_NOVO = "msg.button.novo";
    public static final String MSG_BUTTON_EDITAR = "msg.button.editar";
    public static final String MSG_BUTTON_EXCLUIR = "msg.button.excluir";
    public static final String MSG_BUTTON_SAIR = "msg.button.sair";
    public static final String MSG_TABELA_CODIGO = "msg.tabela.codigo";
    public static final String MSG_TABELA_NOME = "msg.tabela.nome";
    public static final String MSG_TABELA_VALOR = "msg.tabela.valor";
    public static final String MSG_TABELA_MARCA = "msg.tabela.marca";
    public static final String MSG_TABELA_SO = "msg.tabela.so";
    public static final String MSG_TABELA_COR = "msg.tabela.cor";
    public static final String MSG_TABELA_PRECO = "msg.tabela.preco";
    public static final String MSG_TABELA_DETALHES = "msg.tabela.detalhes";
    public static final String MSG_IDIOMA = "msg.idioma";
    public static final String MSG_IDIOMA_PT_BR = "msg.idioma.pt.br";
    public static final String MSG_IDIOMA_EN_US = "msg.idioma.en.us";
    public static final String MSG_IDIOMA_ES_ES = "msg.idioma.es.es";
    public static final String MSG_RELATORIO = "menu.relatorio";
    public static final String MSG_RELATORIO_LISTA_PRODUTO = "menu.relatorio.lista.produto";
    public static final String MSG_RELATORIO_LISTA_PRODUTO_PRECO = "menu.relatorio.lista.produto.preco";
    public static final String MSG_RELATORIO_PRECO_REFERENCIA = "msg.relatorio.preco.referencia";
    
    public static String getString(String key){
        return bundle.getString(key);
    }
    
    public static void setLocale(Locale locale){
        bundle = ResourceBundle.getBundle("mensagens", locale);
    }
    
}
