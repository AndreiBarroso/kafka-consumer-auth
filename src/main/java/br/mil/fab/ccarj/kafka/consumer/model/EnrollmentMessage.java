package br.mil.fab.ccarj.kafka.consumer.model;



import java.io.Serializable;
import java.util.List;


public class EnrollmentMessage implements Serializable {
    private OperationType operation;
    private String cpf;
    private List<ProfileMessage> perfis;

    public EnrollmentMessage() {
    }

    public EnrollmentMessage(OperationType operation, String cpf, List<ProfileMessage> perfis) {
        this.operation = operation;
        this.cpf = cpf;
        this.perfis = perfis;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ProfileMessage> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<ProfileMessage> perfis) {
        this.perfis = perfis;
    }

    @Override
    public String toString() {
        return "EnrollmentMessage{" +
                "operation=" + operation +
                ", cpf='" + cpf + '\'' +
                ", perfis=" + perfis +
                '}';
    }
}

