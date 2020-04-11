package io.github.tubean.eureka.image.entity;

public class Ticket {
    private int id;
    private String ngaydi;
    private String ngayve;
    private String noidinoiden;
    private String songuoi;

    public Ticket(int id, String ngaydi, String ngayve, String noidinoiden, String songuoi) {
		super();
		this.id = id;
		this.ngaydi = ngaydi;
		this.ngayve = ngayve;
		this.noidinoiden = noidinoiden;
		this.songuoi = songuoi;
	}
	public Ticket() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNgaydi() {
		return ngaydi;
	}
	public void setNgaydi(String ngaydi) {
		this.ngaydi = ngaydi;
	}
	public String getNgayve() {
		return ngayve;
	}
	public void setNgayve(String ngayve) {
		this.ngayve = ngayve;
	}
	public String getNoidinoiden() {
		return noidinoiden;
	}
	public void setNoidinoiden(String noidinoiden) {
		this.noidinoiden = noidinoiden;
	}
	public String getSonguoi() {
		return songuoi;
	}
	public void setSonguoi(String songuoi) {
		this.songuoi = songuoi;
	}	
}
