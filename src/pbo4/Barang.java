package pbo4;
import java.io. *;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	
	public int getStok() {
		return this.stok;
	}


	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public void addStok(int jumlah) {
		this.stok += jumlah;
	}


	public Barang(String kode, String nama, int stk) {
	this.kode_barang = kode;
	this.nama_barang = nama;
	this.stok = stk;
	}
}