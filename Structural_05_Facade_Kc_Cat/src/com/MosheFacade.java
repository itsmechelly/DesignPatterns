package com;

import java.util.List;

public class MosheFacade {
    private CatDBDAO catDBDAO;

    public MosheFacade() {
        this.catDBDAO = new CatDBDAO();
    }

    public void updateCat(Cat cat) {
        this.catDBDAO.updateCat(cat);
    }
//
//	public void DeleteCat(Cat cat) {
//		this.catDBDAO.updateCat(cat);
//	}

    public List<Cat> getAllCats() {
        return this.catDBDAO.getAllCats();
    }

    public Cat getSingleCat(int id) {
        return this.catDBDAO.getSingleCat(id);
    }
}
