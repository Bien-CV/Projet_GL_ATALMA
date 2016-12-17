package core;

public class VolumeHoraire {

	public Integer h;
	public Integer m;
	public String categorieDeCours;
	
	
	public VolumeHoraire toEqTD(){
		
		if ( categorieDeCours.equals("TD")){
			return this;
		}else if ( categorieDeCours.equals("CM")){
			Integer mTotal=h*60+m;
			Integer hConverti=0;
			Integer mConverti=0;
			mTotal=mTotal+(mTotal/2);
			if ( mTotal >= 60 ){
				hConverti= mTotal/60;
				mConverti=mTotal%60;
			}else if ( mConverti >= 0){
				hConverti=0;
				mConverti=mTotal;
			}
			VolumeHoraire volumeConverti = new VolumeHoraire(hConverti,mConverti,"TD");
			return volumeConverti;
		}else if ( categorieDeCours.equals("TP")){
			Integer mTotal=h*60+m;
			Integer hConverti=0;
			Integer mConverti=0;
			mTotal=mTotal-(mTotal/3);
			if ( mTotal >= 60 ){
				hConverti= mTotal/60;
				mConverti=mTotal%60;
			}else if ( mConverti >= 0){
				hConverti=0;
				mConverti=mTotal;
			}
			VolumeHoraire volumeConverti = new VolumeHoraire(hConverti,mConverti,"TD");
			return volumeConverti;
		}else{
			//TODO lancer exception : la catégorie de cours n'a pas été reconnue
			return new VolumeHoraire(0,0,"TD");
		}
		
	}

	/**
	 * @param h
	 * @param m
	 * @param categorieDeCours
	 */
	public VolumeHoraire(Integer h, Integer m, String categorieDeCours) {
		super();
		this.h = h;
		this.m = m;
		this.categorieDeCours = categorieDeCours;
	}

}
