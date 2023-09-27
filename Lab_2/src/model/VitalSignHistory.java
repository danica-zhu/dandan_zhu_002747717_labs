/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danica
 */
import java.util.ArrayList;
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();
        
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }

    public VitalSigns addNewVitals() {
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);// using add function of arraylist
        return newVitals;

    }

    public void deleteVitals(VitalSigns vs) {
        history.remove(vs);
    }
    
    
}
