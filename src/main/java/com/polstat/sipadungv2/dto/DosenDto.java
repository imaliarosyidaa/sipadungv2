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
public class DosenDto {
    private Long id;
    
    private String nip;
    
    private String nama;
    
    private String email;
}