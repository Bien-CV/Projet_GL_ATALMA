/**
 * 
 */
package core;

import java.util.List;

/**
 * @author Baptiste
 *
 */
public class Departement {
	public List<Enseignant> listeDesEnseignants;
	public List<Parcours> listeDesParcours;
	public String nom;
	
	public Departement(List<Enseignant> listeDesEnseignants, List<Parcours> listeDesParcours, String nom) {
		super();
		this.listeDesEnseignants = listeDesEnseignants;
		this.listeDesParcours = listeDesParcours;
		this.nom = nom;
	}
	
	
}
