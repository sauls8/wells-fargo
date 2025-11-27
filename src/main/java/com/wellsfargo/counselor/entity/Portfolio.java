package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){

    }

    public Portfolio(Client client, String creationDate){

        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Client getClient(){
        return this.client;
    }

    public String getCreationDate(){
        return this.creationDate;
    }

    public void setCreationDate( String newCreationDate){
        this.creationDate = newCreationDate;
    }
    



    
}
