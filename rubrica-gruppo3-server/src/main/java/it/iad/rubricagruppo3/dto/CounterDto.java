package it.iad.rubricagruppo3.dto;

public class CounterDto {
    private int numeroContatti;

    public CounterDto() {
    }

    public CounterDto(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }

    public int getNumeroContatti() {
        return numeroContatti;
    }

    public void setNumeroContatti(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }
}
