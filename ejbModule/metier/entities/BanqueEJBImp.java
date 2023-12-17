package metier.entities;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless(name = "Banque")
public class BanqueEJBImp implements BanqueRemote,BanqueLocal{

	@PersistenceContext
	private EntityManager em;
	@Override
	public Compte addCompte(Compte cp) {
		
		 em.persist(cp);
		return cp;
		 
	}

	@Override
	public Compte getCompte(Long code) {
		Compte cp = em.find(Compte.class, code);
		if(cp == null) throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@Override
	public List<Compte> listCompte() {
		Query re=em.createQuery("select c from Compte c");
		return re.getResultList();
	}

	@Override
	public void verserMontant(Long code, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirerMontant(Long code, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virement(Long code1, Long code2, double montant) {
		// TODO Auto-generated method stub
		
	}
	

}
