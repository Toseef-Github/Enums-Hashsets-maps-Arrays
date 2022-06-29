package qa.com.enums;

public enum Country {

	ENGLAND(130279f, 8.982f),
	FRANCE(543940f, 2.161f),
	GERMANY(357588f, 3.645f),
	SPAIN(505990f, 3.223f );
	
    private final float landAreaKm;
    private final float population;
    
    private Country(float landAreaKm, float population) {
    	this.landAreaKm = landAreaKm;
    	this.population = population;
    	
    }
    	
    public String details() {
    	return "Land Area in Km^2: " + landAreaKm + " Population (in millions) : " + population;
    	
   
    }	
    	public String populationDensity() {
    	return "Population Density = " + (population / landAreaKm);
    	
    }
    	
    }
    
	
	