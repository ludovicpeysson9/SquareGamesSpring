package com.macaplix.squareGames.dto;

public record GameTypeInfo( int index, String defaultName, String localName, int defaultPlayerCount, int minPlayerCount, int maxPlayerCount, int defaultBoardSize, int minBoardSize, int maxBoardSize )
{

}
