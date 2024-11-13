package com.polstat.sipadungv2.dto;

import com.polstat.sipadungv2.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MahasiswaDto {
    private Long id;
    
    private String nim;
    
    private String nama;
    
    //private User user;
    //private DosenDto dosen_pa;
}
