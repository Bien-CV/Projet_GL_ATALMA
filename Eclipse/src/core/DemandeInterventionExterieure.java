/**
 * 
 */
package core;

/**
 * @author Baptiste
 *
 */
public class DemandeInterventionExterieure extends Demande {

	/**
	 * 
	 */
	public String organisation;

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	/**
	 * @param nomModule
	 * @param categorieDeCours
	 * @param volumeEtudiant
	 * @param nbGroupes
	 * @param volumeHoraire
	 * @param classement
	 * @param organisation
	 */
	public DemandeInterventionExterieure(String nomModule, String categorieDeCours, Integer volumeEtudiant,
			Integer nbGroupes, VolumeHoraire volumeHoraire, Integer classement, String organisation) {
		super(nomModule, categorieDeCours, volumeEtudiant, nbGroupes, volumeHoraire, classement);
		this.organisation = organisation;
	}

	
	
	

}
