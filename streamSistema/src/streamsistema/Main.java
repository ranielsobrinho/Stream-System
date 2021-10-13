/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsistema;

import java.util.ArrayList;
import java.util.List;
import streamsistema.classesEntidades.Mensalidade;
import streamsistema.classesEntidades.Midia;
import streamsistema.classesEntidades.Pagamento;
import streamsistema.classesEntidades.StatusMensalidade;
import streamsistema.classesEntidades.TipoGenero;
import streamsistema.classesEntidades.TipoMidia;
import streamsistema.classesEntidades.TipoPagamento;
import streamsistema.classesEntidades.Usuario;

/**
 *
 * @authores Breno,Raniel,Anizio e Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("543.654.345-32", "Breno");
        Usuario usuario1 = new Usuario("324.453.654-43", "Raniel");
        Usuario usuario2 = new Usuario("543.654.345-32", "Anizio");
        Usuario usuario3 = new Usuario("543.654.345-32", "Rafael");
        List<Usuario> users = new ArrayList<>();
        users.add(usuario);
        users.add(usuario1);
        users.add(usuario2);
        users.add(usuario3);
        
        users.stream().forEach(user -> {
            System.out.println(user);
        });
        
        Mensalidade mensalidade = new Mensalidade("202101E"); 
        mensalidade.setUsuario(usuario);
        mensalidade.setValor(400D);
        mensalidade.setStatus(StatusMensalidade.getA_VENCER());
        
        Pagamento pag = new Pagamento(001);
        pag.setFormaPag(TipoPagamento.getBOLETO());
        pag.setDataPag("12/10/2021");
        
        mensalidade.setIdPagamento(pag.getId());
        
        Midia midia = new Midia(123);
        midia.setAno(2020);
        midia.setGenero(TipoGenero.getACAO_AVENTURA());
        midia.setTipoMidia(TipoMidia.getFILME());
        midia.setAutor(usuario.getNome());
    }
    
}
