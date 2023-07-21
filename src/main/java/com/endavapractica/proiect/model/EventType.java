package com.endavapractica.proiect.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="EventType")
public class EventType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_type_id")
    private Integer eventTypeId;

    @Column(name="event_type_name")
    private String name;


}
