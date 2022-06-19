/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projenesne;

/**
 *
 * @author AYDINKAĞANTÜRKOĞLU
 */
public abstract class Customer {
    private String CitizenshipNr;
    private String name,tel,mail;

    public String getCitizenshipNr() {
        return CitizenshipNr;
    }

    public void setCitizenshipNr(String CitizenshipNr) {
        this.CitizenshipNr = CitizenshipNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Customer(String CitizenshipNr) {
        this.CitizenshipNr = CitizenshipNr;
    }
}
