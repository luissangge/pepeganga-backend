package uy.com.pepeganga.userservice.service;

import org.springframework.stereotype.Service;
import uy.com.pepeganga.business.common.entities.Role;
import uy.com.pepeganga.userservice.repository.RoleRepository;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}
