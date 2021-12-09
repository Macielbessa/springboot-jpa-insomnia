package com.examplespring.tarefaspring.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TarefaModel {
        //atribuitos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//A CADA VEZ QUE FOR INSERIDO UM NOVO REGISTRO GERE UM NOVO VALOR
                private Long id;
                private String description;
                private Boolean status;

                public Long getId() {
                    return id;
                }

                public void setId(Long id) {
                    this.id = id;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public Boolean getStatus() {
                    return status;
                }

                public void setStatus(Boolean status) {
                    this.status = status;
                }
}
