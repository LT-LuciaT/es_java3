package it.epicode.esercizio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Automobile {
private String marca;
private String modello;
private int anno;
private double prezzo;
private Allestimento[] allestimentos = new Allestimento[5];
}
