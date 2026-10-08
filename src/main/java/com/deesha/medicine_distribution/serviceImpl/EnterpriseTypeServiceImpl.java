//package com.deesha.medicine_distribution.serviceImpl;
//
//import com.deesha.medicine_distribution.model.EnterpriseType;
//import com.deesha.medicine_distribution.repository.EnterpriseTypeRepository;
//import com.deesha.medicine_distribution.service.EnterpriseTypeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//@Transactional
//public class EnterpriseTypeServiceImpl implements EnterpriseTypeService {
//
//    private final EnterpriseTypeRepository repository;
//
//    @Override
//    public EnterpriseType create(EnterpriseType enterpriseType) {
//        enterpriseType.setEnterpriseTypeId(null); // force INSERT
//        return repository.save(enterpriseType);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<EnterpriseType> getAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public EnterpriseType getById(Integer id) {
//        return repository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "EnterpriseType not found with id: " + id));
//    }
//
//    @Override
//    public EnterpriseType update(Integer id, EnterpriseType enterpriseType) {
//        EnterpriseType existing = getById(id);
//        existing.setEnterpriseType(enterpriseType.getEnterpriseType());
//        existing.setActive(enterpriseType.isActive());
//        return repository.save(existing);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        EnterpriseType existing = getById(id);
//        repository.delete(existing);
//    }
//}
