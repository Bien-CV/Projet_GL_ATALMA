/**
 * 
 */
package core;

/**
 * @author Baptiste
 *
 */
public class Voeu extends Demande {

	public Integer getPreference() {
		return preference;
	}

	public void setPreference(Integer preference) {
		this.preference = preference;
	}

	public Integer preference;

	/**
	 * @param nomModule
	 * @param categorieDeCours
	 * @param volumeEtudiant
	 * @param nbGroupes
	 * @param volumeHoraire
	 * @param classement
	 * @param preference
	 */
	public Voeu(String nomModule, String categorieDeCours, Integer volumeEtudiant, Integer nbGroupes,
			VolumeHoraire volumeHoraire, Integer classement, Integer preference) {
		super(nomModule, categorieDeCours, volumeEtudiant, nbGroupes, volumeHoraire, classement);
		this.preference = preference;
	}
	
	

}
