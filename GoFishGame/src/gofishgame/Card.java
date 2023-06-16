/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofishgame;

/**
 *
 * @author shlok
 */
public class Card implements Comparable<Card> {
    private String rank;

    public Card(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank;
    }

    @Override
    public int compareTo(Card other) {
        int rank1 = getCardRank(this.rank);
        int rank2 = getCardRank(other.rank);
        return Integer.compare(rank1, rank2);
    }

    private int getCardRank(String card) {
        String rank = card.substring(0, card.length() - 1);
        if (rank.equals("A")) {
            return 1;
        } else if (rank.equals("K")) {
            return 13;
        } else if (rank.equals("Q")) {
            return 12;
        } else if (rank.equals("J")) {
            return 11;
        } else {
            return Integer.parseInt(rank);
        }
    }
}

