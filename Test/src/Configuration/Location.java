package Configuration;

/***
 * 
 * 
 * @author root
 *
 *         This is A class is for The Creation Of Location and Keep Track of
 *         Them
 */
public class Location {

	private double lang;
	private double latt;
	private String name;

	public Location(double lang, double latt, String name) {
		this.lang = lang;
		this.latt = latt;
		this.name = name;
	}

	public double getLang() {
		return lang;
	}

	public void setLang(double lang) {
		this.lang = lang;
	}

	public double getLatt() {
		return latt;
	}

	public void setLatt(double latt) {
		this.latt = latt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
