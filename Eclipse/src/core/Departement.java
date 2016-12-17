/**
 * 
 */
package core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baptiste
 *
 */
public class Departement {
	public List<Enseignant> listeDesEnseignants ;
	public List<Parcours> listeDesParcours ;
	public String nom;
	
	public Departement(List<Enseignant> listeDesEnseignants, List<Parcours> listeDesParcours, String nom) {
		super();
		this.listeDesEnseignants = listeDesEnseignants;
		this.listeDesParcours = listeDesParcours;
		this.nom = nom;
	}
	public Departement(String nom) {
		super();
		listeDesEnseignants = new ArrayList<Enseignant>();
		listeDesParcours = new ArrayList<Parcours>();
		this.nom = nom;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Enseignant> getListeDesEnseignants() {
		return listeDesEnseignants;
	}
	public List<Parcours> getListeDesParcours() {
		return listeDesParcours;
	}
	
	
}
