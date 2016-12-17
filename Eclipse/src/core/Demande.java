/**
 * 
 */
package core;
/**
 * @author Baptiste
 *
 */
public class Demande {
	
	public String nomModule;
	public String categorieDeCours;
	public Integer volumeEtudiant;
	public Integer nbGroupes;
	public VolumeHoraire volumeHoraire;
	public Integer classement;
	public boolean isPublished;
	
	public String getNomModule() {
		return nomModule;
	}
	public String getCategorieDeCours() {
		return categorieDeCours;
	}
	public Integer getVolumeEtudiant() {
		return volumeEtudiant;
	}
	public Integer getNbGroupes() {
		return nbGroupes;
	}
	public VolumeHoraire getVolumeHoraire() {
		return volumeHoraire;
	}
	public Integer getClassement() {
		return classement;
	}
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	/**
	 * @param nomModule
	 * @param categorieDeCours
	 * @param volumeEtudiant
	 * @param nbGroupes
	 * @param volumeHoraire
	 * @param classement
	 */
	public Demande(String nomModule, String categorieDeCours, Integer volumeEtudiant, Integer nbGroupes,
			VolumeHoraire volumeHoraire, Integer classement) {
		super();
		this.nomModule = nomModule;
		this.categorieDeCours = categorieDeCours;
		this.volumeEtudiant = volumeEtudiant;
		this.nbGroupes = nbGroupes;
		this.volumeHoraire = volumeHoraire;
		this.classement = classement;
		this.isPublished = false;
	}
	
	
	
}
