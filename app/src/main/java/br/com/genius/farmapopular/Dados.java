package br.com.genius.farmapopular;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Desenvolvimento on 16/05/2017.
 */

public class Dados {
    private String CodIbge;
    private String UF;
    private String Municipio;
    private String Farmacia;
    private String Endereco;
    private String Bairro;
    private String Cep;
    private String DDD;
    private String Telefone;
    private String Email;
    private String CnpjFarmacia;
    private String CnpjMatriz;
    private String Ano;
    private String Mes;

    public String getCodIbge() {
        return CodIbge;
    }

    public void setCodIbge(String codIbge) {
        CodIbge = codIbge;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getFarmacia() {
        return Farmacia;
    }

    public void setFarmacia(String farmacia) {
        Farmacia = farmacia;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCnpjFarmacia() {
        return CnpjFarmacia;
    }

    public void setCnpjFarmacia(String cnpjFarmacia) {
        CnpjFarmacia = cnpjFarmacia;
    }

    public String getCnpjMatriz() {
        return CnpjMatriz;
    }

    public void setCnpjMatriz(String cnpjMatriz) {
        CnpjMatriz = cnpjMatriz;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }
}
