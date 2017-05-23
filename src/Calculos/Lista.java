package Calculos;

import java.util.Objects;

class No{
    Integer numero;
    int repeticao;

    public No(int numero) {
        this.numero = numero;
        this.repeticao = 0;
    }

    public No() {
        this.numero=0;
        this.repeticao=0;
    }
}

public class Lista{
    No [] no = new No[50];
    int contagemElementos;
    No moda;

    public Lista() {
        int i;
        for(i=0;i<no.length;i++){no[i]=new No();}
        this.moda = new No();
    }

    public int getContagemElementos(){
    return this.contagemElementos;
    }
    public void inserir(int n){
        int i;
        for(i=0;i<no.length;i++){
            if(n==no[i].numero){no[i].repeticao++;contagemElementos++;return;}
        }
        for(i=0;i<no.length;i++){
            if(no[i].numero==0){no[i].numero=n;no[i].repeticao++;contagemElementos++;return;}
        }
    }
        
public String calcularModa(){
        this.getContagemElementos();
        if(this.contagemElementos==1){moda=no[0];}
        else{
        int i;
        moda=no[0];
        for(i=0;i<no.length;i++){
            if(no[i].repeticao>moda.repeticao){
                moda=no[i];
            }
            }
        for(i=0;i<no.length;i++){
            if(no[i].repeticao==moda.repeticao){
                if (!Objects.equals(no[i].numero, moda.numero)) {
                    return "Multimodal";
                } else {
                }
            }
            }
        
        }
        return moda.numero.toString();
    }
}
