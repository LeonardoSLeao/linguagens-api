package br.com.leaoconsultores.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "linguagens-api")
public class Linguagem {

	@Id
	private String id;
	private String title;
	private String urlImage;
	private String ranking;

	public Linguagem() {

	}

	public Linguagem(String title, String urlImage, String ranking) {
		super();
		this.title = title;
		this.urlImage = urlImage;
		this.ranking = ranking;
	}

	public String getTitle() {
		return title;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public String getRanking() {
		return ranking;
	}

	public String getId() {
		return id;
	}

}
