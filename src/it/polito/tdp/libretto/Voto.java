package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
    private int voto;
    private String corso;
    //  private String data; E' SBAGLIATISSIMO DICHIARARE UNA DATA(OGGETTO) COME STRING
    //private Calendar data; FINO A JAVA6 ERA L'UNICO MODO PER GESTIRE LE DATE
    //FARE MOLTA ATTENIONE ALLA GESTIONE DELLE DATE!
    private LocalDate data ; //A PARTIRE DA JAVA 7 ESISTE UNA LIBRERIA CHE CI CONSENTE DI LAVORARE MEGLIO CON LE DATE
	
    public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
    
    
}
