package com.example.back_end.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="image_model")
@NoArgsConstructor
@Data
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String name;
    private String type;
    @Column(length = 50000000)
    private byte[] picByte;

    public ImageModel(String name, String type, byte[] picByte) {
        this.name = name;
        this.type = type;
        this.picByte = picByte;
    }
}
