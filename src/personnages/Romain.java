package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int ForceCoup) {
		if (ForceCoup < this.force) {
			this.force = this.force - ForceCoup;
			parler("Aïe");
		}
		else {
			parler("J'abandonne !");
		}
	}

}
