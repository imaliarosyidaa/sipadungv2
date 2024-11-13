package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name= "nim",length=100, nullable = true)
    private String nim;
    
    @Column(name= "nama",length=100, nullable = true)
    private String nama;
    
//    @OneToOne(mappedBy = "profile")
//    private User user;
    
//    @ManyToOne
//    @JoinColumn(referencedColumnName="dosen_id",name= "dosen_pa",nullable = true)
//    private Dosen dosen_pa;
}
