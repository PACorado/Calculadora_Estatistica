/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Samuel S. Morais 
 */
public class mtc implements Comparable<mtc>{

    private double fr;

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

    private double fiacr;

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

    public mtc(int fac, double fr, double Fiacr, double xi, int fi) {
        this.fac = fac;
        this.fr = fr;
        this.fiacr = Fiacr;
        this.xi = xi;
        this.fi = fi;
    }

    public mtc(double xi, int fi) {
        this.xi = xi;
        this.fi = fi;
    }
    
    private int fac;

    public static final String PROP_FAC = "fac";

    mtc() {
                this.xi = 0;
        this.fi = 0;

    }

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

    private double xi;

    public static final String PROP_XI = "xi";

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        double oldXi = this.xi;
        this.xi = xi;
        propertyChangeSupport.firePropertyChange(PROP_XI, oldXi, xi);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private int fi;

    public static final String PROP_FI = "fi";

    public int getFi() {
        return fi;
    }

    public void setFi(int fi) {
        int oldFi = this.fi;
        this.fi = fi;
        propertyChangeSupport.firePropertyChange(PROP_FI, oldFi, fi);
    }

    @Override
    public int compareTo(mtc o) {
        int verificaXi = (int)o.getXi();
        return (int)this.xi-verificaXi;
    }

}
