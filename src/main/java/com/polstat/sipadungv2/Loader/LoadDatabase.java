package com.polstat.sipadungv2.Loader;

import com.polstat.sipadungv2.dto.DosenDto;
import com.polstat.sipadungv2.dto.MahasiswaDto;
import com.polstat.sipadungv2.entity.Role;
import com.polstat.sipadungv2.entity.User;
import com.polstat.sipadungv2.entity.UserRoleEnum;
import com.polstat.sipadungv2.mapper.DosenMapper;
import com.polstat.sipadungv2.mapper.MahasiswaMapper;
import com.polstat.sipadungv2.repository.RoleRepository;
import com.polstat.sipadungv2.repository.UserRepository;
import java.util.Arrays;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    CommandLineRunner initDatabaseRole(RoleRepository roleRepository) {  
        return args -> {
            log.info("Preloading " + roleRepository.save(new Role(
                    Long.valueOf(1), 
                    UserRoleEnum.ADMIN,null
            )));
            log.info("Preloading " + roleRepository.save(new Role(
                    Long.valueOf(2), 
                    UserRoleEnum.DOSEN,null
            )));
            log.info("Preloading " + roleRepository.save(new Role(
                    Long.valueOf(3), 
                    UserRoleEnum.MAHASISWA,null
            )));
        };
    }
//    
//    @Bean
//    CommandLineRunner initDatabaseUser(UserRepository repository) {
//        if (roleRepository == null) {
//            initDatabaseRole(roleRepository);
//        }
//        Set<Role> adminRole = (Set<Role>) roleRepository.getById(Long.valueOf(1));
//        Set<Role>  dosenRole = (Set<Role>) roleRepository.getById(Long.valueOf(2));
//        Set<Role>  mahasiswaRole = (Set<Role>) roleRepository.getById(Long.valueOf(3));
//        MahasiswaDto mhsDto = new MahasiswaDto();
//        DosenDto dosenDto = new DosenDto();
//    
//        return args -> {
//            log.info("Preloading " + repository.save(new User(
//                    Long.valueOf(1), 
//                    "admin@gmail.com",
//                    passwordEncoder.encode("admin123"), adminRole,MahasiswaMapper.mapToMahasiswa(mhsDto)
//            )));
//            log.info("Preloading " + repository.save(new User(
//                    Long.valueOf(2), 
//                    "dosen@gmail.com",
//                    passwordEncoder.encode("dosen123"),
//                dosenRole,MahasiswaMapper.mapToMahasiswa(mhsDto)
//            )));
//            log.info("Preloading " + repository.save(new User(
//                    Long.valueOf(3), 
//                    "mahasiswa@gmail.com",
//                    passwordEncoder.encode("mahasiswa123"),
//                mahasiswaRole,MahasiswaMapper.mapToMahasiswa(mhsDto)
//            )));
//    };
//}
}