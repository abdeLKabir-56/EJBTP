package metier.entities;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface BanqueRemote {
	public Compte addCompte(Compte cp);
	public Compte getCompte(Long code);
	public List<Compte> listCompte();
	public void verserMontant(Long code,double montant);
	public void retirerMontant(Long code,double montant);
	public void virement(Long code1,Long code2,double montant);
}
