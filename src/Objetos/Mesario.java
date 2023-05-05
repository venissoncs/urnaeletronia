
package Objetos;
import Arquivos.LerDadosMesarios;
import interfaces.ValidarEleitor;
import interfaces.ValidarMesario;
/**
 * A classe "Mesario" implementa a interface "ValidarEleitor" e a interface "ValidarMesario"
 *
 * @author Kaylane
 */
public class Mesario extends Eleitor implements ValidarEleitor, ValidarMesario {

    private String matricula;
    private String senha;

    public Mesario(String nome, int tituloEleitor, String matricula, String senha) {
        super(nome, tituloEleitor);
        this.matricula = matricula;
        this.senha = senha;
    }

    public Mesario(LerDadosMesarios lerDadosMesarios) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validarEleitor(String nome, String tituloEleitoral) {
        return nome.equals(getNome()) && tituloEleitoral.equals(String.valueOf(getTituloEleitor())) ;
    }

    @Override
    public boolean validarMesario(String nome, String matricula, String senha) {
        if (nome.isEmpty() || !matricula.equals(this.matricula) || !senha.equals(this.senha)) {
            return false;
        }
        try {
            Integer.parseInt(matricula);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
