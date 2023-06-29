package khem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import khem.model.UserModel;

@Repository
public  interface UserRepository extends JpaRepository<UserModel,Long>, JpaSpecificationExecutor<UserModel>  {
    UserModel findByUsername(String userName);
}
