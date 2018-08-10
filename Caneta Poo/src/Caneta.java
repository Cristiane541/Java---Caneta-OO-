/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC Bruger
 */
public class Caneta {
    
    private String cor;
    private String tipo;
    private boolean tampa;
    private int carga;
    private final int CHEIO = 1;

    public Caneta(String cor, String tipo) {
        setCor(cor);
        setTipo(tipo);
        setCarga(CHEIO);
        setTampa(true);
    }

    public String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTampa() {
        return tampa;
    }

    public final void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public int getCarga() {
        return carga;
    }

    public final void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void tamparCaneta(){
        if(!isTampa()){
            setTampa(true);  
        }
    }
    
    public void destamparCaneta(){
        if(isTampa()){
            setTampa(false);  
        }
    }
    
    public String escreverPalavra(String p){
        String palavra;
        
        if(!isTampa() && this.getCarga() > 0){
            this.carga--;            
            palavra = p;
        }else{
            palavra = "Carga insuficiente! Tente Novamente!";
        }
        
        return palavra;
    }
    
}
