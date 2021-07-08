package fr.eni.ihm;

import java.util.List;

import fr.eni.bo.Stagiaire;
import fr.eni.dal.DaoFactory;
import fr.eni.dal.StagiaireDao;

public class ProgPrinc {

	public static void main(String[] args) {
		System.out.println("Bienvenue");
		StagiaireDao sDao = DaoFactory.getStagiaireDao();
		
		System.out.println("Liste initiale : ");
		
		List<Stagiaire> listeS = sDao.findAll();
		for (Stagiaire s : listeS) {
			System.out.println("   - " + s);
		}
		
		Stagiaire s1 = new Stagiaire("Lebleu", "Joe", null, "joelebleu");
		sDao.insert(s1);
		
		
		System.out.println("Liste apres ajout : ");
		
		listeS = sDao.findAll();
		for (Stagiaire s : listeS) {
			System.out.println("   - " + s);
		}

	}
}
