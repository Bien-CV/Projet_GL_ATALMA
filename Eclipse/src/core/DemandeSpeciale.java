/**
 * 
 */
package core;

/**
 * @author Baptiste
 * \b Sert à représenter les demandes de congé, remplacement ou arrêt maladie d'un enseignant
 */
public class DemandeSpeciale extends Demande {

	/**
	 * 
	 */
	public String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param nomModule
	 * @param categorieDeCours
	 * @param volumeEtudiant
	 * @param nbGroupes
	 * @param volumeHoraire
	 * @param classement
	 * @param type
	 */
	public DemandeSpeciale(String nomModule, String categorieDeCours, Integer volumeEtudiant, Integer nbGroupes,
			VolumeHoraire volumeHoraire, Integer classement, String type) {
		super(nomModule, categorieDeCours, volumeEtudiant, nbGroupes, volumeHoraire, classement);
		this.type = type;
	}
	

}
