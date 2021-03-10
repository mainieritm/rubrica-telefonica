package it.iad.rubricagruppo3.dto;

public class CounterDto {
    private long numeroContatti;

    public CounterDto() {
    }

    public CounterDto(long numeroContatti) {
        this.numeroContatti = numeroContatti;
    }

    public long getNumeroContatti() {
        return numeroContatti;
    }

    public void setNumeroContatti(long numeroContatti) {
        this.numeroContatti = numeroContatti;
    }
}
