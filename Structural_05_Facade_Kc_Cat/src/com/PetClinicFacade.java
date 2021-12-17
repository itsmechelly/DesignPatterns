package com;

import java.util.Arrays;
import java.util.List;

public class PetClinicFacade {

	private CatDBDAO catDBDAO ;

	public PetClinicFacade() {
		this.catDBDAO = new CatDBDAO();
	}

	public void addCat(Cat cat) {
		this.catDBDAO.addCat(cat);
	}

	public void updateCat(Cat cat) {
		this.catDBDAO.updateCat(cat);
	}

	public void DeleteCat(Cat cat) {
		this.catDBDAO.updateCat(cat);
	}

	public List<Cat> getAllCats() {
		return this.catDBDAO.getAllCats();
	}

	public Cat getSingleCat(int id) {
		return this.catDBDAO.getSingleCat(id);
	}

}
