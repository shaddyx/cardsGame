package ua.org.shaddy.cardsgame.config;

import org.springframework.stereotype.Service;

@Service
public class Config {
	private String mongoAddress = "localhost";
	private int mongoPort = 27017;
	private String mongoDb = "game";
	private String gameDataFolder = "./gameData/";
	private String cardsFolder = "cards/";
	
	public String getMongoAddress() {
		return mongoAddress;
	}
	public void setMongoAddress(String mongoAddress) {
		this.mongoAddress = mongoAddress;
	}
	public int getMongoPort() {
		return mongoPort;
	}
	public void setMongoPort(int mongoPort) {
		this.mongoPort = mongoPort;
	}
	public String getMongoDb() {
		return mongoDb;
	}
	public void setMongoDb(String mongoDb) {
		this.mongoDb = mongoDb;
	}
	public String getCardsFolder() {
		return cardsFolder;
	}
	public void setCardsFolder(String cardsFolder) {
		this.cardsFolder = cardsFolder;
	}
	public String getGameDataFolder() {
		return gameDataFolder;
	}
	public void setGameDataFolder(String gameDataFolder) {
		this.gameDataFolder = gameDataFolder;
	}
}
