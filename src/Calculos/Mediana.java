package Calculos;

/**
 *
 * @author PYU
 */
public class Mediana {
    private final Float [] numeros;
    private int contagemElementos;

    public Mediana() {
        this.numeros = new Float[50];
        this.contagemElementos=0;
    }

public void inserirMediana(Float n){
    numeros[this.getContagemElementos()+1]=n;
    this.setContagemElementos(this.getContagemElementos()+1);
    this.ordenaSequencia();
    }
public void ordenaSequencia(){
    if(getContagemElementos()<2)return;
    Float aux,aux2;int i;
    for(i=1;i<this.getContagemElementos();i++){
        aux=numeros[i+1];
    if(aux<numeros[i]){
        aux2=numeros[i];
        numeros[i]=aux;
        numeros[i+1]=aux2;
    }
    }
    }

public Float retornaElemento(int pos){
    return numeros[pos];
}
public Float retornaElemento(int pos,int pos2){
    return ((numeros[pos]+numeros[pos2])/2);
}

    /**
     * @return the contagemElementos
     */
    public int getContagemElementos() {
        return contagemElementos;
    }

    /**
     * @param contagemElementos the contagemElementos to set
     */
    public void setContagemElementos(int contagemElementos) {
        this.contagemElementos = contagemElementos;
    }
    
}
