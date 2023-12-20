package edu.unifaa.ecommerce.model.myenum;

public class ModeloErro {

    private String erroTitulo;
    private String erroMesagem;
    private int erroStatus;
    
    public ModeloErro(String erroTitulo, String erroMesagem, int erroStatus) {
        this.erroTitulo = erroTitulo;
        this.erroMesagem = erroMesagem;
        this.erroStatus = erroStatus;
    }


    //Getter e Setters
    //=======================================================================================================================================


    public String getErroTitulo() {
        return erroTitulo;
    }
    public void setErroTitulo(String erroTitulo) {
        this.erroTitulo = erroTitulo;
    }
    public String getErroMesagem() {
        return erroMesagem;
    }
    public void setErroMesagem(String erroMesagem) {
        this.erroMesagem = erroMesagem;
    }
    public int getErroStatus() {
        return erroStatus;
    }
    public void setErroStatus(int erroStatus) {
        this.erroStatus = erroStatus;
    }



}
