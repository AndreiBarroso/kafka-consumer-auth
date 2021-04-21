package br.mil.fab.ccarj.kafka.consumer.model;


import java.io.Serializable;


public class ProfileMessage implements Serializable {
    private String name;
    private String clientId;

    public ProfileMessage(String name, String clientId) {
        this.name = name;
        this.clientId = clientId;
    }

    public ProfileMessage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "ProfileMessage{" +
                "name='" + name + '\'' +
                ", clientId='" + clientId + '\'' +
                '}';
    }
}
