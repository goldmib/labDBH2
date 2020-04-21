package app.model;

import javax.persistence.*;

@Entity

public class Words {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String word;
    private int value_train;
    private int value_test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getValue_train() { return value_train; }

    public void setValue_train(int value_train) { this.value_train = value_train; }

    public int getValue_test() { return value_test; }

    public void setValue_test(int value_test) { this.value_test = value_test; }


    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", test='" + value_test + '\'' +
                ", train=" + value_train +
                '}';
    }

}
