package Configuration;

import java.util.Date;
import java.util.LinkedList;

public class TwitterFlumeConstants {
	// Twitter Configuration Security
	public static final String CONSUMER_KEY_KEY = "consumerKey";
	public static final String CONSUMER_SECRET_KEY = "consumerSecret";
	public static final String ACCESS_TOKEN_KEY = "accessToken";
	public static final String ACCESS_TOKEN_SECRET_KEY = "accessTokenSecret";

	// Flume Configuration
	public static final String BATCH_SIZE_KEY = "batchSize";
	public static final long DEFAULT_BATCH_SIZE = 1000L;

	// The Types Of Communities
	public static final int SUBSCRIPTIONS = 1;
	// This The Defaults If no Specification was Given
	public static final int LIKES = 2;
	public static final int HASHTAGS = 3;
	public static final int COMMENTS = 4;

	/***
	 * 
	 *
	 *
	 *	This part Exist only to test Issues
	 *
	 *
	 *
	 * The TwitterData.Authenticating Accounts
	 */
	public static LinkedList<Authenticating> All_Authenticating_Accounts;

	/* Setting Up The Accounts */
	public static void startAccounts() {

		All_Authenticating_Accounts = new LinkedList<>();
		// Account 1
		All_Authenticating_Accounts.add(
				new Authenticating("3AgNnLYh6kmNYt7QUAmoC4SK6", "lGEe19YE2ND5rWaZOSoKG68FSme5jlMZTHKUGFG4cYPGkduZUz",
						"4025396657-oRPuJ6XCkfFRwNlUi3vAJYU6f5tyk0LUxBDTvSU",
						"22sai4zyRRekVoOtmZkqx1sOk4bSpbt7DHO2W3FopcUix", "ACCOUNT 1"));
		// Account 2
		All_Authenticating_Accounts.add(
				new Authenticating("HvmpVjdQLDyMLMdY1ffzF5Q16", "6YEBcRb8trBiXYdHJM9Qp02fXFOQ5a0RgQdSbn4aDtaZ2EeeGc",
						"4025396657-urkrXwGDBQNb1rQnflGLuehnxJhH9rXxUvxA2Pw",
						"psXPYFVHML2MoAta9Yism6t3IA0nc7AhEKbNfISyD4mo6", "ACCOUNT 2"));
		// Account 3
		All_Authenticating_Accounts.add(
				new Authenticating("V3o4GkXiNsCKMuQBzC5XkAslG", "Xtkl4GFYTJ6zSpNIAlRqzh9d3gfVcggvDAvOEBKVI5eoqqfsF8",
						"4025396657-DpGo8NzCaBmtoUykZYfsvrFwEeAUwStFD4dDCpr",
						"zslEk3sIuUeflLUXmo4bbPaOqReJcCgkmrNdOru55ydgO", "ACCOUNT 3"));
		// Account 4
		All_Authenticating_Accounts.add(
				new Authenticating("24DksxHeoEVjmoi4M654iBa3A", "w2xAC7IIpoY6vO0FkE5AVCai08vr0HKuypWJAbgw8CvRSt67l3",
						"4025396657-FrwgPG8yC2WhwLQWY0DwpYk9ObuWdydXsDFqs6w",
						"LFPZMbSRUzLs2YrAuNG5kaXXJll3XN1gLHnMNG825exUi", "ACCOUNT 4"));
		// Account 5
		All_Authenticating_Accounts.add(
				new Authenticating("GNbGbKqeJuDs0LxFPQwTKUJNm", "etM581WldPpuxWsPOvm9OhsEPG1LBDvIjV7QbOD52bCy5n8wDY",
						"4025396657-khZU3VfQAjAdClWCnWpw96rtZcD9PEtYmmbPWqr",
						"aX3EvntTJscfmSj22TKvpn4QNqqa6aLqcxjCH4YxFDxOT", "ACCOUNT 5"));
		All_Authenticating_Accounts.add(
				new Authenticating("qRdYW9p7NXqRYLX5GMJlxiHRT", "PBCPyqQZYejHdMK3ZEd2sYVwpbuSZlaxXZBSB4KTMaW4GE0NAV",
						"985804949845151744-2E7mvoToWKnn82NvMPeaMGuPhN1AQcF",
						"2zaXfr6asZGcg1j82XT0D3q5Pxm3zADqcaicw96198yJm", "ACCOUNT 6"));
		All_Authenticating_Accounts.add(
				new Authenticating("edcVu4N7d0HhIHxZfAk8WIleg", "CyJksb24xJ87w1n7Rhq8SN5EwnNd3LRpkNWUo5rijIdJH6r027",
						"985804949845151744-ZVOkrVewwvK1GLzLV5jIaKcQ1aCc5rj",
						"sOVjNrjxHvT8MPuvhC9vDWAV6HRzDWYXq3UKXTqDzpRJa", "ACCOUNT 7"));
		All_Authenticating_Accounts.add(
				new Authenticating("vIB9YsgJl10GFJJugvSOsFbGM", "utXsIjXDS36AJA3x3Bx6oRtvPytHZLTOjAOWtSlzePsiNMj19T",
						"985804949845151744-bha2YUKo7f4q8hyU1DR13JfUF79uVXh",
						"UqjFflLzMf6tRX0jaI6DgEomGapBFK4btFN0KxFnx3B33", "ACCOUNT 8"));
		All_Authenticating_Accounts.add(
				new Authenticating("lnmTCafc0oNBlxvBlZKNKjiwr", "HrhZI6met3RNHIC1jaOSF1cbOgk1tyR2iSBj7TbLit9KsDJxWg",
						"4025396657-fCmMTddpCoGLmDMwz127HWDOsfNdujf2kO6PzhF",
						"QitCAad0DGP7isBVIGGftY6ZkaXr5i6NSTvtMU7cBkfcT", "ACCOUNT 9"));

	}

}
