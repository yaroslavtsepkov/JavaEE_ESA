package com.ssau.JavaEE_ESA.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "public", name = "notes")
@NamedQueries(value = {
        @NamedQuery(name = "Notes.all", query = "select n from Notes n ")
})
public class Notes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_note;

    @Column(name = "id_user")
    private int id_user;

    @Column(name = "content")
    private String content;

    public Notes() {
    }

    public Notes(int id_note, int id_user, String content) {
        this.id_note = id_note;
        this.id_user = id_user;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id_note=" + id_note +
                ", id_user=" + id_user +
                ", content='" + content + '\'' +
                '}';
    }

    public int getId_note() {
        return id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
