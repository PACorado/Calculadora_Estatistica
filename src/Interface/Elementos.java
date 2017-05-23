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
 * @author asus
 */
public class Elementos implements Comparable<Elementos>{
    
    private double xi;

    private int fi;

    public Elementos(double xi, int fi) {
        this.xi = xi;
        this.fi = fi;
    }

    public static final String PROP_FI = "fi";

    public int getFi() {
        return fi;
    }

    public void setFi(int fi) {
        int oldFi = this.fi;
        this.fi = fi;
        propertyChangeSupport.firePropertyChange(PROP_FI, oldFi, fi);
    }

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
    
    @Override
    public int compareTo(Elementos o) {
        int verificaXi = (int)o.getXi();
        return (int)this.xi-verificaXi;
    }

    
}
