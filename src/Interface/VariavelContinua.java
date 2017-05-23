/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


/**
 *
 * @author Samuel S. Morais
 */
public class VariavelContinua implements Comparable<VariavelContinua>{
    
    private double amplitude;

    private double limiteInferior;

    private double limiteSuperior;

    private int classe;

    private int fi;

    private double fr;

    private double fiacr;

    private int fac;

    public static final String PROP_FAC = "fac";

    /**
     * Get the value of fac
     *
     * @return the value of fac
     */
    public int getFac() {
        return fac;
    }

    /**
     * Set the value of fac
     *
     * @param fac new value of fac
     */
    public void setFac(int fac) {
        int oldFac = this.fac;
        this.fac = fac;
        propertyChangeSupport.firePropertyChange(PROP_FAC, oldFac, fac);
    }

    public static final String PROP_FIACR = "fiacr";

    /**
     * Get the value of fiacr
     *
     * @return the value of fiacr
     */
    public double getFiacr() {
        return fiacr;
    }

    /**
     * Set the value of fiacr
     *
     * @param fiacr new value of fiacr
     */
    public void setFiacr(double fiacr) {
        double oldFiacr = this.fiacr;
        this.fiacr = fiacr;
        propertyChangeSupport.firePropertyChange(PROP_FIACR, oldFiacr, fiacr);
    }

    public static final String PROP_FR = "fr";

    /**
     * Get the value of fr
     *
     * @return the value of fr
     */
    public double getFr() {
        return fr;
    }

    /**
     * Set the value of fr
     *
     * @param fr new value of fr
     */
    public void setFr(double fr) {
        double oldFr = this.fr;
        this.fr = fr;
        propertyChangeSupport.firePropertyChange(PROP_FR, oldFr, fr);
    }

    public VariavelContinua(double xi,int fi) {
        this.fi =fi;
        this.limiteInferior = xi;
    }

    public static final String PROP_FI = "fi";

    /**
     * Get the value of fi
     *
     * @return the value of fi
     */
    public int getFi() {
        return fi;
    }

    /**
     * Set the value of fi
     *
     * @param fi new value of fi
     */
    public void setFi(int fi) {
        int oldFi = this.fi;
        this.fi = fi;
        propertyChangeSupport.firePropertyChange(PROP_FI, oldFi, fi);
    }

   
    public static final String PROP_CLASSE = "classe";

    /**
     * Get the value of classe
     *
     * @return the value of classe
     */
    public int getClasse() {
        return classe;
    }

    /**
     * Set the value of classe
     *
     * @param classe new value of classe
     */
    public void setClasse(int classe) {
        int oldClasse = this.classe;
        this.classe = classe;
        propertyChangeSupport.firePropertyChange(PROP_CLASSE, oldClasse, classe);
    }

    public static final String PROP_INTERVALO = "limiteSuperior";

    /**
     * Get the value of limiteSuperior
     *
     * @return the value of limiteSuperior
     */
    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    /**
     * Set the value of limiteSuperior
     *
     * @param limiteSuperior new value of limiteSuperior
     */
    public void setLimiteSuperior(double limiteSuperior) {
        double oldIntervalo = this.limiteSuperior;
        this.limiteSuperior = limiteSuperior;
        propertyChangeSupport.firePropertyChange(PROP_INTERVALO, oldIntervalo, limiteSuperior);
    }

    public static final String PROP_INTERVALOCLASSE = "limiteInferior";

    /**
     * Get the value of limiteInferior
     *
     * @return the value of limiteInferior
     */
    public double getLimiteInferior() {
        return limiteInferior;
    }

    /**
     * Set the value of limiteInferior
     *
     * @param limiteInferior new value of limiteInferior
     */
    public void setLimiteInferior(double limiteInferior) {
        double oldIntervaloClasse = this.limiteInferior;
        this.limiteInferior = limiteInferior;
        propertyChangeSupport.firePropertyChange(PROP_INTERVALOCLASSE, oldIntervaloClasse, limiteInferior);
    }

    public static final String PROP_AMPLITUDETOTAL = "amplitudeTotal";

    /**
     * Get the value of amplitude
     *
     * @return the value of amplitude
     */
    public double getAmplitudeTotal() {
        return amplitude;
    }

    /**
     * Set the value of amplitude
     *
     * @param amplitudeTotal new value of amplitude
     */
    public void setAmplitudeTotal(double amplitudeTotal) {
        double oldAmplitudeTotal = this.amplitude;
        this.amplitude = amplitudeTotal;
        propertyChangeSupport.firePropertyChange(PROP_AMPLITUDETOTAL, oldAmplitudeTotal, amplitudeTotal);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
@Override
    public int compareTo(VariavelContinua o) {
        int verificaClasse = (int)o.getClasse();
        return (int)this.classe-verificaClasse;
    }
}
