package com.iamonsters.iamonsters_1.__SNAPSHOT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
//		PlayersRepository playersRepository = new PlayersRepository();
//		List<Players> players = playersRepository.findPlayerByIdAndUsername();
//		players.forEach(System.out::println);
//		Players player = playersRepository.findPlayerById(1).orElseThrow();
//		System.out.println(player);

//		List<Players> players = new ArrayList<>();
//		Players player2 = new Players(3, "test2", "male", 0, 0, 0, "test", "test", "test", 1);
//		playersRepository.delete(3);
//		playersRepository.save(player2);
//		players.add(player2);
//		players.forEach(System.out::println);
//		System.out.println("------------------------------------");
//		players = playersRepository.findAll();
//		players.forEach(System.out::println);


//		 La methode findById retourne le monstre du joueur en parametre avec son nom
//		PlayerMonstersRepository playerMonstersRepository = new PlayerMonstersRepository();
//		PlayerMonsters playerMonsters = playerMonstersRepository.findById(1).orElseThrow();
//		System.out.println(playerMonsters);


	}

}
