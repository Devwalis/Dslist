package com.devsuperior.dslist.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class BelongingPK {

        @ManyToOne
        @JoinColumn(name = "game_id")
        private Game game;

        @ManyToOne
        @JoinColumn(name = "list_id")
        private GameList list;



        public Game getGame() {
            return game;
        }



        public void setGame(Game game) {
            this.game = game;
        }



        public GameList getList() {
            return list;
        }



        public void setList(GameList list) {
            this.list = list;
        }



        public BelongingPK() {
        }



        public BelongingPK(Game game, GameList list) {
            this.game = game;
            this.list = list;
        }

         @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BelongingPK)) {
            return false;
        }
        BelongingPK belongingPK = (BelongingPK) o;
        return Objects.equals(game, belongingPK.game) && Objects.equals(list, belongingPK.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }



}
