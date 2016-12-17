/**
 * 
 */
package core;

import java.util.Date;

/**
 * @author Baptiste
 *
 */
public class Contrat {

	public Integer nbHeuresMin;
	public Integer nbHeuresMax;
	public Date dateDeDebut;
	
	public Contrat(Integer nbHeuresMin, Integer nbHeuresMax, Date dateDeDebut) {
		super();
		this.nbHeuresMin = nbHeuresMin;
		this.nbHeuresMax = nbHeuresMax;
		this.dateDeDebut = dateDeDebut;
	}
	
	
}
