package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//para mapear o objeto Game para que ele vire um registro na tabela de Games no banco relacional criamos a Entity
// Entity configura a classe Game java para que seja equivalente a uma tabela do banco relacional
@Entity
@Table(name = "tb_game")
public class Game {

	//atributos do game demonstrados no diagrama no git
	@Id //para configurar o Id como chave primaria na tabela do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // para que o Id seja auto implementado no banco
	private Long id;
	private String title;
	
	@Column(name = "game_year")//aqui costumizei o nome da coluna year no banco
	private Integer year;//year é palavra reservada no banco
	private String genre;
	private String plataform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	//construtor sem argumentos
	public Game() {
		
	}

	//construtor com argumentos para se quiser instanciar 
	//o this referencia o dado do próprio objeto
	public Game(Long id, String title, Integer year, String genre, String plataform, String imgUrl,
			String shortDescription, String longDescription) {
		
		this.id = id; // o primeiro id lá emcima é o objeto, este id dessa linha é o argumento do objeto mencionado acima e assim acontece com os abaixo
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plataform = plataform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	// para comparar um jogo com o outro através do id
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
