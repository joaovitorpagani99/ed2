/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package estruturadedados;

import model.Materia;

/**
 *
 * @author joaov
 */
public class ED {

    public static void main(String[] args) {
        Materia materia = new Materia();
        Materia materia2 = new Materia();
        Materia materia3 = new Materia();
        ListaMateria lista = new ListaMateria();
       
        materia.setMateria("eu"); 
        materia2.setMateria("joao");
        materia3.setMateria("kaio");

        
        lista.inserirInicio(materia);
        lista.inserirInicio(materia2);
        lista.inserirInicio(materia3);
        
        lista.toSring();
        
        materia2.setMateria("tes");
        System.out.println(lista.alterar(materia2));
        lista.toSring();
        //System.out.println(lista.getTamanho());
        //lista.toSring();
        //lista.retirarMeio(0);
        //System.out.println("estruturadedados.ED.main()");
        
        //lista.toSring();
            
        
        
          // lista.retorno();
        
    }
}
