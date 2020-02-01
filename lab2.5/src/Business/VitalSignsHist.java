/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author nitya
 */
public class VitalSignsHist {

    private ArrayList<VitalSigns> vitalSignHistory;

    /**
     *
     */
    public VitalSignsHist() {
        vitalSignHistory = new ArrayList<VitalSigns>();

    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> VitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public VitalSigns addVitals() {
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;

    }

    public void deleteVitals(VitalSigns v) {
        vitalSignHistory.remove(v);

    }

    /**
     *
     * @param maxBP
     * @param minBP
     * @return
     */
    public ArrayList<VitalSigns> getAbnormalList(double maxBP, double minBP) {
        ArrayList<VitalSigns> abnList = new ArrayList<>();


        for (VitalSigns vs : vitalSignHistory) {
            if (vs.getBloodPressure() > maxBP || vs.getBloodPressure() < minBP) {
                abnList.add(vs);

            }
        }
        return abnList;

    }
}
