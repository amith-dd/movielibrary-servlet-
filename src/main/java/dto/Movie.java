package dto;

import java.util.Arrays;

public class Movie {
	
	private int movieid;
	private String moviename;
	private double movieprice;
	private double movierating;
	private String moviegenre;
	private String movielanguage;
	private byte[] movieimage;
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public double getMovieprice() {
		return movieprice;
	}
	public void setMovieprice(double movieprice) {
		this.movieprice = movieprice;
	}
	public double getMovierating() {
		return movierating;
	}
	public void setMovierating(double movierating) {
		this.movierating = movierating;
	}
	public String getMoviegenre() {
		return moviegenre;
	}
	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}
	public String getMovielanguage() {
		return movielanguage;
	}
	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}
	public byte[] getMovieimage() {
		return movieimage;
	}
	public void setMovieimage(byte[] movieimage) {
		this.movieimage = movieimage;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", movieprice=" + movieprice
				+ ", movierating=" + movierating + ", moviegenre=" + moviegenre + ", movielanguage=" + movielanguage
				+ ", movieimage=" + Arrays.toString(movieimage) + "]";
	}
	
	
	
}
