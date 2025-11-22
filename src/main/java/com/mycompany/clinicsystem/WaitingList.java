/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicsystem;

import java.util.*;

/**
 *
 * @author noursameh
 */
public class WaitingList {
    private Patient patient;
    private Date requestTime;

    public WaitingList(Patient patient) {
        this.patient = patient;
        this.requestTime = new Date();
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getRequestTime() {
        return requestTime;
    }
}
