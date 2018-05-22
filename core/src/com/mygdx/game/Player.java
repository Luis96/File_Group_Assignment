package com.mygdx.game;

public class Player
{
    private String playerUsername;

    private double playerHealthAmount;
    private double playerEmotionAmount;
    private double playerHygieneAmount;
    private double playerMoneyAmount;
    private double playerStrikeAmount;

    public String getPlayerUsername()
    {
        return playerUsername;
    }

    public void setPlayerUsername(String playerUsername)
    {
        this.playerUsername = playerUsername;
    }

    public double getPlayerHealthAmount()
    {
        return playerHealthAmount;
    }

    public void setPlayerHealthAmount(double playerHealthAmount)
    {
        this.playerHealthAmount = playerHealthAmount;
    }

    public void addPlayerHealthAmount(double amount)
    {
        setPlayerHealthAmount(playerHealthAmount + amount);
    }

    public double getPlayerEmotionAmount()
    {
        return playerEmotionAmount;
    }

    public void setPlayerEmotionAmount(double playerEmotionAmount)
    {
        this.playerEmotionAmount = playerEmotionAmount;
    }

    public void addPlayerEmotionAmount(double amount)
    {
        setPlayerEmotionAmount(playerEmotionAmount + amount);
    }

    public double getPlayerHygieneAmount()
    {
        return playerHygieneAmount;
    }

    public void setPlayerHygieneAmount(double playerHygieneAmount)
    {
        this.playerHygieneAmount = playerHygieneAmount;
    }

    public void addPlayerHygieneAmount(double amount)
    {
        setPlayerHygieneAmount(playerHygieneAmount + amount);
    }

    public double getPlayerMoneyAmount()
    {
        return playerMoneyAmount;
    }

    public void setPlayerMoneyAmount(double playerMoneyAmount)
    {
        this.playerMoneyAmount = playerMoneyAmount;
    }

    public void addPlayerMoneyAmount(double amount)
    {
        setPlayerMoneyAmount(playerMoneyAmount + amount);
    }

    public double getPlayerStrikeAmount()
    {
        return playerStrikeAmount;
    }

    public void setPlayerStrikeAmount(double playerStrikeAmount)
    {
        this.playerStrikeAmount = playerStrikeAmount;
    }

    public void addPlayerStrikeAmount(double amount)
    {
        setPlayerStrikeAmount(playerStrikeAmount + amount);
    }

    public Player(String playerUsername)
    {
        this.playerUsername = playerUsername;

        playerHealthAmount = 0.0;
        playerEmotionAmount = 0.0;
        playerHealthAmount = 0.0;
        playerMoneyAmount = 0.0;
        playerStrikeAmount = 0.0;
    }
}