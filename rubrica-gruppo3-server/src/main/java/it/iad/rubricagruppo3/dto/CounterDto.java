package it.iad.rubricagruppo3.dto;

public class CounterDto {
    private long numeroContatti;

    public CounterDto() {
    }

    public CounterDto(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }

    public long getNumeroContatti() {
        return numeroContatti;
    }

    public void setNumeroContatti(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }
}
