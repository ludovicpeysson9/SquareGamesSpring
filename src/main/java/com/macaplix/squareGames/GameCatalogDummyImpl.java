package com.macaplix.squareGames;

import fr.le_campus_numerique.square_games.engine.connectfour.ConnectFourGameFactory;
import fr.le_campus_numerique.square_games.engine.taquin.TaquinGameFactory;
import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGameFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
@Service
public class GameCatalogDummyImpl implements GameCatalog {
    private TicTacToeGameFactory ticTacToeGameFactory;
    GameCatalogDummyImpl()
    {
        ticTacToeGameFactory = new TicTacToeGameFactory();
    }
    public Collection<String> getGameIdentifiers()
    {
        //return List.of(ticTacToeGameFactory.getId());
        return List.of(ticTacToeGameFactory.getId(), (new TaquinGameFactory()).getId(), (new ConnectFourGameFactory()).getId());
    }
}
