package controller;

import dao.filmlerDAO;
import dao.kategorilerDAO;
import entity.filmler;
import entity.kategoriler;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class filmlerController implements Serializable {

    private List<filmler> flist;
    private filmler filmler;
    private filmlerDAO filmDAO;
    
    private List<kategoriler> klist;
    
    private kategorilerDAO kdao;
    private int selectedKategori;
    
    public String delete(filmler film) throws InstantiationException, SQLException, IllegalAccessException{
        this.getFilmDAO().delete(film);
        return "index";
    }
    
    public String updateForm(filmler film){
        this.filmler = film;
        return "index";
    }
    
    public String update()throws InstantiationException, IllegalAccessException, SQLException{
        this.getFilmDAO().update(this.filmler);
        return "index";
    }

    public String create() throws InstantiationException, IllegalAccessException, SQLException {
        this.getFilmDAO().create(this.filmler, selectedKategori);
        return  "filmler"; 
    }
    
    public filmler getFilmler() {
        if (this.filmler == null) {
            this.filmler = new filmler();
        }
        return filmler;
    }

    public List<filmler> getFlist() throws InstantiationException, IllegalAccessException, SQLException {
        this.flist  = this.getFilmDAO().findAll();
        return flist;
    }

    public void setFlist(List<filmler> flist) {
        this.flist = flist;
    }

    public filmlerDAO getFilmDAO() {
        if(this.filmDAO == null){
            this.filmDAO = new filmlerDAO();
        }
        return filmDAO;
    }

    public void setFilmDAO(filmlerDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    public int getSelectedKategori() {
        return selectedKategori;
    }

    public void setSelectedKategori(int selectedKategori) {
        this.selectedKategori = selectedKategori;
    }

    public kategorilerDAO getKdao() {
        if(this.kdao == null){
            this.kdao = new kategorilerDAO();
        }
        return kdao;
    }

    public List<kategoriler> getKlist() throws InstantiationException, IllegalAccessException, SQLException {
        this.klist = this.getKdao().getKategori();
        return klist;
    }

    public void setKlist(List<kategoriler> klist) {
        this.klist = klist;
    }

}
